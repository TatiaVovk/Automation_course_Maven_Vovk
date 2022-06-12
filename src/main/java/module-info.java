module com.example.hillelcoursemaven {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.hillelcoursemaven to javafx.fxml;
    exports com.example.hillelcoursemaven;
}