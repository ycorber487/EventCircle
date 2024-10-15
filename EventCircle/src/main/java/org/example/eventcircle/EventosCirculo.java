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

        GridPane pane = new GridPane(); // definimos un contenedor tabla
        Scene scene = new Scene(pane, 400, 500); // definimos el tamanio de la escena e introducimos el tamanio
        stage.setTitle("Play with circle"); // le damos un titulo


        Circle circulo = new Circle(); // creamos un circulo
        circulo.setCenterX(100); // centro en el 100,100 y radio de 20
        circulo.setCenterY(100);
        circulo.setRadius(20);


        pane.add(circulo, 1, 1); // colocamos el circulo en la posicion 1,1


        Button agrandar = new Button("Agrandar"); // creamos el boton que agranda
        agrandar.setOnAction(e -> circulo.setRadius(circulo.getRadius() + 5)); //aumentamos el radio 5 puntos

        Button disminuir = new Button("Disminuir"); // creamos el boton que empequeñece
        disminuir.setOnAction(e -> {
                circulo.setRadius(circulo.getRadius() - 5); //reducimos el radio 5 puntos

        });
        
        pane.add(agrandar, 0, 2); // agregamos el boton agrandar en la 0 2
        pane.add(disminuir, 1, 2);// agregamos el boton disminuir en la 1,2


        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
