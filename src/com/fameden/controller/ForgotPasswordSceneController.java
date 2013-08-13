/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fameden.controller;

import com.fameden.bindingDTO.ForgotPasswordBindingDTO;
import com.fameden.bindingDTO.LoginBindingDTO;
import com.fameden.constants.GlobalConstants;
import com.fameden.dto.ForgotPasswordDTO;
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
public class ForgotPasswordSceneController implements Initializable, IScreenController {

    @FXML
    private TextField emailAddressTextField, uaerNameTextField;
    private ForgotPasswordBindingDTO forgotPasswordBindingDTO;
    private ForgotPasswordDTO forgotPasswordDTO;
    SceneNavigator myController;

    public ForgotPasswordSceneController() {
        this.forgotPasswordBindingDTO = new ForgotPasswordBindingDTO();
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Bindings.bindBidirectional(this.emailAddressTextField.textProperty(), this.forgotPasswordBindingDTO.emailProperty());
        Bindings.bindBidirectional(this.uaerNameTextField.textProperty(), this.forgotPasswordBindingDTO.userNameProperty());
    }

    @FXML
    public void nevermind() {
        myController.setScreen(GlobalConstants.registrationScene);

    }

    @FXML
    public void sendVerificationEmail() {
        
    }

    @Override
    public void setScreenParent(SceneNavigator screenPage) {
        myController = screenPage;
    }
}
