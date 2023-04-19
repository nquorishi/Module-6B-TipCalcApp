module com.mycompany.tipcalcapp {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tipcalcapp to javafx.fxml;
    exports com.mycompany.tipcalcapp;
}
