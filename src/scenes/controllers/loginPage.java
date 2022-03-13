package scenes.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginPage {

    @FXML
    private TextField emailText;

    @FXML
    private Label forgotPassword;

    @FXML
    private TextField passwordText;

    @FXML
    private Button signInBtn;

    @FXML
    private Group signUpBtn;

    public void setSignInBtn(Button signInBtn) {
        this.signInBtn = signInBtn;
    }

    void signInBtnClick(ActionEvent event)
    {
        
    }


    
}
