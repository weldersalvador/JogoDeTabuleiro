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
    /* escolheModo
     * Descrição: Realiza a rotina para definir o modo de jogo que regerá os comportamentos dos personagens. 
     * @return int tipoDoJogo
     */
    public int escolheModo(){
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar qual modo de jogo:");
        System.out.println("1 - PVP");
        System.out.println("2 - PVE");
        
        escolha = input.nextInt();
        while(escolha != 0 && escolha != 1){
            System.out.println("Opcao invalida! Por favor escolha novamente: ");
            System.out.println("1 - PVP");
            System.out.println("2 - PVE");
        }
        if(escolha == 0){
            System.out.println("O modo de jogo escolhido foi PVP! ");
            return 0;
        }
        else{
            if(escolha == 1){
                System.out.println("O modo de jogo escolhido foi PVE! ");
                return 1;
            }
        }
        return 1;
    }
}
