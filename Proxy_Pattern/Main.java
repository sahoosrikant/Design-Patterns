package org.example;

import org.example.proxy.ProxyInternet;
import org.example.subject.Internet;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Internet internet = new ProxyInternet();
        try{
            internet.connectTo("google.com");
            internet.connectTo("facebook.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}