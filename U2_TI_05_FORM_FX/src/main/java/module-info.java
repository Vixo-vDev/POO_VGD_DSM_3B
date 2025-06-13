module com.example.u2_ti_05_form_fx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.desktop;

    opens com.example.u2_ti_05_form_fx to javafx.fxml;
    exports com.example.u2_ti_05_form_fx;
}