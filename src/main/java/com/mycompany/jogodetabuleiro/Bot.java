/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

import java.util.Random;

/**
 *
 * @author Wemerson
 */
public class Bot {
    public int escolhaDePersonagem;
    int vida = 100;
    int defesa = 10;
    Mago magoBot = new Mago();
    Guerreiro guerreiroBot = new Guerreiro();
    Arqueiro arqueiroBot = new Arqueiro();
    public int atacar(){
        if(escolhaDePersonagem == 1){
            return magoBot.getAtaque();
        }
        else if (escolhaDePersonagem == 2){
            return guerreiroBot.getAtaque();
        }
        else{
            return arqueiroBot.getAtaque();
        }
    }
}
