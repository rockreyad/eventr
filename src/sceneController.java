import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;

public class sceneController implements Initializable{

     private Stage stage;
     private Scene scene;
     private Parent root;

     @FXML
     private TextField emailText;
 
     @FXML
     private Label forgotPassword;
 
     @FXML
     private TextField passwordText;
 
     @FXML
     private Button signInBtn;
 
     @FXML
     private Group signUpBtn,closeBtn;

     @FXML
     private Rectangle signInBtnBG;
 
 
     @FXML
     void bgHover(MouseEvent event) {
         signInBtnBG.setStyle("-fx-fill: red;");
     }

     @FXML
     void bgHoverRemove(MouseEvent event) {
        signInBtnBG.setStyle("");
     }
     
     @FXML
    public void switchToSignUp(MouseEvent event) throws IOException {
        try {
            root = FXMLLoader.load(getClass().getResource("scenes/RegisterScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, Color.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public void switchToSignIn(MouseEvent event) throws IOException {
        try {
            root = FXMLLoader.load(getClass().getResource("scenes/LoginScene.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            scene = new Scene(root, Color.TRANSPARENT);
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub
        
        
    }

}
