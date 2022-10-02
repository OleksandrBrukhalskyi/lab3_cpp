package com.example.lab3;

import javafx.fxml.FXML;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}
//    Group group = new Group(button); // вкладений вузол Group
//    FlowPane root = new FlowPane(radiusInputLabel,radiusInputField,xPointLabel,xPointInputField,yPointLabel,yPointInputField,resLabel,group); // кореневий вузол
//    Scene scene = new Scene(root, 300, 150); // створення Scene
//        stage.setScene(scene); // задання Scene для Stage
//                stage.setTitle("Lab3");
//                stage.show();