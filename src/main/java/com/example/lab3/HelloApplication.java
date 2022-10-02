package com.example.lab3;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;

import javafx.stage.Stage;
import java.lang.Math;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {

        Label radiusInputLabel = new Label("Введіть радіус кола: ");
        TextField radiusInputField = new TextField();
        Label xPointLabel = new Label("Введіть координату точки X: ");
        TextField xPointInputField = new TextField();
        Label yPointLabel = new Label("Введіть координату точки Y: ");
        TextField yPointInputField = new TextField();
        Button button = new Button( "Вперед");
        Label resLabel = new Label();


        button.setOnAction(actionEvent -> {

            String radiusStr = radiusInputField.getText();
            String pointXStr = xPointInputField.getText();
            String pointYStr = yPointInputField.getText();

            int radius , pointX , pointY ;

            if(radiusStr.length() > 0){
                radius = Integer.parseInt(radiusStr);
                System.out.println("Int Rad: " + radius);
                radiusInputField.setText(Integer.toString(radius));
            }

            if(pointXStr.length() > 0){
                pointX = Integer.parseInt(pointXStr);
                System.out.println("Int X: " + pointX);
                xPointInputField.setText(Integer.toString(pointX));
            }


            if(pointYStr.length() > 0){
                pointY = Integer.parseInt(pointYStr);
                System.out.println("Int Y: " + pointY);
                yPointInputField.setText(Integer.toString(pointY));
            }

            int res = (int) (Math.pow((Integer.parseInt(pointXStr) - 1),2) + (int) (Math.pow((Integer.parseInt(pointYStr) - 0),2)));
            int squaredRadius = (int) Math.pow(Integer.parseInt(radiusStr),2);

                if (res > squaredRadius) {
                    resLabel.setText("Lying outside");
                }
                else {
                    resLabel.setText("not lying");
                }

            });

        Group group = new Group(button); // вкладений вузол Group
        FlowPane root = new FlowPane(radiusInputLabel,radiusInputField,xPointLabel,xPointInputField,yPointLabel,yPointInputField,resLabel,group); // кореневий вузол
        Scene scene = new Scene(root, 300, 150); // створення Scene
        stage.setScene(scene); // задання Scene для Stage
        stage.setTitle("Lab3");
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}