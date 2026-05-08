package org.example;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class Main extends Application {
    @Override
    public void start(Stage primaryStage) {

        Label label = new Label("Introduce alguna frase");
        TextField frase = new TextField();
        Button button1 = new Button("Enviar");

        button1.setOnAction(e -> {label.setText(frase.getText());});

        VBox layout = new VBox(label,frase,button1);
        Scene scene = new Scene(layout, 400, 300);
        primaryStage.setTitle("Aplicacion  de clic de boton");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch(args);
    }
}
