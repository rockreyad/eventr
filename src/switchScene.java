import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.Node;

public class switchScene {

    private Stage stage;
    private Scene scene;
    private Parent root;

    switchScene(MouseEvent event, String sceneFile) throws IOException {
        root = FXMLLoader.load(getClass().getResource(sceneFile));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root, Color.TRANSPARENT);
        stage.setScene(scene);
        stage.show();
    }

    switchScene(String sceneFile, AnchorPane anchorPlace) {
        try {
            AnchorPane pane = FXMLLoader.load(this.getClass().getResource("scenes/Category.fxml"));
            anchorPlace.getChildren().setAll(pane);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
