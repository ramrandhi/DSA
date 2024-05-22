package com.sorting;

import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Routh {
	public static void main(String[] args) {
        try {
            InetAddress ipAddress = InetAddress.getLocalHost();
            NetworkInterface networkInterface = NetworkInterface.getByInetAddress(ipAddress);
            byte[] macAddressBytes = networkInterface.getHardwareAddress();

            StringBuilder macAddressBuilder = new StringBuilder();
            for (int i = 0; i < macAddressBytes.length; i++) {
                macAddressBuilder.append(String.format("%02X%s", macAddressBytes[i], (i < macAddressBytes.length - 1) ? "-" : ""));
            }

            System.out.println("MAC Address: " + macAddressBuilder.toString());
        } catch (UnknownHostException | SocketException e) {
            e.printStackTrace();
        }
    }
}
