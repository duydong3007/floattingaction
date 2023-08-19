package com.example.floatingactionbutton;

public class User {

    private int anh;
    private String name;

    public User(int anh, String name) {
        this.anh = anh;
        this.name = name;
    }

    public int getAnh() {
        return anh;
    }

    public void setAnh(int anh) {
        this.anh = anh;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
