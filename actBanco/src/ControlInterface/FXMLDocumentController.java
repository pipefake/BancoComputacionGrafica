/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlInterface;


import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 *
 * @author Universidad Felipe
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label labelApilarProductos;
    @FXML
    private Label labelNombreProducto;
    @FXML
    private Label labelPrecioProducto;
    @FXML
    private Label labelCantidadProducto;
    
    @FXML
    private TextField txtNombreProducto;
    @FXML
    private TextField txtPrecioProducto;
    @FXML
    private TextField txtCantidadProducto;
    
    @FXML
    private TextArea txtImprimir;
    
    @FXML
    private Button btnDesapilar;
    @FXML
    private Button btnSalir;
    @FXML
    private Button btnApilar;
    @FXML
    private Button btnImprimir;
    @FXML
    private Button btnImprimirCopia;
    @FXML
    private Button btnImprimirInversa;
    
    
    
    @FXML
    private void apilarButtonAction(ActionEvent event) {
     

    }
    @FXML
    private void desapilarButtonAction(ActionEvent event) {

        
        
    }
    @FXML
    private void salirButtonAction(ActionEvent event) {

        System.exit(0);
        
    }
    @FXML
    private void imprimirButtonAction(ActionEvent event) {

    
    }
    @FXML
    private void inversaButtonAction(ActionEvent event) {

        
    }
    @FXML
    private void copiaButtonAction(ActionEvent event) {
;
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        

    }    
    
}
