import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class loginController implements Initializable{

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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
         
        signUpBtn.setOnKeyPressed(e -> {
            
        });
    }

    

}
