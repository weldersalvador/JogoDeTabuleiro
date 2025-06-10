package com.mycompany.jogodetabuleiro;

import java.util.Random;

/**
 *
 * @author Wemerson
 */

public class Tabuleiro {
    public String[][] Tabuleiro2D = new String[10][10];
    public Tabuleiro(Posicao posicao1, Posicao posicao2){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                Tabuleiro2D[i][j] = "*";
            }
        }
        Tabuleiro2D[posicao1.x][posicao1.y] = "p1";
        Tabuleiro2D[posicao2.x][posicao2.y] = "p2";
        for(int i = 0; i < 10; i++){
            System.out.println("");
            for(int j = 0; j < 10; j++){
                System.out.print(Tabuleiro2D[i][j] + " ");
            }
        }
    }
    public void Imprime(){
        System.out.println("");
        for(int i = 0; i < 10; i++){
            System.out.println("");
            for(int j = 0; j < 10; j++){
                System.out.print(Tabuleiro2D[i][j] + " ");
            }
        }
    }
    public void andar1(String andar,Posicao posicao1){
        if("C".equals(andar)){
            if(posicao1.x == 0){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao1.x - 1][posicao1.y] == "p2"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao1.x][posicao1.y] = "*";
                posicao1.x = posicao1.x - 1;
                Tabuleiro2D[posicao1.x][posicao1.y] = "p1";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para cima! ");
            }
        }
        if("B".equals(andar)){
            if(posicao1.x == 9){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao1.x + 1][posicao1.y] == "p2"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao1.x][posicao1.y] = "*";
                posicao1.x = posicao1.x + 1;
                Tabuleiro2D[posicao1.x][posicao1.y] = "p1";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para baixo! ");
            }
        }
        if("D".equals(andar)){
            if(posicao1.x == 9){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao1.x][posicao1.y + 1] == "p2"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao1.x][posicao1.y] = "*";
                posicao1.y = posicao1.y + 1;
                Tabuleiro2D[posicao1.x][posicao1.y] = "p1";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para direita! ");
            }
        }
        if("E".equals(andar)){
            if(posicao1.x == 0){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao1.x][posicao1.y - 1] == "p2"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao1.x][posicao1.y] = "*";
                posicao1.y = posicao1.y - 1;
                Tabuleiro2D[posicao1.x][posicao1.y] = "p1";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para esquerda! ");
            }
        }
    }
    public void andar2(String andar2,Posicao posicao){
        if("C".equals(andar2)){
            if(posicao.x == 0){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao.x - 1][posicao.y] == "p1"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao.x][posicao.y] = "*";
                posicao.x = posicao.x - 1;
                Tabuleiro2D[posicao.x][posicao.y] = "p2";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para cima! ");
            }
        }
        if("B".equals(andar2)){
            if(posicao.x == 9){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao.x + 1][posicao.y] == "p1"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao.x][posicao.y] = "*";
                posicao.x = posicao.x + 1;
                Tabuleiro2D[posicao.x][posicao.y] = "p2";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para baixo! ");
            }
        }
        if("D".equals(andar2)){
            if(posicao.x == 9){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao.x][posicao.y + 1] == "p1"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao.x][posicao.y] = "*";
                posicao.y = posicao.y + 1;
                Tabuleiro2D[posicao.x][posicao.y] = "p2";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para direita! ");
            }
        }
        if("E".equals(andar2)){
            if(posicao.x == 0){
                System.out.println("Voce esta na borda! Passando turno...");
            }
            else if(Tabuleiro2D[posicao.x][posicao.y - 1] == "p1"){
                System.out.println("Comando invalido! Passando turno...");
            }
            else{
                Tabuleiro2D[posicao.x][posicao.y] = "*";
                posicao.y = posicao.y - 1;
                Tabuleiro2D[posicao.x][posicao.y] = "p2";
                Imprime();
                System.out.println("");
                System.out.println("Voce andou uma casa para esquerda! ");
            }
        }
    }
}
