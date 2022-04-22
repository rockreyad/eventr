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
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Node;

public class dashController implements Initializable {

    private Stage stage;
    private Scene scene;
    private Parent root;
    private switchScene sc;

    // Button List
    @FXML
    private Button planBtn;
    @FXML
    private Button planListBtn;
    @FXML
    private Button signoutBtn;

    @FXML
    private AnchorPane anchorPlace;

    @FXML
    void bgHoverPlan(MouseEvent event) {

    }

    // Plan List
    @FXML
    void planList(MouseEvent event) {
        sc = new switchScene("scenes/PlanList.fxml", anchorPlace);
    }

    @FXML
    void signOut(MouseEvent event) {

    }

    // Plan Scene
    @FXML
    void createPlan(MouseEvent event) throws IOException {
        sc = new switchScene("scenes/Category.fxml", anchorPlace);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1) {
        // TODO Auto-generated method stub

    }

}
