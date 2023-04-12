package com.lloydna.autosprayer.engine.sprayer_bridge.readers;

public abstract class Reader{
    protected static Reader singleton;

    public abstract void read();

    public abstract void sendDataToApp();
}
