package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Welder
 */
public class Mago extends Personagem{
    public Posicao posicao = new Posicao();
    public Mago(String nome){
        super(10, 7, 3,"Mago", nome);

    }
    
    @Override
    public boolean ativarPoderEspecial(Personagem inimigo){
        if(getMana() == 100){
            setMana(0);
            inimigo.setVida(getVida());
            this.setVida(inimigo.getVida());
            //System.out.printf("TROCAR VIDA! O Mago %s",getNome());
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar o poder especial.");
            return false;
        }
    }
    
}
