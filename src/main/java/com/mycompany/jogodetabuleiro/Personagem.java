/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

/**
 *
 * @author assuncao-v
 */
public abstract class Personagem {
    protected int vida;
    protected int forcaDeAtaque;
    protected int forcaDeDefesa;
    protected int alcanceDeAtaque;
    protected int mana;
    
    
    Personagem(int forcaDeAtaque, int forcaDeDefesa, int alcanceDeAtaque){
        this.vida = 100;
        this.mana = 0;
        this.forcaDeAtaque = forcaDeAtaque;
        this.forcaDeDefesa = forcaDeDefesa;
        this.alcanceDeAtaque = alcanceDeAtaque;
    }
    
    //Gets
    public int getVida(){
        return this.vida;
    }
    public int getForcaAtaque(){
        return this.forcaDeAtaque;
    }
    public int getForcaDeDefesa(){
        return this.forcaDeDefesa;
    }
    public int getAlcanceDeAtaque(){
        return this.alcanceDeAtaque;
    }
    public int getMana(){
        return this.mana;
    }
    //Sets
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setForcaDeDefesa(int forcaDeDefesa){
        this.forcaDeDefesa = forcaDeDefesa;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    
    //Auxiliares
    public void receberDano(int dano){
        this.vida -= dano;
    }
        
}
