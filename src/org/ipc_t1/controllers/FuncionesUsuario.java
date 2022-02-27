package org.ipc_t1.controllers;

import javafx.scene.control.Alert;
import org.ipc_t1.models.Usuario;

public class FuncionesUsuario {
    public static int limite=100, loginNoFound=0, cont=1, c;
    private static Usuario users[]=new Usuario[100];

    //DATOS A MOSTRAR
    public static int[] dpi=new int[100];
    public static String[] nom=new String[100];
    public static String[] ape=new String[100];
    public static String[] usern=new String[100];
    public static String[] pass=new String[100];
    public static String[] rol=new String[100];
    public static Usuario user=new Usuario(2020010689,"admin","1234","José","Galdámez","Administrador");
    String res;

    //LOGIN
    public void login(String username, String password){
        users[0]=user;
        dpi[0]=user.getDpi();
        nom[0]=user.getNombre();
        ape[0]=user.getApellido();
        usern[0]=user.getUsername();
        pass[0]=user.getPassword();
        rol[0]=user.getRol();

        for (int i=0; i<cont; i++){
            if(username.equals(users[i].getUsername()) && password.equals(users[i].getPassword()) && username.length()>2 && password.length()>2){

                Alert aviso = new Alert(Alert.AlertType.CONFIRMATION);
                aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
                aviso.setHeaderText("Login");
                aviso.setContentText("Bienvenido de nuevo "+users[i].getNombre()+ " "+ users[i].getApellido()+"!");
                aviso.show();
                res="1";
                loginNoFound=0;
                i=limite;
            }else{
                loginNoFound=1;
            }
        }
        if(loginNoFound==1){
            Alert aviso = new Alert(Alert.AlertType.ERROR);
            aviso.setTitle("SISTEMA DE BIBLIOTECA USAC");
            aviso.setHeaderText("Login");
            aviso.setContentText("Datos erroneos, porfavor vuelva a intentar.");
            aviso.show();
            res="0";
        }
    }
}
