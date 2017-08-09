package com.acuity.db.services.impl;

import com.acuity.db.AcuityDB;
import com.acuity.db.domain.vertex.impl.RSAccount;
import com.acuity.db.services.DBCollectionService;
import com.acuity.security.Encryption;
import com.arangodb.entity.DocumentDeleteEntity;
import com.arangodb.entity.MultiDocumentEntity;

import java.util.Set;

/**
 * Created by Zach on 8/6/2017.
 */
public class RSAccountService extends DBCollectionService<RSAccount> {

    private static final RSAccountService INSTANCE = new RSAccountService();

    public static RSAccountService getInstance() {
        return INSTANCE;
    }

    public RSAccountService() {
        super(AcuityDB.DB_NAME, "RSAccount", RSAccount.class);
    }


    public MultiDocumentEntity<DocumentDeleteEntity<Void>> deleteAccounts(Set<RSAccount> accounts) {
        MultiDocumentEntity<DocumentDeleteEntity<Void>> result = getCollection().deleteDocuments(accounts);
        accounts.forEach(account -> RSAccountAssignmentService.getInstance().removeByFromID(account.getID()));
        return result;
    }

    public void addRSAccount(String ownerID, String email, String ign, String password, String acuityPassword, String accountEncryptionKey) throws Exception {
        String passwordEncryptionKey = Encryption.decrypt(accountEncryptionKey, acuityPassword, new byte[]{1, 2, 3, 4, 5, 6, 7, 8});
        RSAccount rsAccount = new RSAccount(ownerID, email, ign, Encryption.encrypt(password, passwordEncryptionKey, new byte[]{1, 2, 3, 4, 5, 6, 7, 8}));
        insert(rsAccount);
    }
}
