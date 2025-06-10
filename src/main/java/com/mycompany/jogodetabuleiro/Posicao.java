package com.mycompany.jogodetabuleiro;

import java.util.Random;

/**
 *
 * @author Vitor
 */
public class Posicao {
    protected int x, y;
    
    public Posicao(){
        Random numeroAleatorio = new Random();
        
        this.x = numeroAleatorio.nextInt(10);
        this.y = numeroAleatorio.nextInt(10);
    }
    
    
    
}
