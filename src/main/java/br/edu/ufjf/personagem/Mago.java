package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Welder
 */
public class Mago extends Personagem {

    public Posicao posicao = new Posicao();

    public Mago(String nome) {
        super(10, 7, 3, "Mago", nome);

    }

    @Override
    public boolean ativarPoderEspecial(Personagem inimigo){

        inimigo.setVida(getVida());
        this.setVida(inimigo.getVida());
        //System.out.printf("TROCAR VIDA! O Mago %s",getNome());
        return true;
        
    }
}
