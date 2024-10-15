module org.example.eventcircle {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens org.example.eventcircle to javafx.fxml;
    exports org.example.eventcircle;
}