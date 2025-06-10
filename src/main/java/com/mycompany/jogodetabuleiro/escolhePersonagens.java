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

public class escolhePersonagens {
    private int escolha;
    public String nome;
    protected Personagem personagem;
    public Personagem escolhaDoPersonagem(){
        Scanner input = new Scanner(System.in);
        System.out.println("Escolha o personagem a ser jogado: ");
        System.out.println("Mago(1), Guerreiro(2), Arqueiro(3)");
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
