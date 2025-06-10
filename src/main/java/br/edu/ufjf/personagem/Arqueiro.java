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
        if(getMana() == 100){
            setMana(0);
            setMana(getMana()+1);
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
}
