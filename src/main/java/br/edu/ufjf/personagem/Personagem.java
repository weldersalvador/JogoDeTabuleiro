package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 * 
 * @author Vitor
 */

public abstract class Personagem {
    private int vida;
    private int forcaDeAtaque;
    private int forcaDeDefesa;
    private int alcanceDeAtaque;
    private int mana;
    private Posicao posicao;
    
    public Personagem(int forcaDeAtaque, int forcaDeDefesa, int alcanceDeAtaque){
        this.vida = 100;
        this.mana = 0;
        this.forcaDeAtaque = forcaDeAtaque;
        this.forcaDeDefesa = forcaDeDefesa;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.posicao = new Posicao();
    }
    
    //Gets
    public int getVida(){
        return this.vida;
    }
    public int getForcaDeAtaque(){
        return this.forcaDeAtaque;
    }
    public int getForcaDeDefesa(){
        return this.forcaDeDefesa;
    }
    public int getAlcanceDeAtaque(){
        return this.alcanceDeAtaque;
    }
    public int getMana(){
        return this.mana;
    }
    public Posicao getPosicao(){
        return this.posicao;
    } 

    //Sets
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setForcaDeAtaque(int forcaDeAtaque){
        this.forcaDeAtaque = forcaDeAtaque;
    }
    public void setForcaDeDefesa(int forcaDeDefesa){
        this.forcaDeDefesa = forcaDeDefesa;
    }
    public void setAlcanceDeAtaque(int alcanceDeAtaque){
        this.alcanceDeAtaque = alcanceDeAtaque;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public void setPosicao(Posicao posicao){
        this.posicao.x = posicao.x;
        this.posicao.y = posicao.y;
    }
    
    //Auxiliares
    public void receberDano(int dano){
        this.vida -= dano;
    }
    
    public abstract boolean ativarPoderEspecial(Personagem inimigo);
    
}
