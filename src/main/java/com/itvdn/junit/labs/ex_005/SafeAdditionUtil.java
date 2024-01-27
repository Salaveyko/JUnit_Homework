package com.itvdn.junit.labs.ex_005;

/**
 * Tasks description: com.itvdn.junit.labs.ex_005.TestRunner
 */
public class SafeAdditionUtil {

    public int safeAdd(int a, int b) {
        long result = ((long) a) + b;

        if (result > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        } else if (result < Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }

        return (int) result;
    }
}
