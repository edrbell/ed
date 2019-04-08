package sample;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;
import javafx.scene.control.Button;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Controller {
    @FXML private TextField fnombre;
    @FXML private TextField fapel;
    @FXML private TextField ftlf;
    @FXML private TextField femail;
    @FXML private Button generar_boton;
    @FXML private void initialize() {
        generar_boton.setOnAction((event) -> {
            try {
                generar();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }
    @FXML
    private void generar() throws IOException {
        Objecto objecto = new Objecto(fnombre.getText(), fapel.getText(), ftlf.getText(), femail.getText());
        Escribir("formulario.form", objecto);
    }

    public static void Escribir(String f, Objecto obj) throws IOException {
        ObjectOutputStream ost = new ObjectOutputStream(new FileOutputStream(f));
        ost.writeObject(obj);
        ost.close();
    }
}
