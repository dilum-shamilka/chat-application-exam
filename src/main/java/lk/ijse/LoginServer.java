package lk.ijse;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import lk.ijse.Controller.Server;

import java.io.IOException;

public class LoginServer extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));
        primaryStage.setTitle("Chat App");
        primaryStage.centerOnScreen();
        primaryStage.setResizable(false);
        primaryStage.show();

        new Thread(()->{
            Server server= new Server();
            try {
                server.Server();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).start();

    }
}
