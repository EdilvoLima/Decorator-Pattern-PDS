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
public class DecoradorBarraVertical extends DecoratorJanela {

    public DecoradorBarraVertical(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    public void draw() {
        drawBarraVertical();
        janelaDecorada.draw();
    }

    private void drawBarraVertical() {
        System.out.println("desenha uma barra vertical na janela");
    }

}
