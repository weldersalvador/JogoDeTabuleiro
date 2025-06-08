/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

import java.util.Scanner;

/**
 *
 * @author Wemerson
 */
public final class Play {
    escolhePersonagens escolhaDoPersonagem = new escolhePersonagens();
    public int modoDeJogo;
    private final int escolhaDePersonagem;
    private final String nomeDoPersonagem;
    private enum Status {CONTINUE, LOSE, WIN}; 
    Status gameStatus = Status.CONTINUE;
    public Play(){
        escolhaDePersonagem = escolhaDoPersonagem.escolhaDoPersonagem();
        nomeDoPersonagem = escolhaDoPersonagem.defineNome();
        escolhaDoPersonagem.imprimeEscolha(nomeDoPersonagem, escolhaDePersonagem);
        escolheModo();
        Tabuleiro mesa = new Tabuleiro(); 
        
    }
<<<<<<< HEAD
    private int escolha;
    public int escolheModo(){
        
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar PVP (0) ou PVE? (1)");
        escolha = input.nextInt();
        if(escolha == 0){
            System.out.println("O modo de jogo escolhido foi PVP! ");
            return 0;
        }
        else{
            if(escolha == 1){
                System.out.println("O modo de jogo escolhido foi PVE! ");
                return 1;
            }
            else{
                System.out.println("Escolha inválida! ");
                return -1;
=======
    public void escolheModo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar PVP (0) ou PVE? (1)");
        modoDeJogo = input.nextInt();
        if(modoDeJogo == 0){
            System.out.println("O modo de jogo escolhido foi PVP! ");
        }
        else{
            if(modoDeJogo == 1){
                System.out.println("O modo de jogo escolhido foi PVE! ");
            }
            else{
                System.out.println("Escolha inválida! ");
>>>>>>> 3233b0d0c9f10e4f31afa2e38b27e9d10465b755
            }
        }
    }
}
