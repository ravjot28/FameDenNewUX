/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ravs.dto;

/**
 *
 * @author Ravjot
 */
public class RegistrationDTO {

    private String fullName;
    private String emailAddress;
    private String userName;
    private String password;

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
