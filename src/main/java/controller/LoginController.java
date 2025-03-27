/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dal.ConexaoBD;
import java.sql.Connection;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 *
 * @author Aluno
 */
public class LoginController {

    private Stage stageLogin;
    private Connection conexao;

    @FXML
    private Button btnFechar;

    @FXML
    private Button btnLogar;

    @FXML
    private TextField txtUsuario;

    @FXML
    private PasswordField txtSenha;

    @FXML
    private Label lblUsuario;

    @FXML
    private Label lblSenha;

    @FXML
    void btnFecharLick(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void btnLogarClick(ActionEvent event) {

    }

    public void setStage(Stage stage) {
        this.stageLogin = stage;

    }

    public void verificarBanco() {
        this.conexao = ConexaoBD.conectar();
        if (this.conexao != null) {
            System.out.println("Conectou no Banco de Dados");
        } else {
            System.out.println("Problema na conexão");
        }
    }

    public void abrirJanela() {
        verificarBanco();
    }

}
