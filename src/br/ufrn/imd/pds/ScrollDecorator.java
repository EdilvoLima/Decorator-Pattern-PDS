/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.pds;

/**
 *ConcreteDecorator: acrescenta responsabilidades ao Component
 * 
 * @author edilvolima
 */
public class ScrollDecorator extends Decorator {

    public ScrollDecorator(VisualComponent windowDecorated) {
        super(windowDecorated);
    }

    public void draw() {
        scrollTo();
        janelaDecorada.draw();
    }

    private void scrollTo() {
        System.out.println("desenha uma barra de scroll na janela");
    }

}
