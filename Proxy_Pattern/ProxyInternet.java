package org.example.proxy;

import org.example.realsubject.RealInternet;
import org.example.subject.Internet;

import java.util.Set;

//Proxy
public class ProxyInternet implements Internet {

    private Internet internet = new RealInternet();
    private static final Set<String> bannedSites = Set.of("facebook.com", "instagram.com", "twitter.com");

    @Override
    public void connectTo(String serverHost) throws Exception {
        if(bannedSites.contains(serverHost.toLowerCase())){
            throw new Exception("Access denied to "+ serverHost);
        }
        internet.connectTo(serverHost);
    }
}
