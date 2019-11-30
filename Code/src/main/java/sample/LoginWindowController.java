package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginWindowController {
    @FXML private Button okButton;
    @FXML private Button backButton;
    @FXML private TextField loginField;
    @FXML private PasswordField passwordField;

    private Main main;

    @FXML
    public void initialize() {
        WindowLoading windowLoading = new WindowLoading();
        main = new Main();

        okButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("MainWindow.fxml", "Organizer - Главное окно", main.getStage());
            }
        });

        backButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("startWindow.fxml", "Organizer", main.getStage());
            }
        });
    }
}
