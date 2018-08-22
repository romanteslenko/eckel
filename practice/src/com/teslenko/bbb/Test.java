package com.teslenko.bbb;

import java.util.Random;

public class Test  {
    public static void main(String[] args) {
        final int[] frameData = {0};
        EngineWrapper engineWrapper = new EngineWrapper();

        Thread cameraThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Camera started on thread " + Thread.currentThread().getId() + ' ' + Thread.currentThread().getName());
                while (frameData[0] < 10) {
                    try {
                        Thread.sleep(new Random().nextInt(100));
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    engineWrapper.updateFrame(frameData[0]++);
                }
            }
        });
        cameraThread.start();
        engineWrapper.resume();
        try {
            cameraThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        engineWrapper.suspend();

        System.out.println("END OF THE TEST");
    }
}
