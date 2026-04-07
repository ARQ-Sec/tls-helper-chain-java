
package com.arq.tlshelperchainjava.http;

import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;

public class PartnerHttpBuilder {
    public HostnameVerifier verifier() {
        return HostnameVerifierAlias.insecure();
    }
}

final class HostnameVerifierAlias {
    static HostnameVerifier insecure() {
        return new HostnameVerifier() {
            @Override
            public boolean verify(String hostname, SSLSession session) {
                return true;
            }
        };
    }
}
