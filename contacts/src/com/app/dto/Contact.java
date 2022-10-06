package com.app.dto;

public class Contact {
    private String name;
    private String email;
    private String phoneNumber;


    public Contact() {
    }

    public Contact(String name, String email, String phoneNumber) {
        this.name = name;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Contact name(String name) {
        setName(name);
        return this;
    }

    public Contact email(String email) {
        setEmail(email);
        return this;
    }

    public Contact phoneNumber(String phoneNumber) {
        setPhoneNumber(phoneNumber);
        return this;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", email='" + getEmail() + "'" +
            ", phoneNumber='" + getPhoneNumber() + "'" +
            "}";
    }

}
