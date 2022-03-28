module com.example.lab1mpp {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.lab1mpp to javafx.fxml;
    exports com.example.lab1mpp;
}