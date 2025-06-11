/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.jogodetabuleiro;

//import java.util.Random;
import br.edu.ufjf.personagem.Arqueiro;
import br.edu.ufjf.personagem.Mago;
import br.edu.ufjf.personagem.Guerreiro;
import br.edu.ufjf.personagem.Personagem;
import java.util.Random;

/**
 *
 * @author Wemerson
 */
public class Bot {

    Random numeroAleatorio = new Random();
    public int escolhaDePersonagem;
    protected Personagem personagem;
    public Bot() {
        escolhaDePersonagem = 1 + numeroAleatorio.nextInt(3);
        switch (escolhaDePersonagem) {
            case 1 -> {
                personagem = new Mago("bot");
            }
            case 2 -> {
                personagem = new Guerreiro("bot");
            }
            default -> {
                personagem = new Arqueiro("bot");
            }
        }
    }
    

    public void atacar(Personagem jogador) {
        if (jogador.getForcaDeDefesa() - personagem.getForcaDeAtaque() >= 0) {
            jogador.setForcaDeDefesa(jogador.getForcaDeDefesa() - personagem.getForcaDeAtaque());
        } else {
            jogador.setVida(jogador.getVida() - (personagem.getForcaDeAtaque() - jogador.getForcaDeDefesa()));
            jogador.setForcaDeDefesa(0);
        }
    }
    public void andarBot(Personagem jogador,Tabuleiro mesa){
        if(jogador.getPosicao().x - personagem.getPosicao().x > 0 && jogador.getPosicao().x - personagem.getPosicao().x != 0){
            mesa.andar2("B",personagem.getPosicao());
        }
        else if(jogador.getPosicao().x - personagem.getPosicao().x < 0 && Math.abs(jogador.getPosicao().x - personagem.getPosicao().x) != 0){
            mesa.andar2("C",personagem.getPosicao());
        }
        else if(jogador.getPosicao().y - personagem.getPosicao().y < 0 && Math.abs(jogador.getPosicao().y - personagem.getPosicao().y) != 0){
            mesa.andar2("E",personagem.getPosicao());
        }
        else if(jogador.getPosicao().y - personagem.getPosicao().y > 0 && Math.abs(jogador.getPosicao().y - personagem.getPosicao().y) != 0){
            mesa.andar2("D",personagem.getPosicao());
        }
    }
    public void defendeBot(){
        personagem.setForcaDeDefesa(personagem.getDefesaInicial());
    }
    public void ativaPoderBot(Personagem jogador){
        personagem.ativarPoderEspecial(jogador);
    }
}
