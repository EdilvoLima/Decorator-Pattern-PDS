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
public class BorderDecorator extends Decorator{
    
    public BorderDecorator(VisualComponent windowDecortated) {
        super(windowDecortated);
    }

    public void draw() {
        drawBorder();
        janelaDecorada.draw();
    }

    private void drawBorder() {
        System.out.println("desenha uma borda na janela");
    }
}
