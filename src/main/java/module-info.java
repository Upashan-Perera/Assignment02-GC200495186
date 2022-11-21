module com.example.assignment02gc200495186 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.net.http;
    requires com.google.gson;


    opens com.example.assignment02gc200495186 to javafx.fxml, com.google.gson;
    exports com.example.assignment02gc200495186;
}