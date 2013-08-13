/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.dto;

/**
 *
 * @author puneet
 */
public class ForgotPasswordDTO {
  
    
    private String emailID;
    private String userName;

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
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }
    
}
