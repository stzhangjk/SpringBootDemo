package com.stzhangjk.demo.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.net.InetAddress;

/**
 * @author zhjk on 2017/4/11.
 */
@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionConfig {
    private String username;
    private String password;
    private InetAddress remoteAddr;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public InetAddress getRemoteAddr() {
        return remoteAddr;
    }

    public void setRemoteAddr(InetAddress remoteAddr) {
        this.remoteAddr = remoteAddr;
    }
}
