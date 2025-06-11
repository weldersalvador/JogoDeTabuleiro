package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Wemerson
 */
public class Guerreiro extends Personagem {

    public Posicao posicao = new Posicao();
    public Guerreiro(String nome) {
        super(15, 10, 1, "Guerreiro", nome);
    }

    @Override
    public void ativarPoderEspecial(Personagem inimigo) {
        setMana(0);
        if(getForcaDeAtaque() == 15){
            System.out.println("Poder especial ativado! A forca do guerreiro foi dobrada! ");
            setForcaDeAtaque(getForcaDeAtaque() * 2);
        }
        else{
            System.out.println("Poder especial ja foi usado! Passando turno...");
        }
            
    }

}
