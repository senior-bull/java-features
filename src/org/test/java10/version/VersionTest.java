package org.test.java10.version;

public class VersionTest {

    public static void main(String[] args) {
        Runtime.Version version = Runtime.version();
        System.out.println(version);

        System.out.println(version.version());
        System.out.println(version.feature());
        System.out.println(version.patch());
    }
}
