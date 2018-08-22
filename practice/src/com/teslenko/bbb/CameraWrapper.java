package com.teslenko.bbb;

public class CameraWrapper {
    private static CameraWrapper ourInstance = new CameraWrapper();

    public static CameraWrapper getInstance() {
        return ourInstance;
    }

    private CameraWrapper() {
    }
}
