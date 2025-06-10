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
    public boolean ativarPoderEspecial(Personagem inimigo) {
        setMana(0);
        setForcaDeAtaque(getForcaDeAtaque() * 2);
        return true;
    }

}
