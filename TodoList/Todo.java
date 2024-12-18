/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TodoList;

import Controller.UsuarioController;
import Tarefa.Tarefa;

/**
 *
 * @author williambersagui
 */
public class Todo {
    
    
   public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("Hello World!");
        
        Tarefa tarefa = new Tarefa();
        
        tarefa.setNome_tarefa("Dar de Comer aos caes");
        
        tarefa.setTipo_tarefa("Exercicio");
        
        tarefa.setData_criacao_tarefa("23/10/2003");
        
        tarefa.setData_conclusao_tarefa("25/03/2018");
        
        

        
       
         
        
        new UsuarioController().cadastrar(tarefa);
        
    }
}

