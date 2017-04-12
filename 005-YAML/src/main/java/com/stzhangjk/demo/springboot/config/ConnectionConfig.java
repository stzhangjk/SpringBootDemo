package com.stzhangjk.demo.springboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import javax.validation.constraints.NotNull;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author zhjk on 2017/4/11.
 */
@Component
@ConfigurationProperties(prefix = "connection")
public class ConnectionConfig {
    @NotNull
    private String username;
    @NotNull
    private String password;
    private InetAddress remoteAddr;
    private List<String> list = new ArrayList<>();
    private Map<String,String> map;
    private int[] array;
    private List<Map<String,String>> listmap = new ArrayList();
    private String str;

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

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        return map;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public List<Map<String, String>> getListmap() {
        return listmap;
    }

    public void setListmap(List<Map<String, String>> listmap) {
        this.listmap = listmap;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }
}
