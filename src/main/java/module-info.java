module com.example.cajeroautomatico {
    requires javafx.controls;
    requires javafx.fxml;
    requires jdk.jdi;
    requires java.sql;


    opens com.example.cajeroautomatico to javafx.fxml;
    exports com.example.cajeroautomatico;
}