package com.networkscanner;

public class Main {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar network-scanner.jar <subnet>");
            System.out.println("Example: java -jar network-scanner.jar 192.168.1.0/24");
            return;
        }

        System.out.println("Network Scanner starting...");
        String subnet = args[0];
        System.out.println("Subnet: " + subnet);
    }
}
