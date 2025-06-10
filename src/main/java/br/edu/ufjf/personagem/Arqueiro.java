package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */
public class Arqueiro extends Personagem{
    
    public Arqueiro(String nome){        
        super(8,5,5);
        
    }
    
    @Override
    public boolean ativarPoderEspecial(Personagem inimigo){
        setAlcanceDeAtaque(getAlcanceDeAtaque() + 1);
        return true;
    }
}
