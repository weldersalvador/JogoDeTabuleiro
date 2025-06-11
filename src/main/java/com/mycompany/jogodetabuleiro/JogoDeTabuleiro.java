/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.jogodetabuleiro;

import java.util.Scanner;

/**
 *
 * @author Wemerson
 */
public class JogoDeTabuleiro {

    public static void main(String[] args) {
        int escolhaPartida = 0;
        Scanner input = new Scanner(System.in);
        while(escolhaPartida == 0){
            Play p = new Play();
            p.iniciaGame();
            System.out.println("Deseja jogar novamente? Sim (0) Nao (1)");
            escolhaPartida = input.nextInt();
        }
        System.out.println("Obrigado por jogar!!");
    }
}
