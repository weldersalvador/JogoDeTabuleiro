package com.mycompany.jogodetabuleiro;

import com.mycompany.jogodetabuleiro.Tabuleiro;
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
    public Tabuleiro mesa;
    public Play(){
        escolhaDePersonagem = escolhaDoPersonagem.escolhaDoPersonagem();
        nomeDoPersonagem = escolhaDoPersonagem.defineNome();
        escolhaDoPersonagem.imprimeEscolha(nomeDoPersonagem, escolhaDePersonagem);
        int modo = escolheModo();
        mesa = new Tabuleiro();
    }
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
            }
        }   
    }
    Scanner input = new Scanner(System.in);
    public void iniciaGame(){
        int decisao;
        System.out.println("");
        decisao = input.nextInt();
        if(modoDeJogo == 1){
            Bot bot = new Bot();
            System.out.println("Seu turno, escolha o que fazer!");
            System.out.println("1 (andar), 2 (atacar), 3");
        }
    }
}    