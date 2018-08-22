package com.teslenko.bbb;

public class FrameBuffer {
    private int[][] mFrames;
    private boolean isFrameAvailable;
    private int mReadyFrameIndex;

    public FrameBuffer() {
        mFrames = new int[2][3];
        isFrameAvailable = false;
        mReadyFrameIndex = 0;
    }

    public synchronized void updateFrame(int[] frame) {
        System.out.println("updateFrame is executed on thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
//        System.arraycopy(frame, 0, );
        isFrameAvailable = true;
        notify();
    }

    public synchronized int getFrame() {
        System.out.println("getFrame is executed on thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
        while (!isFrameAvailable) {
            try {
                System.out.println("Thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName() + " is going to wait for notify");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        isFrameAvailable = false;
//        return mFrames[0];
        return 0;
    }
}
