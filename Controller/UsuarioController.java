/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;


import Tarefa.Tarefa;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author williambersagui
 */
public class UsuarioController {
    
    // Vamos criar um metodo para inserir dados
    
    public void cadastrar(Tarefa tarefa) throws ClassNotFoundException{
        
        String sql = "INSERT INTO tarefa(nome_tarefa, data_criacao_tarefa, data_conclusao_tarefa ,tipo_tarefa) VALUES (?,?,?,?)";
        
        PreparedStatement ps = null;
        
        
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            
            ps.setString(1, tarefa.getNome_tarefa());
            
            ps.setString(2, tarefa.getData_criacao_tarefa());
            
            ps.setString(3,tarefa.getData_conclusao_tarefa());
           
            ps.setString(4, tarefa.getTipo_tarefa());
            
            
             
          
            ps.execute();
            
            ps.close();
            
            
            
            // Vamos configurar os valores que o usuario recebe
        } catch (SQLException e) {
            e.printStackTrace();
        }
        
        
        
        
        
        
        
    }
    
}

    

