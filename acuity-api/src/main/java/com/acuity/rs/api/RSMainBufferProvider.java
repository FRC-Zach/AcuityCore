package com.acuity.rs.api;

import java.awt.Graphics;
import java.awt.Image;

//Generated

public interface RSMainBufferProvider extends RSBufferProvider {

    Image getImage();

    void invokeDraw(Graphics var0, int var1, int var2);

    void invokeDrawSub(Graphics var0, int var1, int var2, int var3, int var4);
}
