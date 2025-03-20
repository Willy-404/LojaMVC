/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dal;

import java.sql.Connection;

/**
 *
 * @author Aluno
 */
public class ConecaoBD {
    private static final String URL_MYSQL = "jdbc:mysql://localhost:3306/lojaBD";
    private static final String DRIVER_CLASS = "com.mysql.cj.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "aluno";
    
    public static Connection conectar(){
        return null;
    }
    public void desconectar(Connection conexao){
        
    }
    
}
