package lk.ijse.hotel.util;

import javafx.fxml.FXMLLoader;
import javafx.scene.control.Alert;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import javax.swing.event.AncestorEvent;
import java.io.IOException;

public class Navigate {
    private static AnchorPane anchorPane;

    public static void navigate (Routes routes , AnchorPane pane) throws IOException {
        Navigate.anchorPane = pane;
        Navigate.anchorPane.getChildren().clear();
        Stage window = (Stage) Navigate.anchorPane.getScene().getWindow();

       switch (routes){
           case ADMIN:
                window.setTitle("Admin Form");
                initUI("AdminLoginForm.fxml");
                break;
            default:
                new Alert(Alert.AlertType.ERROR, "Not suitable UI found").show();
        }
    }
    private static void initUI(String location) throws IOException {
        Navigate.anchorPane.getChildren().add(FXMLLoader.
                load(Navigate.class.getResource("/lk/ijse/hotel/view"+location)));
    }
}
