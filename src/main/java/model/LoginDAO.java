/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Aluno
 */
public class LoginDAO extends GenericDAO {

    //Banco Online
    public Boolean bancoOnline() {
        Connection con = conectarDAO();
        if (con != null) {
            return true;
        } else {
            return false;
        }
    }

    //Autenticar Usuário
    public Usuario autenticar(String login, String senha) throws SQLException {
        String sql = "SELECT * FROM USUARIOS WHERE login=? AND senha =?";
        Usuario usuario = null;
        Connection con = conectarDAO();
        if (con != null) {
            PreparedStatement stm = con.prepareStatement(sql);
            stm.setString(1, login);
            stm.setString(2, senha);
            ResultSet rs = stm.executeQuery();

            //percorre o resultSet
            while (rs.next()) {
                usuario = new Usuario();
                usuario.setId(rs.getInt("id"));
                usuario.setNome(rs.getString("nome"));
                usuario.setFone(rs.getString("fone"));
                usuario.setLogin(rs.getString("login"));
                usuario.setSenha(rs.getString("senha"));
                usuario.setPerfil(rs.getString("perfil"));
            }
        } else {
            return null;
        }
    }
}
