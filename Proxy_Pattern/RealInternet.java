package org.example.realsubject;

import org.example.subject.Internet;

//RealSubject
public class RealInternet implements Internet {
    @Override
    public void connectTo(String serverHost) {
        System.out.println("Connecting to " + serverHost);
    }
}
