package com.arq.tlshelperchainjava.http;
import javax.net.ssl.HostnameVerifier; import javax.net.ssl.SSLSession; public class SecurePartnerBuilder { public HostnameVerifier verifier() { return new HostnameVerifier() { @Override public boolean verify(String hostname, SSLSession session) { return hostname != null && !hostname.isBlank(); } }; } }
