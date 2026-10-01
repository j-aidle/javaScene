package com.example.demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class PrincipalController {

    public void anarASegonaVista(ActionEvent event) throws IOException {
        Parent novaVista = FXMLLoader.load(
                App.class.getResource("SegonaVista.fxml")
        );

        Stage finestra = (Stage) ((Node) event.getSource())
                .getScene()
                .getWindow();

        finestra.setScene(new Scene(novaVista, 600, 400));
        finestra.setTitle("Segona vista");
        finestra.show();
    }
}
