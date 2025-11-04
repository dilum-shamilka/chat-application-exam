package lk.ijse.Controller;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginFormController {

    @FXML
    private TextField txtName;

    static String username;

    @FXML
    void btnLoginOnAction(ActionEvent event) throws IOException {
        if (!txtName.getText().isEmpty()){
            username = txtName.getText();
            Stage stage = new Stage();
            stage.setScene(new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("/View/ClientForm.fxml")))));
            stage.setTitle(txtName.getText() + "'s Chat");
            stage.show();
            txtName.clear();

            txtName.clear();
        }else{
            new Alert(Alert.AlertType.ERROR, "Please enter your name").show();
        }
    }


}
