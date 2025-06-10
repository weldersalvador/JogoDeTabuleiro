package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */
public class Arqueiro extends Personagem{
    
    public Arqueiro(String nome){        
        super(8,5,5,"Arqueiro", nome);
        
    }
    
    @Override
    public boolean ativarPoderEspecial(Personagem inimigo){
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
