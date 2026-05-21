package org.example;

// Importación de clases necesarias de JavaFX
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

// Clase principal que hereda de Application
public class Main extends Application {

    // Método que inicia la interfaz gráfica
    @Override
    public void start(Stage primaryStage) {

        // Etiqueta inicial que muestra un mensaje
        Label label = new Label("Introduce alguna frase");

        // Campo de texto donde el usuario escribirá
        TextField frase = new TextField();

        // Botón para enviar el texto escrito
        Button button1 = new Button("Enviar");

        // Evento del botón:
        // Cuando se hace clic, el Label cambia
        // y muestra el texto escrito en el TextField
        button1.setOnAction(e -> {
            label.setText(frase.getText());
        });

        // VBox organiza los elementos verticalmente
        // Orden: Label → Campo de texto → Botón
        VBox layout = new VBox(label, frase, button1);

        // Creación de la escena con tamaño 400x300
        Scene scene = new Scene(layout, 400, 300);

        // Título de la ventana
        primaryStage.setTitle("Aplicacion de clic de boton");

        // Se asigna la escena a la ventana principal
        primaryStage.setScene(scene);

        // Mostrar la ventana
        primaryStage.show();
    }

    // Método principal para iniciar la aplicación
    public static void main(String[] args) {
        launch(args);
    }
}
