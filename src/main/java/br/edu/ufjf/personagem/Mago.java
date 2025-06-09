/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Welder
 */
public class Mago extends Personagem{
    public Posicao posicao = new Posicao();
    public Mago(){
        super(10, 7, 3);
    }
    
    public boolean ativarPoderEspecial(Personagem inimigo){
        if(mana == 100){
            setMana(0);
            inimigo.setVida(this.vida);
            this.setVida(inimigo.getVida());
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar o poder especial.");
            return false;
        }
    }
    
}
