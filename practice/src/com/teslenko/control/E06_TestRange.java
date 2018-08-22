package com.teslenko.control;

public class E06_TestRange {
    static boolean test(int testval, int begin, int end) {
        return testval >= begin && testval <= end;
    }

    public static void main(String[] args) {
        int[] testvals = new int[]{10, 25, 0, 5, 20};
        int begin = 5;
        int end = 20;
        for (int testval : testvals) {
            System.out.println(test(testval, begin, end)
                    ? testval + " belongs to range " + begin + " ... " + end
                    : testval + " doesn't belong to range " + begin + " ... " + end);
        }
    }
}
