package org.example.eventcircle;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class EventosCirculo extends Application {
    @Override
    public void start(Stage stage) {

        GridPane pane = new GridPane();
        Scene scene = new Scene(pane, 400, 500);
        stage.setTitle("Play with circle");


        Circle circulo = new Circle();
        circulo.setCenterX(100);
        circulo.setCenterY(100);
        circulo.setRadius(20);


        pane.add(circulo, 1, 1);


        Button agrandar = new Button("Agrandar");
        agrandar.setOnAction(e -> circulo.setRadius(circulo.getRadius() + 5));

        Button disminuir = new Button("Disminuir");
        disminuir.setOnAction(e -> {
                circulo.setRadius(circulo.getRadius() - 5);

        });
        
        pane.add(agrandar, 0, 2);
        pane.add(disminuir, 1, 2);


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
