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
    public void ativarPoderEspecial(Personagem inimigo){
        int contador = 0;
        if (contador == 0){
            int temp;
            temp = inimigo.getVida();
            inimigo.setVida(getVida());
            this.setVida(temp);
            contador++;
            System.out.printf("Poder especial ativado! As vidas foram invertidas!");
        }
        else{
            System.out.println("Poder especial ja utilizado! Passando turno...");
        }
    }
}
