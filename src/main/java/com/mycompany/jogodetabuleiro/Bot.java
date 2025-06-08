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

/**
 *
 * @author Wemerson
 */
public class Bot {
    public int escolhaDePersonagem;
    int defesa = 10;//(??) Por que 10?
    protected Personagem personagem;
    
    public int atacar(){
        //Este é o rule switch. Ele tem uma diferença sutil do regular switch.
        switch (escolhaDePersonagem) {
            case 1 -> {
                personagem = new Mago();
                return personagem.getForcaDeAtaque();
            }
            case 2 -> {
                personagem = new Guerreiro();
                return personagem.getForcaDeAtaque();
            }
            default -> {
                personagem = new Arqueiro();
                return personagem.getForcaDeAtaque();
            }
        }
    }
}
