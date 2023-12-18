module com.casual.flawless.java_pdf_reader {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.pixelduke.transit;

    opens com.casual.flawless.java_pdf_reader to javafx.fxml;
    exports com.casual.flawless.java_pdf_reader;
}
