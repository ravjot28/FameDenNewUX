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
public class ForgotPasswordBindingDTO implements Serializable {

    private StringProperty emailID = new SimpleStringProperty();
    private StringProperty userName = new SimpleStringProperty();

    /**
     * @return the emailID
     */
    public String getEmailID() {
        return (String) this.emailID.get();
    }

    /**
     * @param emailID the emailID to set
     */
    public void setEmailID(String emailID) {
        this.emailID.set(emailID);
    }

    public StringProperty emailProperty() {
        return this.emailID;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return (String) this.userName.get();
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName.set(userName);
    }

    public StringProperty userNameProperty() {
        return this.userName;
    }
}
