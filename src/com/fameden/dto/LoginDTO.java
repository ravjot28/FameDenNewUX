/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.dto;

/**
 *
 * @author puneet
 */
public class LoginDTO {
    
    private String emailID;
    private String password;

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return emailID;
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }
    
    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
    
}
