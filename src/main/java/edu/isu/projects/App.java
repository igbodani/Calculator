package edu.isu.projects;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.File;
import java.net.URL;

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        try {

            URL url = new File("src/main/java/edu/isu/projects/Scene.fxml").toURI().toURL();
            Parent root = FXMLLoader.load(url);
            Scene scene = new Scene(root);
            scene.setFill(Color.TRANSPARENT);

            primaryStage.setScene(scene);
            primaryStage.initStyle(StageStyle.TRANSPARENT);
            primaryStage.setResizable(false);
            primaryStage.setTitle("Calculator");
            primaryStage.show();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
