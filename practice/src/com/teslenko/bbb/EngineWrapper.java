package com.teslenko.bbb;

public class EngineWrapper {
    private FrameBuffer mFrameBuffer;
    Thread mProcessingThread;
    private volatile boolean isActive;

    public EngineWrapper() {
        mFrameBuffer = new FrameBuffer();
        mProcessingThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Engine started on thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                while (isActive) {
                    processFrame();
                }
            }
        });
    }

    public void updateFrame(int frame) {
//        mFrameBuffer.updateFrame(frame);
    }

    private void processFrame() {
        int frame = mFrameBuffer.getFrame();
        System.out.println("Frame #" + frame + " has been processed");
    }

    public void resume() {
        isActive = true;
        mProcessingThread.start();
    }

    public void suspend() {
        isActive = false;
        try {
            mProcessingThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Engine suspended on thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
    }
}