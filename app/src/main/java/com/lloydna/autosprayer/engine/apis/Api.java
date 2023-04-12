package com.lloydna.autosprayer.engine.apis;

import com.lloydna.autosprayer.engine.sprayer_bridge.readers.Reader;
import com.lloydna.autosprayer.engine.sprayer_bridge.writers.Writer;

public abstract class Api{
    protected static Api singleton;

    protected Writer writer;
    protected Reader reader;

    public abstract void updateAppData(Object update); //read

    public abstract void sendAppData(); //write
}
