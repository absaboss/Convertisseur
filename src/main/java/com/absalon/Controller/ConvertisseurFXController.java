package com.absalon.Controller;

/**
 * Created by Absalon DEEL on 23/11/2015.
 */
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import com.absalon.View.ConvertisseurFX;

import java.io.IOException;
import com.absalon.Model.Monnaie;

public class ConvertisseurFXController {

    @FXML private Text actiontarget;
    @FXML private TextField inputVal;
    @FXML private TextField outputVal;
    @FXML private ComboBox comboDevEntrant;
    @FXML private ComboBox comboDevSortant;

    @FXML protected void handleSubmitButtonAction(ActionEvent event) {
        actiontarget.setText("Calculer button is press");


        double input = Double.parseDouble(inputVal.getText());
        String comboEntrant = "";
        String comboSortant ="";

        if(comboDevEntrant.getValue() == null) comboDevEntrant.setValue("Euro");
        else comboEntrant = comboDevEntrant.getValue().toString();

        if(comboDevSortant.getValue() == null) comboDevSortant.setValue("Livre Sterling");
        else comboSortant = comboDevSortant.getValue().toString();

        Monnaie m1 = new Monnaie(comboEntrant, input);
        Monnaie m2 = new Monnaie(comboSortant);



        System.out.println(m2.getDevise());
        System.out.println(m1.getValue());
        System.out.println(m1.conversionMonnaie(m2));

        outputVal.setText(m1.conversionMonnaie(m2) + "   " + m2.getDevise());
    }



}
