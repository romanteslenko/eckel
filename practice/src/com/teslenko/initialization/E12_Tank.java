package com.teslenko.initialization;

public class E12_Tank {
    private boolean isEmpty;
    private static int counter;
    private int instanceNum;

    E12_Tank() {
        isEmpty = false;
        instanceNum = ++counter;
        System.out.println("Tank " + instanceNum + " created");
    }

    void clean() {
        isEmpty = true;
    }

    @Override
    protected void finalize() throws Throwable {
        if (!isEmpty) {
            System.out.println("Finalization of Tank " + instanceNum + " is failed. Tank isn't empty");
        } else {
            System.out.println("Finalization of Tank " + instanceNum + " is successful");
        }
    }

    public static void main(String[] args) {
        E12_Tank tank1 = new E12_Tank();
        E12_Tank tank2 = new E12_Tank();
        tank1.clean();
        tank1 = tank2 = null;
        System.gc();
        System.runFinalization();
    }
}
