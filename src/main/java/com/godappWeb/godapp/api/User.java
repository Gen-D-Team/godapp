package com.godappWeb.godapp.api;

public class User {
    private int id;
    private String name;
    private String nickname;
    private String email;
    private String backupMail;
    private String dob;
    private String PhoneNumber;
    private String role;
    private String status;

    public User(int id, String name, String nickname, String email, String backupMail, String dob, String PhoneNumber, String role, String status) {
        this.id = id;
        this.name = name;
        this.nickname = nickname;
        this.email = email;
        this.backupMail = backupMail;
        this.dob = dob;
        this.PhoneNumber = PhoneNumber;
        this.role = role;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public String setbackupMail() {
        return backupMail;
    }

    public void setBackupMail(String backupMail) {
        this.backupMail = backupMail;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String PhoneNumber() {
        return PhoneNumber;
    }

    public void PhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
