package com.networkscanner;

import java.util.regex.Pattern;

public class Main {
    private static final Pattern CIDR_PATTERN = Pattern.compile(
            "^(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])\\." +
                    "(25[0-5]|2[0-4][0-9]|1[0-9][0-9]|[1-9]?[0-9])/" +
                    "([1-9]|[12][0-9]|3[0-2])$"
    );
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Usage: java -jar network-scanner.jar <subnet>");
            System.out.println("Example: java -jar network-scanner.jar 192.168.1.0/24");
            return;
        }

        String subnet = args[0];
        if (!isValidCIDR(subnet)) {
           System.out.println("Invalid subnet format.");
           System.out.println("Expected CIDR format like: 192.168.1.0/24");
           return;
        }

        System.out.println("Network Scanner starting...");
        System.out.println("Subnet: " + subnet);
    }

    private static boolean isValidCIDR(String subnet) {
        return subnet != null && CIDR_PATTERN.matcher(subnet).matches();
    }
}
