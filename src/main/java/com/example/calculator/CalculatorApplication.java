package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.w3c.dom.events.MouseEvent;

public class CalculatorApplication extends Application {
    private double x = 0;
    private double y= 0;

    public static void main(String[] args) {
        launch();
    }
    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("FxmlDocument.fxml"));
        Scene scene = new Scene(root);

//        root.setOnMousePressed((MouseEvent event) ->{
//           x = event.getScreenX();
//           y = event.getScreenY();
//        });

        scene.getStylesheets().add(getClass().getResource("styleSheet.css").toExternalForm());
        scene.setFill(Color.TRANSPARENT);
        stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();

    }
}
