/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import dal.ConexaoBD;
import java.sql.Connection;

public abstract  class GenericDAO {
    private Connection conexao;
    
    protected  GenericDAO(){
        this.conexao = ConexaoBD.conectar();
    }
    protected Connection conectarDAO(){
        this.conexao = ConexaoBD.conectar();    
        return conexao;
    } 
}
