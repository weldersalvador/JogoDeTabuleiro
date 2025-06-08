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
    public String[][] Tabuleiro2D = new String[10][10];
    public Tabuleiro(){
        while(posicaoLinha2 > 9){
            posicaoLinha2 = posicaoLinha2 + numeroAleatorio.nextInt(4);
        }
        while(posicaoLinha1 > 9){
            posicaoLinha1 = posicaoLinha1 + numeroAleatorio.nextInt(4);
        }
        while(posicaoColuna1 > 9){
            posicaoColuna1 = posicaoColuna1 + numeroAleatorio.nextInt(4);
        }
        while(posicaoColuna2 > 9){
            posicaoColuna2 = posicaoColuna2 + numeroAleatorio.nextInt(4);
        }
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
    public void andar(String direcao){
        if(direcao == "C" || direcao == "c"){
            posicaoLinha1--;
            Tabuleiro2D[posicaoLinha1][posicaoColuna1] = "p1";
            Tabuleiro2D[posicaoLinha1 + 1][posicaoColuna1] = "*";
            Imprime();
        }
        else if(direcao == "d" || direcao == "D"){
            posicaoColuna1++;
            Tabuleiro2D[posicaoLinha1][posicaoColuna1] = "p1";
            Tabuleiro2D[posicaoLinha1][posicaoColuna1 - 1] = "*";
            Imprime();
        }
        else if (direcao == "B" || direcao == "b"){
            posicaoLinha1++;
            Tabuleiro2D[posicaoLinha1][posicaoColuna1] = "p1";
            Tabuleiro2D[posicaoLinha1 - 1][posicaoColuna1] = "*";
            Imprime();
        }
        else if (direcao == "E" || direcao == "e"){
            posicaoLinha1--;
            Tabuleiro2D[posicaoLinha1][posicaoColuna1] = "p1";
            Tabuleiro2D[posicaoLinha1 + 1][posicaoColuna1] = "*";
            Imprime();
        }
    }
    public void Imprime(){
        System.out.println("");
        System.out.println("");
        for(int i = 0; i < 10; i++){
            System.out.println("");
            for(int j = 0; j < 10; j++){
                System.out.print(Tabuleiro2D[i][j] + " ");
            }
        }
    }
    public boolean valida(String andar){
        if(andar == "C" || andar == "c"){
            if(posicaoLinha1 == 0){
                return false;
            }
            return true;
        }
        else if(andar == "d" || andar == "D"){
            if(posicaoColuna1 == 10){
                return false;
            }
            return true;
        }
        else if (andar == "B" || andar == "b"){
            if(posicaoLinha1 == 10){
                return false;
            }
            return true;
        }
        else if (andar == "E" || andar == "e"){
            if(posicaoColuna1 == 0){
                return false;
            }
            return true;
        }
        else{
            return false;
        }
    }
}
