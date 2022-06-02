module com.example.primedirective {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.PrimeDirective to javafx.fxml;
    exports com.example.PrimeDirective;
}