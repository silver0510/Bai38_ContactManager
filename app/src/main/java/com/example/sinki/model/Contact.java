package com.example.sinki.model;

import java.io.Serializable;

/**
 * Created by Sinki on 8/27/2017.
 */

public class Contact implements Serializable{
    private String ten;
    private String phone;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Contact(String ten, String phone) {
        this.ten = ten;
        this.phone = phone;
    }

    public Contact() {
    }
}
