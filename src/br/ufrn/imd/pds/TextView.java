/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.pds;

/**
 * ConcreteComponent: define um objeto para o qual responsabilidades adicionais podem ser
 * atribuídas.
 * 
 * @author edilvolima
 */
class TextView extends VisualComponent {
    
    public  void  draw(){
        System.out.println("desenha uma janela");
    }
}

