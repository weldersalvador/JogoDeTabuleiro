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
    public void ativarPoderEspecial(Personagem inimigo){
        int contador = 0;
        if(contador == 0){
            setAlcanceDeAtaque(getAlcanceDeAtaque() + 1);
            System.out.println("Poder especial ativado! Alcance aumentado em 1");
        }
        else{
            System.out.println("Poder especial ja foi ativado! Passando turno...");
        }
    }
}
