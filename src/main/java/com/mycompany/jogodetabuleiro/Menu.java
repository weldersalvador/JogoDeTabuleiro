/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

import br.edu.ufjf.personagem.Arqueiro;
import br.edu.ufjf.personagem.Guerreiro;
import br.edu.ufjf.personagem.Mago;
import br.edu.ufjf.personagem.Personagem;
import java.util.Scanner;

/**
 *
 * @author assuncao-v
 */
public class Menu {
    
    public static int escolheModo(){
        int escolha;
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar qual modo de jogo:");
        System.out.println("1 - PVP");
        System.out.println("2 - PVE");
        
        escolha = input.nextInt();
        switch(escolha){
            case 0 ->{
                System.out.println("O modo de jogo escolhido foi PVP! ");
                return 0;
            }
            case 1 ->{
                System.out.println("O modo de jogo escolhido foi PVE! ");
                return 1;
            }
            default ->{
                System.out.println("Escolha inválida! ");
                return -1;
            }
        }
    private static void imprimeClasses(){
        String [] infoClasseMago = {"Classe: Mago",
                "Defesa:",
                "",
                "",
                ""};
                

        String [] infoClasseGuerreiro = {"Classe: Guerreiro",
                "Defesa",
                "",
                "",
                ""};

        String [] infoClasseArqueiro = {"Classe: Arqueiro",
                "Defesa",
                "",
                "",
                ""};
        for(int i = 0)
        
    }
    public static Jogador escolhaDoPersonagem(){
        int escolha;
        String nome;
        Personagem personagem;
    
        Scanner input = new Scanner(System.in);
        System.out.printf("Qual é o nome de seu personagem?\n R.:  ");
        nome = input.nextLine();
                
        System.out.printf("%s será de qual classe?\n", nome);
        System.out.printf("Opções:");
        imprimeClasses();
        
        escolha = input.nextInt();
        while(escolha != 1 && escolha != 2 && escolha != 3){
            System.out.println("Escolha invalida! Escolha novamente: ");
            escolha = input.nextInt();
        }
        switch(escolha){
            case 1 -> {
                personagem = new Mago(nome);
            }
            case 2 -> {
                personagem = new Guerreiro(nome);
            }
            case 3 -> {
                personagem = new Arqueiro(nome);
            }
        }
        return personagem;
    }
    public String defineNome(){
        System.out.print("Digite o nome do seu personagem: ");
        Scanner input = new Scanner(System.in);
        nome = input.nextLine();
        return nome;
    }
    public void imprimeEscolha(String nome,Personagem classe){
        
        System.out.println("Personagem: ");
        escolha = classe.getForcaDeAtaque();
        switch(escolha){
            case 10:
                System.out.println("Mago(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 7");
                System.out.println("Ataque: 10");
                System.out.println("Alcance: 3");
                break;
            case 15:
                System.out.println("Guerreiro(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 10");
                System.out.println("Ataque: 15");
                System.out.println("Alcance: 1");
                break;
            case 8:
                System.out.println("Arqueiro(a) " + nome + "");
                System.out.println("Pontos de vida: 100");
                System.out.println("Pontos de defesa: 5");
                System.out.println("Ataque: 10");
                System.out.println("Alcance: 5");
                break;
        }
    }
}
