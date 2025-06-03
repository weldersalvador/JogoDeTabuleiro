/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

/**
 *
 * @author Wemerson
 */
public class Play {
    escolhePersonagens escolhaDoPersonagem = new escolhePersonagens();
    escolheModoDeJogo modoDeJogo = new escolheModoDeJogo();
    private final int escolhaDePersonagem;
    private final int modo;
    private final String nomeDoPersonagem;
    private enum Status {CONTINUE, LOSE, WIN}; 
    Status gameStatus = Status.CONTINUE;
    public Play(){
        escolhaDePersonagem = escolhaDoPersonagem.escolhaDoPersonagem();
        nomeDoPersonagem = escolhaDoPersonagem.defineNome();
        modo = modoDeJogo.escolheModo();
        escolhaDoPersonagem.imprimeEscolha(nomeDoPersonagem, escolhaDePersonagem);
        Tabuleiro mesa = new Tabuleiro();
    }
    public void game(){
        while(gameStatus == CONTINUE){
            
        }
    }
}
