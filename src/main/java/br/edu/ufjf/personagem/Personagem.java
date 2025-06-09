package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 *
 * @author Vitor
 */

public abstract class Personagem {
    protected int vida;
    protected int forcaDeAtaque;
    protected int forcaDeDefesa;
    protected int alcanceDeAtaque;
    protected int mana;
    protected String classe;
    protected Posicao posicao = new Posicao();
    
    Personagem(int forcaDeAtaque, int forcaDeDefesa, int alcanceDeAtaque,String classe){
        this.vida = 100;
        this.mana = 0;
        this.forcaDeAtaque = forcaDeAtaque;
        this.forcaDeDefesa = forcaDeDefesa;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.classe = classe;
        
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
    public void getClasse(){
        System.out.println("");
        System.out.println("Voce esta jogando contra um " + classe + "!");
    }
    public Posicao getPosicao(){
        return this.posicao;
    } 
    //Sets
    public void setVida(int vida){
        this.vida = vida;
    }
    public void setForcaDeDefesa(int forcaDeDefesa){
        this.forcaDeDefesa = forcaDeDefesa;
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
        
}
