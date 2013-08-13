/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.controller;

import com.fameden.bindingDTO.LoginBindingDTO;
import com.fameden.constants.GlobalConstants;
import com.fameden.dto.LoginDTO;
import com.fameden.fxml.SceneNavigator;
import com.fameden.util.CommonValidations;
import com.fameden.util.InvokeAnimation;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

/**
 *
 * @author puneet
 */
public class LoginSceneController implements Initializable, IScreenController {

    @FXML
    private TextField emailAddressTextField, passwordTextField;
    private LoginBindingDTO loginBindingDTO;
    private LoginDTO loginDTO;
    SceneNavigator myController;

    public LoginSceneController() {
        this.loginBindingDTO = new LoginBindingDTO();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Bindings.bindBidirectional(this.emailAddressTextField.textProperty(), this.loginBindingDTO.emailProperty());
        Bindings.bindBidirectional(this.passwordTextField.textProperty(), this.loginBindingDTO.passwordProperty());
    }

    @FXML
    public void signUp() {
        myController.setScreen(GlobalConstants.registrationScene);

    }

    @FXML
    public void login() {
        if (!CommonValidations.isStringEmpty(this.loginBindingDTO.getEmailID())) {
            if (!CommonValidations.isStringEmpty(this.loginBindingDTO.getPassword())) {

                loginDTO = new LoginDTO();
                loginDTO.setEmailID(this.loginBindingDTO.getEmailID());
                loginDTO.setPassword(this.loginBindingDTO.getPassword());
                
                //TODO Call Login Service and Receive returning object

            } else {
                InvokeAnimation.attentionSeekerWobble(passwordTextField);
            }
        } else {
            InvokeAnimation.attentionSeekerWobble(emailAddressTextField);
        }
    }
    
    @FXML
    public void forgotPassword(){
        
        myController.setScreen(GlobalConstants.forgotPasswordScene);
    }

    @Override
    public void setScreenParent(SceneNavigator screenPage) {
        myController = screenPage;
    }
    
    @FXML
    public void closeFired() {
        System.exit(0);
    }
}
