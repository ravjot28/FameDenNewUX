/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ravs.controller;

import com.ravs.bindingDTO.RegistrationBindingDTO;
import com.ravs.dto.RegistrationDTO;
import com.ravs.fxml.ScreenController;
import com.ravs.util.CommonValidations;
import com.ravs.util.InvokeAnimation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.Initializable;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ravjot
 */
public class RegistrationSceneController implements Initializable, ControlledScreen {

    @FXML
    TextField fullNameTextField;
    @FXML
    TextField emailAddressTextField;
    @FXML
    TextField userNameTextField;
    @FXML
    TextField passwordTextField;
    @FXML
    TextField confirmPasswordTextField;
    RegistrationBindingDTO registrationBindingDTO;
    ScreenController myController;

    public RegistrationSceneController() {
        registrationBindingDTO = new RegistrationBindingDTO();
    }

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Bindings.bindBidirectional(fullNameTextField.textProperty(), registrationBindingDTO.fullNameProperty());
        Bindings.bindBidirectional(emailAddressTextField.textProperty(), registrationBindingDTO.emailAddressProperty());
        Bindings.bindBidirectional(userNameTextField.textProperty(), registrationBindingDTO.userNameProperty());
        Bindings.bindBidirectional(passwordTextField.textProperty(), registrationBindingDTO.passwordProperty());
        Bindings.bindBidirectional(confirmPasswordTextField.textProperty(), registrationBindingDTO.confrimPasswordProperty());
    }

    @Override
    public void setScreenParent(ScreenController screenPage) {
        myController = screenPage;
    }

    @FXML
    public void singUp() {
        System.out.println("Sign Up");

        if (!CommonValidations.isStringEmpty(registrationBindingDTO.getFullName())) {
            if (!CommonValidations.isStringEmpty(registrationBindingDTO.getEmailAddress())) {
                if (!CommonValidations.isStringEmpty(registrationBindingDTO.getUserName())) {
                    if (!CommonValidations.isStringEmpty(registrationBindingDTO.getPassword())) {
                        if (!CommonValidations.isStringEmpty(registrationBindingDTO.getConfrimPassword())) {
                            if (registrationBindingDTO.getPassword().equals(registrationBindingDTO.getConfrimPassword())) {
                                System.out.println("fullNameTextField " + registrationBindingDTO.getFullName());
                                System.out.println("emailAddressTextField " + registrationBindingDTO.getEmailAddress());
                                System.out.println("userNameTextField " + registrationBindingDTO.getUserName());
                                System.out.println("passwordTextField " + registrationBindingDTO.getPassword());
                                System.out.println("confirmPasswordTextField " + registrationBindingDTO.getConfrimPassword());
                                RegistrationDTO registrationDTO = new RegistrationDTO();
                                registrationDTO.setFullName(registrationBindingDTO.getFullName());
                                registrationDTO.setUserName(registrationBindingDTO.getUserName());
                                registrationDTO.setEmailAddress(registrationBindingDTO.getEmailAddress());
                                registrationDTO.setPassword(registrationBindingDTO.getPassword());
                            } else {
                                InvokeAnimation.attentionSeekerShake(confirmPasswordTextField);
                                InvokeAnimation.attentionSeekerShake(passwordTextField);
                            }
                        } else {
                            InvokeAnimation.attentionSeekerWobble(confirmPasswordTextField);
                        }
                    } else {
                        InvokeAnimation.attentionSeekerWobble(passwordTextField);
                    }
                } else {
                    InvokeAnimation.attentionSeekerWobble(userNameTextField);
                }
            } else {
                InvokeAnimation.attentionSeekerWobble(emailAddressTextField);
            }
        } else {
            InvokeAnimation.attentionSeekerWobble(fullNameTextField);
        }

    }

    @FXML
    public void login() {
        System.out.println("Login");
        System.exit(0);
    }
}
