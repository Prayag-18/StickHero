module com.example.stickhero_1 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.stickhero_1 to javafx.fxml;
    exports com.example.stickhero_1;
}