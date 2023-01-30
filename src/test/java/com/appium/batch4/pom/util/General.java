package com.appium.batch4.pom.util;

public class General {
    final public static int TIME_OUT = 30;

    public static void waitForDomStable() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}
