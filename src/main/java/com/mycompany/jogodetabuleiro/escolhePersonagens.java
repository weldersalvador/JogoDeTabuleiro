/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

import java.util.Scanner;

public class escolhePersonagens {
    private int escolha;
    public String nome;
    public int escolhaDoPersonagem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o personagem a ser jogado: ");
        System.out.println("Mago(1), Guerreiro(2), Arqueiro(3)");
        escolha = input.nextInt();
        return escolha;
    }
    public String defineNome(){
        System.out.print("Digite o nome do seu personagem: ");
        Scanner input = new Scanner(System.in);
        nome = input.nextLine();
        return nome;
    }
    public void imprimeEscolha(String nome,int classe){
        
        System.out.println("Personagem: ");
        escolha = classe;
        switch(escolha){
            case 1:
                System.out.println("Mago(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 7");
                System.out.println("Ataque: 10");
                System.out.println("Alcance: 3");
                break;
            case 2:
                System.out.println("Guerreiro(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 10");
                System.out.println("Ataque: 15");
                System.out.println("Alcance: 1");
                break;
            case 3:
                System.out.println("Arqueiro(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 5");
                System.out.println("Ataque: 10");
                System.out.println("Alcance: 5");
                break;
        }
    }
}
