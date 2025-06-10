/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

//import java.util.Random;

import br.edu.ufjf.personagem.Arqueiro;
import br.edu.ufjf.personagem.Mago;
import br.edu.ufjf.personagem.Guerreiro;
import br.edu.ufjf.personagem.Personagem;
import java.util.Random;

/**
 *
 * @author Wemerson
 */

public class Bot {
    Random numeroAleatorio = new Random();
    public int escolhaDePersonagem;
    public Bot(){
        escolhaDePersonagem = 1 + numeroAleatorio.nextInt(3);
        switch(escolhaDePersonagem){
            case 1 -> {
                    personagem = new Mago("bot");
                }
            case 2 -> {
                   personagem = new Guerreiro("bot");
            }
            default -> {
                personagem = new Arqueiro("bot");
            }
        }           
    }
    protected Personagem personagem;
    public int atacar(){
        return personagem.getForcaDeAtaque();
    }
}
