package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage stage;

    @Override
    public void start(Stage primaryStage) throws Exception{
        try {
            stage = new Stage();
            Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("startWindow.fxml"));
            stage.setTitle("Organizer");
            stage.setScene(new Scene(root, 300, 275));
            stage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Stage getStage() {
        return stage;
    }


    public static void main(String[] args) {
        launch(args);
    }
}
