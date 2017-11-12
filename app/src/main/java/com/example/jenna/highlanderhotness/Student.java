package com.example.jenna.highlanderhotness;

import io.realm.RealmObject;

/**
 * Created by Jenna on 11/11/2017.
 */

public class Student extends RealmObject{
    private String email;
    private String password;
    private String major;


    public String getEmail(){ return email; }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword(){ return password; }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMajor(){ return major; }

    public void setMajor(String major) {
        this.major = major;
    }


}
