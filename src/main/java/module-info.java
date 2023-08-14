module com.example.samost1408 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.samost1408 to javafx.fxml;
    exports com.example.samost1408;
}