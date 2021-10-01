package com.example.LearningPlatfrom.enitities;

public class user {

    private String firstname;
    private String lastname;
    private String phoneNumber;
    private Integer userId;

    public user(){

    }

    public user(Integer id , String firstname , String lastname , String phoneNumber){

        this.userId = id;
        this.firstname = firstname ;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString()
    {

        return "User [id="
                + userId + ", firstName="
                + firstname + ", lastName="
                + lastname + ", phoneNumber="
                + phoneNumber + "]";


    }
}
