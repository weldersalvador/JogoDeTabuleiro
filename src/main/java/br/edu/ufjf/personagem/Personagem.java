package br.edu.ufjf.personagem;

import com.mycompany.jogodetabuleiro.Posicao;

/**
 * 
 * @author Vitor
 */

public abstract class Personagem {
    private final String nome;
    private final String classe;
    
    private int vida;
    private int forcaDeAtaque;
    private int forcaDeDefesa;
    private int alcanceDeAtaque;
    private int defesaAtual;
    private int mana;
    private Posicao posicao;
    
    public Personagem(String nome, String classe, int forcaDeAtaque, int forcaDeDefesa, int alcanceDeAtaque){
        this.nome = nome;
        this.classe = classe;
        this.vida = 100;
        this.mana = 0;
        this.forcaDeAtaque = forcaDeAtaque;
        this.forcaDeDefesa = forcaDeDefesa;
        this.alcanceDeAtaque = alcanceDeAtaque;
        this.posicao = new Posicao();
    }
    
    //Gets
    public String getNome(){
        return this.nome;
    }
    public String getClasse(){
        return this.classe;
    }
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
    public int getDefesaAtual(){
        return this.defesaAtual;
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
    public void setDefesaAtual(int defesaAtual){
        this.defesaAtual = defesaAtual;
    }
    public void setMana(int mana){
        this.mana = mana;
    }
    public void setPosicao(Posicao posicao){
        this.posicao = posicao;
    }
    
    
    //Auxiliares
    public void receberDano(int dano){
        this.vida -= dano;
    }
        
}
