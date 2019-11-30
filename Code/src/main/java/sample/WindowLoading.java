package sample;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class WindowLoading {
    public void loadWindow(String nameWindow, String nameTitle, Stage stage) {
        try {
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource(nameWindow));
            //newStage.setTitle(nameTitle);
            //newStage.setScene(new Scene(root));
            //oldStage.close();
            //oldStage = newStage;
            //oldStage.show();
            //stage.close();
            stage.setTitle(nameTitle);
            stage.setScene(new Scene(root));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
