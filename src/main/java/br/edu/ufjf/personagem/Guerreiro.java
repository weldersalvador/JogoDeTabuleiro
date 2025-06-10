package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */

public class Guerreiro extends Personagem {
    public Posicao posicao = new Posicao();    
    public Guerreiro(){
        super(15, 10, 1,"Guerreiro");
    }

    public void ativarPoderEspecial() {
        if(mana == 100){
            setMana(0);
            this.forcaDeAtaque *= 2;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
        }
    }
    
}
