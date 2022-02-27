package org.ipc_t1.sistema;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.ipc_t1.controllers.LoginController;

import java.io.IOException;

public class Main extends Application {


    private final String CarpetaViews="../views/";
    private Stage escenarioPrincipal;

    @Override
    public void start(Stage escenarioPrincipal) throws Exception{
        this.escenarioPrincipal=escenarioPrincipal;
        this.escenarioPrincipal.setTitle("IPC1-Tarea 2");
        this.cambiarEscenaLogin();
        this.escenarioPrincipal.show();
    }
    public void cambiarEscenaLogin(){
        try{
            LoginController controlador = (LoginController) this.cambiarEscena("LoginView.fxml",391,350);
            controlador.setEscenarioPrincipal(this);
        }catch(IOException e){
            e.printStackTrace();
        }

    }
    public Initializable cambiarEscena(String escena, int ancho, int alto) throws IOException {
        Initializable resultado = null;
        FXMLLoader cargadorFXML = new FXMLLoader(getClass().getResource(this.CarpetaViews + escena));
        AnchorPane root = (AnchorPane) cargadorFXML.load();
        Scene scene = new Scene(root, ancho, alto);
        scene.getStylesheets().add("org/ipc_t1/resource/style/estilo.css");
        this.escenarioPrincipal.setScene(scene);
        this.escenarioPrincipal.sizeToScene();
        resultado = (Initializable) cargadorFXML.getController();
        return resultado;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
