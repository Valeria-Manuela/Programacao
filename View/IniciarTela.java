/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package View;

import Usuario.Usuario;



/**
 *
 * @author williambersagui
 */
public class IniciarTela {
    
  public static void main(String [] args){
      
      
      Telausuario tela_usuario = new Telausuario();
      
      tela_usuario.setVisible(true);
      
      /*Vamos instanciar a classe Usuario, depois de passar os valores para ela 
      
      
      a partir dos sets criados na classe Telausuario
      */
      
      Usuario usuario = new Usuario();
      
      String nome,senha;
      
      nome = usuario.getNome();
      
      senha = usuario.getSenha();
      
      System.out.print(nome);
      
    
      
      
      

      
        
      
       
       
        
        



  }
}
