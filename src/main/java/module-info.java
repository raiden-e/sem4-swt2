module com.example.pkpraktikumintellij {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.swt.kasse to javafx.fxml;
    exports com.swt.kasse;
}