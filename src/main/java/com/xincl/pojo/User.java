package com.xincl.pojo;

import org.apache.ibatis.type.Alias;

public class User {
    private int ID;
    private String NAME;
    private String PASSWORD;

    public User() {
    }

    public User(int ID, String NAME, String PASSWORD) {
        this.ID = ID;
        this.NAME = NAME;
        this.PASSWORD = PASSWORD;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNAME() {
        return NAME;
    }

    public void setNAME(String NAME) {
        this.NAME = NAME;
    }

    public String getPASSWORD() {
        return PASSWORD;
    }

    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }

    @Override
    public String toString() {
        return "User{" +
                "ID=" + ID +
                ", NAME='" + NAME + '\'' +
                ", PASSWORD='" + PASSWORD + '\'' +
                '}';
    }
}
