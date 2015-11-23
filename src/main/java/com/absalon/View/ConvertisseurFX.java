package com.absalon.View;/**
 * Created by Absalon DEEL on 22/11/2015.
 */

import com.absalon.Controller.ConvertisseurFXController;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.*;
import javafx.scene.control.*;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class ConvertisseurFX extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    private GridPane mainPane;

    @Override
    public void start(Stage primaryStage) throws IOException {
        mainPane = FXMLLoader.load(getClass().getResource("Convertisseur.fxml"));

        Scene scene = new Scene(mainPane, 400, 300);

        primaryStage.setTitle("Convertisseur de devises");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}
