/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.pds;

/**
 *
 * @author edilvolima
 */
public class DecoratorTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            O ConcreteComponent é passado ao ConcreteDecorator que adiciona 
            a responsabilidade. 
        */ 
        VisualComponent janelaDecorada = new ScrollDecorator(new TextView());
		janelaDecorada.draw();
                
        System.out.println("----");
        
        janelaDecorada = new BorderDecorator(
                new ScrollDecorator(new TextView()));
                janelaDecorada.draw();
                
    }
    
}
