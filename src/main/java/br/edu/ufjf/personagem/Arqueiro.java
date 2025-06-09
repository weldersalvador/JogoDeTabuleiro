/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */
public class Arqueiro extends Personagem{
    public Posicao posicao = new Posicao();
    public Arqueiro(){        
        super(8,5,5,"Arqueiro");
    }
    
    public boolean ativarPoderEspecial(){
        if(mana == 100){
            setMana(0);
            this.alcanceDeAtaque++;
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
}
