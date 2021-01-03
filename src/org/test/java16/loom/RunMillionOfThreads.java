package org.test.java16.loom;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunMillionOfThreads {

    public static int DELAY = 10_000;
    public static int NTASKS = 1_000_000;

    public static void run() {
        try {
            Thread.sleep((int) (DELAY * Math.random()));
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExecutorService exec = Executors.newVirtualThreadExecutor();
        for (int i = 1; i <= NTASKS; i++) {
            exec.submit(RunMillionOfThreads::run);
        }
        exec.close();
    }
}
