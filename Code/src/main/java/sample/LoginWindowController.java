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

    private static Stage stage;
    private StartWindowController startWindowController;
    private boolean loginBack;
    private Main main;

    @FXML
    public void initialize() {
        startWindowController = new StartWindowController();
        WindowLoading windowLoading = new WindowLoading();
        stage = new Stage();
        main = new Main();

        startWindowController.getStage().close();

        okButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("MainWindow.fxml", "Organizer - Главное окно", stage, startWindowController.getStage());
            }
        });

        backButton.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                windowLoading.loadWindow("startWindow.fxml", "Organizer", stage, startWindowController.getStage());
                loginBack = true;
            }
        });
    }

    public Stage getStage() {
        return stage;
    }

    private void loadWindow(String nameWindow, String nameTitle) {
        try {
            stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(nameWindow));
            stage.setTitle(nameTitle);
            stage.setScene(new Scene(root));
            stage.show();
            startWindowController.getStage().close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean getLoginBack() {
        return loginBack;
    }

    public void setLoginBack() {
        loginBack = false;
    }
}
