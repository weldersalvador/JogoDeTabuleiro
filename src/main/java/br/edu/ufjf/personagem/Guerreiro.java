/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.personagem;

/**
 *
 * @author Wemerson
 */
public class Guerreiro extends Personagem {    
    public Guerreiro(){
        super(8, 15, 1);
    }

    public boolean ativarPoderEspecial() {
        if(mana == 100){
            setMana(0);
            this.forcaDeAtaque *= 2;
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
    
}
