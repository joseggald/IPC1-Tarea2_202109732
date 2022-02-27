package org.ipc_t1.controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import org.ipc_t1.sistema.Main;

import java.net.URL;
import java.util.ResourceBundle;

public class LoginController implements Initializable {

    private Main escenarioPrincipal;

    @FXML private TextField txtUsuario;
    @FXML private PasswordField txtPassword;

    FuncionesUsuario funcionesUsuario =new FuncionesUsuario();

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
    public void setEscenarioPrincipal(Main escenarioPrincipal) {
        this.escenarioPrincipal = escenarioPrincipal;
    }

    public void autenticar(){
        String ps, us;
        us=txtUsuario.getText();
        ps=txtPassword.getText();

        funcionesUsuario.login(us, ps);


    }

}
