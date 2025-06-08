/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.personagem;

/**
 *
 * @author Welder
 */
public class Mago extends Personagem{
    public Mago(){
        super(7, 10, 3);
    }
    
    public boolean ativarPoderEspecial(Personagem inimigo){
        if(mana == 100){
            setMana(0);
            inimigo.setVida(this.vida);
            this.setVida(inimigo.getVida());
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
    
}
