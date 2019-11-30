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
    private StartWindowController startWindowController;
    private static Stage stage;

    private boolean bool = false;

    @FXML
    public void initialize() {
        main = new Main();
        WindowLoading windowLoading = new WindowLoading();
        stage = new Stage();
        LoginWindowController loginWindowController = new LoginWindowController();


        loginButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                //stage.close();
                //windowLoading.loadWindow("LoginWindow.fxml", "Organizer - Вход в аккаунт", stage, main.getStage());
                //main.getStage().close();

                windowLoading.loadWindow("LoginWindow.fxml", "Organizer - Вход в аккаунт", stage, loginWindowController.getStage());
                main.getStage().close();
                //windowLoading.loadWindow("LoginWindow.fxml", "sdfa", stage, startWindowController.getStage());
            }
        });

        registrationButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("RegistrationWindow.fxml", "Organizer - Регистрация", stage, main.getStage());
                //main.getStage().close();
            }
        });

        restorePasswordButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("RestorePasswordWindow1.fxml", "Organizer - Восстановление пароля", stage, main.getStage());
                //main.getStage().close();
            }
        });
    }

    /*private void loadWindow(String nameWindow, String nameTitle) {
        try {
            stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(nameWindow));
            stage.setTitle(nameTitle);
            stage.setScene(new Scene(root));
            stage.show();
            main.getStage().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }*/

    public Stage getStage() {
        return stage;
    }
}