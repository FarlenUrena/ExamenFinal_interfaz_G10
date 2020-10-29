package org.una.examenfinal_interfaz;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import org.una.examenfinal_interfaz.utils.FlowController;

/**
 * JavaFX App
 */
public class App extends Application {

    private static Scene scene;

    @Override
       public void start(Stage stage) throws IOException {
       FlowController.getInstance().InitializeFlow(stage, null);
       stage.setTitle("Examen Final UNA 2020");   
       FlowController.getInstance().goViewInWindow("LoginView");
    }

 

    public static void main(String[] args) {
        launch();
    }

}