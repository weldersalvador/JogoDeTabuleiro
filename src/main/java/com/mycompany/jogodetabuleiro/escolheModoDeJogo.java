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
public class escolheModoDeJogo {
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
}
