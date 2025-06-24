package com.example.u2_ti_05_form_fx;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javafx.scene.control.*;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Label lbNombre = new Label("Nombre:");
        TextField tfNombre = new TextField();

        Label lbapellido = new  Label("Apellido:");
        TextField tfApellido = new  TextField();

        Label lbage = new  Label("Edad:");
        TextField tfage = new  TextField();

        Label lblRol = new Label("Rol:");
        ObservableList<String> roles = FXCollections.observableArrayList("Estudiante", "Profesor", "Admin");
        ComboBox<String> cbRol = new  ComboBox<String>(roles);
        Button btnCrear = new  Button("Crear");
        Button btnReset = new  Button("Reset");
        Label lblResultado = new Label();

        GridPane root = new GridPane();
        root.setAlignment(Pos.CENTER);
        root.setHgap(20);
        root.setVgap(20);

        root.add(lbNombre,0,0);
        root.add(tfNombre,1,0);
        root.add(lbapellido,0,1);
        root.add(tfApellido,1,1);
        root.add(lbage,0,2);
        root.add(tfage,1,2);
        root.add(lblRol,0,3);
        root.add(cbRol,1,3);
        root.add(btnCrear,0,4);
        root.add(btnReset,1,4);
        root.add(lblResultado,0,5);

        btnCrear.setOnAction(e -> {
            String nombre = tfNombre.getText();
            String lastname = tfApellido.getText();
            String edad = tfage.getText();

            String rol = cbRol.getSelectionModel().getSelectedItem();


            try{
                int edadInt = Integer.parseInt(edad);
                if(nombre.isEmpty() || lastname.isEmpty() || edadInt == 0 || rol.isEmpty()){
                    lblResultado.setText("Debes ingresar todos los campos");
                }
                else if(edadInt < 0){
                    lblResultado.setText("La edad debe ser positivo");
                }

                else{
                    root.setStyle("-fx-background-color: #90EE90");
                    lblResultado.setStyle("-fx-text-fill: blue;");
                    lblResultado.setText("Nombre: " + nombre + "\nApellido: " + lastname + "\nEdad: " + edad + "\nRol: " + rol);
                }

            }catch(NumberFormatException ex){
                lblResultado.setText("La edad debe ser un número entero");
            }

        });

        btnReset.setOnAction(e ->{
            tfNombre.setText("");
            tfApellido.setText("");
            tfage.setText("");
            lblResultado.setText("");
            root.setStyle("-fx-background-color: white;");
            lblResultado.setStyle("-fx-text-fill: black;");
        });

        stage.setTitle("Programa 5");
        Image imagen = new Image(getClass().getResourceAsStream("/imagenes/taza.png"));
        stage.getIcons().add(imagen);
        Scene scene = new Scene(root, 500, 500);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch();
    }
}