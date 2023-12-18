package com.casual.flawless.java_pdf_reader;

import com.pixelduke.transit.Style;
import com.pixelduke.transit.TransitTheme;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
//import java.io.File;
import java.io.IOException;
//import java.nio.file.Paths;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainApp
            .class.getResource("MainPage.fxml"));
        var scene = new Scene(fxmlLoader.load());

//        var path = String.valueOf(Paths
//            .get("src", "main", "resources", "com",
//                "casual", "flawless", "java_pdf_reader", "dark-theme.css"));
//        var stylePath = new File(path);
        var transit = new TransitTheme(Style.DARK);
        transit.setScene(scene);
//        scene.getStylesheets().add(stylePath.toURI().toURL().toExternalForm());
        stage.setTitle("Java PDF Reader"); stage.setScene(scene); stage.show();
    }

    public static void main(String[] args) { launch(); }
}
