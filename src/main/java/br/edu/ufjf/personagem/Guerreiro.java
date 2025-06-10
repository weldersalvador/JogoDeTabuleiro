package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */

public class Guerreiro extends Personagem {
    public Guerreiro(String nome){
        super(15, 10, 1);
    }

    @Override
    public boolean ativarPoderEspecial(Personagem inimigo) {
        if(getMana() == 100){
            setMana(0);
            setForcaDeAtaque(getForcaDeAtaque()*2);
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
    
}
