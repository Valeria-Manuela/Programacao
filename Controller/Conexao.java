/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Valeria Cori
 */
public class Conexao {
    
    
    // Para nao termos que instanciar o banco de dados sempre podemos passar como static
    
    private static final String URL = "jdbc:mysql://localhost:3306/TodoList?useSSL=false&serverTimezone=UTC"; 
    
 
    
    private static final String USER = "root";
    
    private static final String PASSWORD = "root@admin";
    
   
    
    // Vamos criar um objecto do tipo connection
    
    private static Connection conn;
   
   public static Connection getConexao() throws ClassNotFoundException{
       
       try{
       
       if(conn == null){
           
           // Caso nao tenha uma conexao, vamos criar ela
           
            Class.forName("com.mysql.cj.jdbc.Driver"); /* Aqui registra */
           
           conn = DriverManager.getConnection(URL, USER,PASSWORD);
           
       }
       }catch( SQLException e){
           
           e.printStackTrace();
       }
       return conn;
       
       
       
   
   
   
   
   
   
   }
   
}
    
   

