/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

/**
 *
 * @author Wemerson
 */
public class Arqueiro {
    private int vida = 100;
    private int forcaDeDefesa = 5;
    private int forcaDeAtaque  = 8;
    private int alcanceDeAtaque = 5;
    public int getVida(){
        return vida;
    }
    public int getDefesa(){
        return forcaDeDefesa;
    }
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setDefesa(int defesa){
        forcaDeDefesa = defesa;
    }
    public int getAlcance(){
        return alcanceDeAtaque;
    }
    public int getAtaque(){
        return forcaDeAtaque;
    }
}
