package sample;

import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class StartWindowController {
    @FXML
    private Button loginButton;
    @FXML
    private Button registrationButton;
    @FXML
    private Button restorePasswordButton;

    private Main main;

    @FXML
    public void initialize() {
        main = new Main();
        WindowLoading windowLoading = new WindowLoading();


        loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("LoginWindow.fxml", "Organizer - Вход в аккаунт", main.getStage());
            }
        });

        registrationButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("RegistrationWindow.fxml", "Organizer - Регистрация", main.getStage());
            }
        });

        restorePasswordButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("RestorePasswordWindow1.fxml", "Organizer - Восстановление пароля", main.getStage());
            }
        });
    }

}