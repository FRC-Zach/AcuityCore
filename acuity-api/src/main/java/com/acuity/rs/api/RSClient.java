package com.acuity.rs.api;


//Generated by the injector on run.

public interface RSClient extends RSGameEngine {

	int getAudioEffectCount();

	com.acuity.rs.api.RSAudioEffect[] getAudioEffects();

	java.lang.String getAuthCode();

	int getAuthCodeForLogin();

	int getBaseScenceX();

	int getBaseSceneY();

	int[] getBoostedSkillLevels();

	com.acuity.rs.api.RSNodeLinkedList getBoundingBoxes();

	int getCameraPitch();

	int getCameraX();

	int getCameraY();

	int getCameraYaw();

	int getCameraZ();

	int getCanvasHeight();

	int getCanvasWidth();

	java.util.Map getChatLineMap();

	com.acuity.rs.api.RSChatMessages getChatMessages();

	int getClanChatCount();

	java.lang.String getClanChatName();

	java.lang.String getClanChatOwner();

	byte getClanChatRank();

	com.acuity.rs.api.RSClanMember[] getClanMates();

	com.acuity.rs.api.RSNodeLinkedList getClassStructures();

	int getClickX();

	int getClickY();

	com.acuity.rs.api.RSCollisionData[] getCollisionMaps();

	int[] getColorPalette();

	int[] getCOSINE();

	java.lang.String getCurrentDomain();

	int getCurrentWorld();

	int getCurrentWorldMask();

	int getCursorState();

	int getDestinationX();

	int getDestinationY();

	int getDrawingAreaBottom();

	int getDrawingAreaHeight();

	int getDrawingAreaLeft();

	int[] getDrawingAreaPixels();

	int getDrawingAreaRight();

	int getDrawingAreaTop();

	int getDrawingAreaWidth();

	int getEngineCycle();

	com.acuity.rs.api.RSFont getFontp12full();

	int getFPS();

	int getFriendCount();

	com.acuity.rs.api.RSFriendsListMember[] getFriends();

	int getGameState();

	com.acuity.rs.api.RSGrandExchangeOffer[] getGrandExchangeOffers();

	com.acuity.rs.api.RSNodeDeque getGraphicsObjectDeque();

	com.acuity.rs.api.RSNodeDeque[][][] getGroundItemDeque();

	int getHintArrowNpcIndex();

	int getHintArrowType();

	int getHintArrowX();

	int getHintArrowY();

	int getIgnoreCount();

	int getIgnoreCount1();

	com.acuity.rs.api.RSIgnoreListMember[] getIgnores();

	com.acuity.rs.api.RSCacheReferenceTable getIndexInterfaces();

	com.acuity.rs.api.RSCacheReferenceTable getIndexMaps();

	com.acuity.rs.api.RSCacheReferenceTable getIndexModels();

	com.acuity.rs.api.RSCacheReferenceTable getIndexScripts();

	com.acuity.rs.api.RSCacheReferenceTable getIndexSoundEffects();

	com.acuity.rs.api.RSCacheReferenceTable getIndexSprites();

	com.acuity.rs.api.RSCacheReferenceTable getIndexTextures();

	com.acuity.rs.api.RSCacheReferenceTable getIndexTrack1();

	com.acuity.rs.api.RSCacheReferenceTable getIndexTrack2();

	com.acuity.rs.api.RSCacheReferenceTable getIndexWorldMap();

	com.acuity.rs.api.RSHashTable getInterfaceFlags();

	int[] getInterfaceHeights();

	int[] getInterfaceItemTriggers();

	com.acuity.rs.api.RSHashTable getInterfaceNodes();

	int[] getInterfacePositionX();

	int[] getInterfacePositionY();

	int getInterfaceRoot();

	com.acuity.rs.api.RSInterfaceComponent[][] getInterfaces();

	int[] getInterfaceWidths();

	int[] getIntStack();

	com.acuity.rs.api.RSNodeTable getItemModelCache();

	int getItemSelectionState();

	com.acuity.rs.api.RSNodeTable getItemSpriteCache();

	com.acuity.rs.api.RSHashTable getItemTables();

	int getKeyboardIdleTicks();

	java.lang.Object getKeyboardListener();

	long getLastClickTime();

	java.lang.String getLatestSelectedItemName();

	com.acuity.rs.api.RSPlayer getLocalPlayer();

	int getLoginIndex2();

	java.lang.String getLoginResponse1();

	java.lang.String getLoginResponse2();

	java.lang.String getLoginResponse3();

	int getLoginState();

	int getLoginState2();

	int getLoginWindowX();

	int getMapOffset();

	int[] getMapRegions();

	int getMapRotation();

	int getMapScale();

	java.lang.String[] getMenuActions();

	int getMenuHeight();

	int[] getMenuOpcodes();

	int[] getMenuPrimaryArgs();

	int getMenuRowCount();

	int[] getMenuSecondaryArgs();

	java.lang.String[] getMenuTargets();

	int[] getMenuTertiaryArgs();

	int getMenuWidth();

	int getMenuX();

	int getMenuY();

	int getMinimapOffset();

	com.acuity.rs.api.RSModIcon[] getModIcons();

	java.lang.Object getMouse();

	int getMouseIdleTime();

	com.acuity.rs.api.RSMouseRecorder getMouseRecorder();

	int getMouseX();

	int getMouseY();

	com.acuity.rs.api.RSActionPrioritySetting getNpcActionPriority();

	int[] getNpcIndices();

	com.acuity.rs.api.RSNodeTable getNpcModelCache();

	com.acuity.rs.api.RSNpc[] getNpcs();

	int getOnCursorCount();

	int[] getOnSursorUIDs();

	byte[][][] getOverlayIDs();

	byte[][][] getOverlayPaths();

	byte[][][] getOverlayRotations();

	com.acuity.rs.api.RSPacketBuffer getPacket();

	com.acuity.rs.api.RSPacketBuffer getPacket2();

	int getPacketID();

	int getPacketLength();

	java.lang.String getPassword();

	int getPendingClickX();

	int getPendingClickY();

	int getPendingMouseX();

	int getPendingMouseY();

	com.acuity.rs.api.RSNodeDeque getPendingSpawns();

	int getPlane();

	com.acuity.rs.api.RSActionPrioritySetting getPlayerActionPriority();

	java.lang.String[] getPlayerActions();

	int getPlayerIndex();

	int[] getPlayerMenuTypes();

	com.acuity.rs.api.RSPlayer[] getPlayers();

	com.acuity.rs.api.RSPreferences getPreferences();

	com.acuity.rs.api.RSNodeDeque getProjectilesDeque();

	int getPublicChatMode();

	int getRasterAlpha();

	int getRasterClipX();

	int[] getRasterClipY();

	int[] getRealSkillLevels();

	int getRedrawMode();

	int getRevision();

	int getRights();

	java.math.BigInteger getRsaKeyExponent();

	java.math.BigInteger getRsaKeyModulus();

	int getRunEnergy();

	com.acuity.rs.api.RSScene getSceneGraph();

	byte[][][] getSceneRenderRules();

	int[] getScriptLocalInts();

	java.lang.String[] getScriptLocalStrings();

	com.acuity.rs.api.RSScriptState[] getScriptStack();

	int getScriptStackCount();

	java.lang.String[] getScriptStringStack();

	int getScriptStringStackSize();

	int getSelectedRegionTileX();

	int getSelectedRegionTileY();

	int[] getSINE();

	int[] getSkillExperiences();

	int getSocketState();

	int getSpellTargetFlags();

	com.acuity.rs.api.RSNodeTable getSpriteCache();

	int[] getTempVarps();

	int[][][] getTileHeights();

	byte[][][] getUnderlayIDs();

	java.lang.String getUsername();

	int[] getVarps();

	int getViewportHeight();

	int getViewportScale();

	int getViewportWidth();

	int getWeight();

	com.acuity.rs.api.RSWorld[] getWorlds();

	java.lang.Object getWorldServersDownload();

	com.acuity.api.rs.wrappers.peers.engine.Client getWrapper();

	int[][] getXteaKeys();

	void invokeAbsoluteToViewport(int var0, int var1, int var2);

	void invokeAddChatMessage(int var0, java.lang.String var1, java.lang.String var2, java.lang.String var3);

	void invokeAddMenuEntry(java.lang.String var0, java.lang.String var1, int var2, int var3, int var4, int var5);

	int[] invokeBoundingBoxToViewport(int var0, int var1, int var2);

	void invokeGameDraw(com.acuity.rs.api.RSInterfaceComponent[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	com.acuity.rs.api.RSAnimationSequence invokeGetAnimation(int var0);

	com.acuity.rs.api.RSDefinitionProperty invokeGetDefinitionProperty(int var0);

	com.acuity.rs.api.RSFrames invokeGetFrames(int var0);

	com.acuity.rs.api.RSSpotAnimation invokeGetGraphicDefinition(int var0);

	com.acuity.rs.api.RSHitsplatDefinition invokeGetHitsplatDefinition(int var0);

	com.acuity.rs.api.RSItemComposite invokeGetItemDefinition(int var0);

	com.acuity.rs.api.RSSpritePixels invokeGetItemSprite(int var0, int var1, int var2, int var3, int var4, boolean var5);

	com.acuity.rs.api.RSKitDefinition invokeGetKitDefinition(int var0);

	com.acuity.rs.api.RSNPCComposite invokeGetNpcDefinition(int var0);

	com.acuity.rs.api.RSSceneElementComposite invokeGetObjectDefinition(int var0);

	com.acuity.rs.api.RSFileOnDisk invokeGetPreferencesFile(java.lang.String var0, java.lang.String var1, boolean var2);

	com.acuity.rs.api.RSCacheReferenceTable invokeGetReferenceTable(int var0, boolean var1, boolean var2, boolean var3);

	int invokeGetVarpbit(int var0);

	void invokeGroundItemSpawned(int var0, int var1);

	void invokeInsertMenuItem(java.lang.String var0, java.lang.String var1, int var2, int var3, int var4, int var5, boolean var6);

	com.acuity.rs.api.RSVarpbit invokeLoadVarpbit(int var0);

	boolean invokeLoadWorlds();

	void invokeOnSceneXTEAKeyChange(boolean var0);

	void invokePacketHandler(int var0);

	void invokeProcessAction(int var0, int var1, int var2, int var3, java.lang.String var4, java.lang.String var5, int var6, int var7);

	void invokeRasterFlat(int var0, int var1, int var2, int var3, int var4, int var5, int var6);

	void invokeRasterGouraud(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8);

	void invokeRasterTexture(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18);

	void invokeRasterTextureAffine(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18);

	void invokeResetDrawingArea();

	void invokeSendGameMessage(int var0, java.lang.String var1, java.lang.String var2);

	void invokeSetGameState(int var0);

	void invokeSetRasterBuffer(int[] var0, int var1, int var2);

	void invokeSetRasterClipping(int var0, int var1, int var2, int var3);

	void invokeSetRasterClippingEnabled(int var0, int var1, int var2);

	void invokeSetWorld(com.acuity.rs.api.RSWorld var0);

	boolean isCameraLocked();

	boolean isDrawingAABB();

	boolean isDynamicRegion();

	boolean isMembersWorld();

	boolean isMembersWorld1();

	boolean isMenuOpen();

	boolean[] isPlayerOptionsPriorities();

	boolean isRasterClipEnable();

	boolean isRasterGouraudLowRes();

	boolean[][] isRenderArea();

	boolean isResizableMode();

	boolean isSpellSelected();

	boolean[] isValidInterfaces();

	boolean isViewportWalking();

	boolean isWorldSelectShown();

	void setAudioEffectCount(int var0);

	void setAudioEffects(com.acuity.rs.api.RSAudioEffect[] var0);

	void setAuthCode(java.lang.String var0);

	void setAuthCodeForLogin(int var0);

	void setBaseScenceX(int var0);

	void setBaseSceneY(int var0);

	void setBoostedSkillLevels(int[] var0);

	void setBoundingBoxes(com.acuity.rs.api.RSNodeLinkedList var0);

	void setCameraLocked(boolean var0);

	void setCameraPitch(int var0);

	void setCameraX(int var0);

	void setCameraY(int var0);

	void setCameraYaw(int var0);

	void setCameraZ(int var0);

	void setCanvasHeight(int var0);

	void setCanvasWidth(int var0);

	void setChatLineMap(java.util.Map var0);

	void setChatMessages(com.acuity.rs.api.RSChatMessages var0);

	void setClanChatCount(int var0);

	void setClanChatName(java.lang.String var0);

	void setClanChatOwner(java.lang.String var0);

	void setClanChatRank(byte var0);

	void setClanMates(com.acuity.rs.api.RSClanMember[] var0);

	void setClassStructures(com.acuity.rs.api.RSNodeLinkedList var0);

	void setClickX(int var0);

	void setClickY(int var0);

	void setCollisionMaps(com.acuity.rs.api.RSCollisionData[] var0);

	void setColorPalette(int[] var0);

	void setCOSINE(int[] var0);

	void setCurrentDomain(java.lang.String var0);

	void setCurrentWorld(int var0);

	void setCurrentWorldMask(int var0);

	void setCursorState(int var0);

	void setDestinationX(int var0);

	void setDestinationY(int var0);

	void setDrawingAABB(boolean var0);

	void setDrawingAreaBottom(int var0);

	void setDrawingAreaHeight(int var0);

	void setDrawingAreaLeft(int var0);

	void setDrawingAreaPixels(int[] var0);

	void setDrawingAreaRight(int var0);

	void setDrawingAreaTop(int var0);

	void setDrawingAreaWidth(int var0);

	void setDynamicRegion(boolean var0);

	void setEngineCycle(int var0);

	void setFontp12full(com.acuity.rs.api.RSFont var0);

	void setFPS(int var0);

	void setFriendCount(int var0);

	void setFriends(com.acuity.rs.api.RSFriendsListMember[] var0);

	void setGameState(int var0);

	void setGrandExchangeOffers(com.acuity.rs.api.RSGrandExchangeOffer[] var0);

	void setGraphicsObjectDeque(com.acuity.rs.api.RSNodeDeque var0);

	void setGroundItemDeque(com.acuity.rs.api.RSNodeDeque[][][] var0);

	void setHintArrowNpcIndex(int var0);

	void setHintArrowType(int var0);

	void setHintArrowX(int var0);

	void setHintArrowY(int var0);

	void setIgnoreCount(int var0);

	void setIgnoreCount1(int var0);

	void setIgnores(com.acuity.rs.api.RSIgnoreListMember[] var0);

	void setIndexInterfaces(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexMaps(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexModels(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexScripts(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexSoundEffects(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexSprites(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexTextures(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexTrack1(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexTrack2(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setIndexWorldMap(com.acuity.rs.api.RSCacheReferenceTable var0);

	void setInterfaceFlags(com.acuity.rs.api.RSHashTable var0);

	void setInterfaceHeights(int[] var0);

	void setInterfaceItemTriggers(int[] var0);

	void setInterfaceNodes(com.acuity.rs.api.RSHashTable var0);

	void setInterfacePositionX(int[] var0);

	void setInterfacePositionY(int[] var0);

	void setInterfaceRoot(int var0);

	void setInterfaces(com.acuity.rs.api.RSInterfaceComponent[][] var0);

	void setInterfaceWidths(int[] var0);

	void setIntStack(int[] var0);

	void setItemModelCache(com.acuity.rs.api.RSNodeTable var0);

	void setItemSelectionState(int var0);

	void setItemSpriteCache(com.acuity.rs.api.RSNodeTable var0);

	void setItemTables(com.acuity.rs.api.RSHashTable var0);

	void setKeyboardIdleTicks(int var0);

	void setKeyboardListener(java.lang.Object var0);

	void setLastClickTime(long var0);

	void setLatestSelectedItemName(java.lang.String var0);

	void setLocalPlayer(com.acuity.rs.api.RSPlayer var0);

	void setLoginIndex2(int var0);

	void setLoginResponse1(java.lang.String var0);

	void setLoginResponse2(java.lang.String var0);

	void setLoginResponse3(java.lang.String var0);

	void setLoginState(int var0);

	void setLoginState2(int var0);

	void setLoginWindowX(int var0);

	void setMapOffset(int var0);

	void setMapRegions(int[] var0);

	void setMapRotation(int var0);

	void setMapScale(int var0);

	void setMembersWorld(boolean var0);

	void setMembersWorld1(boolean var0);

	void setMenuActions(java.lang.String[] var0);

	void setMenuHeight(int var0);

	void setMenuOpcodes(int[] var0);

	void setMenuOpen(boolean var0);

	void setMenuPrimaryArgs(int[] var0);

	void setMenuRowCount(int var0);

	void setMenuSecondaryArgs(int[] var0);

	void setMenuTargets(java.lang.String[] var0);

	void setMenuTertiaryArgs(int[] var0);

	void setMenuWidth(int var0);

	void setMenuX(int var0);

	void setMenuY(int var0);

	void setMinimapOffset(int var0);

	void setModIcons(com.acuity.rs.api.RSModIcon[] var0);

	void setMouse(java.lang.Object var0);

	void setMouseIdleTime(int var0);

	void setMouseRecorder(com.acuity.rs.api.RSMouseRecorder var0);

	void setMouseX(int var0);

	void setMouseY(int var0);

	void setNpcActionPriority(com.acuity.rs.api.RSActionPrioritySetting var0);

	void setNpcIndices(int[] var0);

	void setNpcModelCache(com.acuity.rs.api.RSNodeTable var0);

	void setNpcs(com.acuity.rs.api.RSNpc[] var0);

	void setOnCursorCount(int var0);

	void setOnSursorUIDs(int[] var0);

	void setOverlayIDs(byte[][][] var0);

	void setOverlayPaths(byte[][][] var0);

	void setOverlayRotations(byte[][][] var0);

	void setPacket(com.acuity.rs.api.RSPacketBuffer var0);

	void setPacket2(com.acuity.rs.api.RSPacketBuffer var0);

	void setPacketID(int var0);

	void setPacketLength(int var0);

	void setPassword(java.lang.String var0);

	void setPendingClickX(int var0);

	void setPendingClickY(int var0);

	void setPendingMouseX(int var0);

	void setPendingMouseY(int var0);

	void setPendingSpawns(com.acuity.rs.api.RSNodeDeque var0);

	void setPlane(int var0);

	void setPlayerActionPriority(com.acuity.rs.api.RSActionPrioritySetting var0);

	void setPlayerActions(java.lang.String[] var0);

	void setPlayerIndex(int var0);

	void setPlayerMenuTypes(int[] var0);

	void setPlayerOptionsPriorities(boolean[] var0);

	void setPlayers(com.acuity.rs.api.RSPlayer[] var0);

	void setPreferences(com.acuity.rs.api.RSPreferences var0);

	void setProjectilesDeque(com.acuity.rs.api.RSNodeDeque var0);

	void setPublicChatMode(int var0);

	void setRasterAlpha(int var0);

	void setRasterClipEnable(boolean var0);

	void setRasterClipX(int var0);

	void setRasterClipY(int[] var0);

	void setRasterGouraudLowRes(boolean var0);

	void setRealSkillLevels(int[] var0);

	void setRedrawMode(int var0);

	void setRenderArea(boolean[][] var0);

	void setResizableMode(boolean var0);

	void setRevision(int var0);

	void setRights(int var0);

	void setRsaKeyExponent(java.math.BigInteger var0);

	void setRsaKeyModulus(java.math.BigInteger var0);

	void setRunEnergy(int var0);

	void setSceneGraph(com.acuity.rs.api.RSScene var0);

	void setSceneRenderRules(byte[][][] var0);

	void setScriptLocalInts(int[] var0);

	void setScriptLocalStrings(java.lang.String[] var0);

	void setScriptStack(com.acuity.rs.api.RSScriptState[] var0);

	void setScriptStackCount(int var0);

	void setScriptStringStack(java.lang.String[] var0);

	void setScriptStringStackSize(int var0);

	void setSelectedRegionTileX(int var0);

	void setSelectedRegionTileY(int var0);

	void setSINE(int[] var0);

	void setSkillExperiences(int[] var0);

	void setSocketState(int var0);

	void setSpellSelected(boolean var0);

	void setSpellTargetFlags(int var0);

	void setSpriteCache(com.acuity.rs.api.RSNodeTable var0);

	void setTempVarps(int[] var0);

	void setTileHeights(int[][][] var0);

	void setUnderlayIDs(byte[][][] var0);

	void setUsername(java.lang.String var0);

	void setValidInterfaces(boolean[] var0);

	void setVarps(int[] var0);

	void setViewportHeight(int var0);

	void setViewportScale(int var0);

	void setViewportWalking(boolean var0);

	void setViewportWidth(int var0);

	void setWeight(int var0);

	void setWorlds(com.acuity.rs.api.RSWorld[] var0);

	void setWorldSelectShown(boolean var0);

	void setWorldServersDownload(java.lang.Object var0);

	void setWrapper(com.acuity.api.rs.wrappers.peers.engine.Client var0);

	void setXteaKeys(int[][] var0);
}
