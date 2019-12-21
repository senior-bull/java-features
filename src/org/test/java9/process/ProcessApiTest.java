package org.test.java9.process;

import java.io.IOException;

public class ProcessApiTest {

    public static void main(String[] args) throws IOException {
        ProcessBuilder processBuilder = new ProcessBuilder("notepad.exe");

        Process process = processBuilder.start();

        System.out.println("Pid: " + process.pid());
        System.out.println("Command: " + process.info().command().get());
    }
}
