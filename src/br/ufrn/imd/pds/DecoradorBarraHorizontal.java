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
public class DecoradorBarraHorizontal extends DecoratorJanela{
    
    public DecoradorBarraHorizontal(Janela janelaDecorada) {
        super(janelaDecorada);
    }

    public void draw() {
        drawBarraHorizontal();
        janelaDecorada.draw();
    }

    private void drawBarraHorizontal() {
        System.out.println("desenha uma barra horizontal na janela");
    }
}
