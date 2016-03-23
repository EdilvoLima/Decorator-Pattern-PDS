/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufrn.imd.pds;

/**
 *Decorator: mantém uma referência para um objeto Component.
 * Define uma interface que segue a interface de Component 
 * 
 * @author edilvolima
 */
abstract class Decorator extends VisualComponent {

    protected VisualComponent janelaDecorada;

    public Decorator(VisualComponent janelaDecorada) {
        this.janelaDecorada = janelaDecorada;
    }
}
