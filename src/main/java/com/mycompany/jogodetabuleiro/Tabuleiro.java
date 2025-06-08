/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

import java.util.Random;

/**
 *
 * @author Wemerson
 */

public class Tabuleiro {
    Random numeroAleatorio = new Random();
    int posicaoLinha1 = numeroAleatorio.nextInt(10);
    int posicaoColuna1 = numeroAleatorio.nextInt(10);
    int posicaoLinha2 = posicaoLinha1 + numeroAleatorio.nextInt(4);
    int posicaoColuna2 = posicaoColuna1 + numeroAleatorio.nextInt(4);
    public Tabuleiro(){
        while(posicaoLinha2 > 10){
            posicaoLinha2 = posicaoLinha1 + numeroAleatorio.nextInt(4);
        }
        while(posicaoLinha1 > 10){
            posicaoColuna2 = posicaoLinha1 + numeroAleatorio.nextInt(4);
        }
        String[][] Tabuleiro2D = new String[10][10];
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                Tabuleiro2D[i][j] = "*";
            }
        }
        Tabuleiro2D[posicaoLinha1][posicaoColuna1] = "p1";
        Tabuleiro2D[posicaoLinha2][posicaoColuna2] = "p2";
        for(int i = 0; i < 10; i++){
            System.out.println("");
            for(int j = 0; j < 10; j++){
                System.out.print(Tabuleiro2D[i][j] + " ");
            }
        }
    }
}
