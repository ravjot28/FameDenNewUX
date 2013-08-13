/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.bindingDTO;

import java.io.Serializable;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author puneet
 */
public class LoginBindingDTO implements Serializable{
    
    private StringProperty emailID = new SimpleStringProperty();
    
    private StringProperty password = new SimpleStringProperty();

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return (String)this.emailID.get();
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID.set(emailID);
    }
    
    public StringProperty emailProperty()
    {
        return this.emailID;
    }


    /**
     * @return the password
     */
    public String getPassword() {
        return (String)this.password.get();
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password.set(password);
    }
    
    
    public StringProperty passwordProperty()
    {
        return this.password;
    }

}
