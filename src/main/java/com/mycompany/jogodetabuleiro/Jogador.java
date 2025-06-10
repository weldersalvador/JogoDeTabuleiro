package com.mycompany.jogodetabuleiro;

import br.edu.ufjf.personagem.Personagem;

/**
 *
 * @author assuncao-v
 */
public class Jogador {
    private final String nome;
    private final String classe;
    private Personagem personagem;
    
    
    public Jogador(String nome, String classe){
        this.nome = nome;
        this.classe = classe;
    }
    
    //Gets
    public String getNome(){
        return this.nome;
    }
    public String getClasse(){
        return this.classe;
    }
    public Personagem getPersonagem(){
        return this.personagem;
    }
    //Sets
    public void setPersonagem(Personagem personagem){
        this.personagem = personagem;
    }
    
}
