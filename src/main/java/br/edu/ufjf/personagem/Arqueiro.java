/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.ufjf.personagem;

/**
 *
 * @author Wemerson
 */
public class Arqueiro extends Personagem{    
    public Arqueiro(){        
        super(5,8,5);
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
