package com.mycompany.jogodetabuleiro;

import br.edu.ufjf.personagem.Personagem;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Wemerson
 */
public final class Play {

    escolhePersonagens escolhaDoPersonagem1;
    private final Personagem player;
    private Personagem player2;
    private final String nomeDoPersonagem;
    private String nomeDoPersonagem2;
    private Tabuleiro mesa;
    public int modo;
    Bot bot = new Bot();

    public Play() {
        System.out.println("Player 1: ");
        escolhaDoPersonagem1 = new escolhePersonagens();
        player = escolhaDoPersonagem1.escolhaDoPersonagem();
        nomeDoPersonagem = escolhaDoPersonagem1.defineNome();
        escolhaDoPersonagem1.imprimeEscolha(nomeDoPersonagem, player);
        modo = escolheModo();
        if (modo == 0) {
            escolhePersonagens escolhaDoPersonagem2 = new escolhePersonagens();
            System.out.println("Player 2: ");
            player2 = escolhaDoPersonagem2.escolhaDoPersonagem();
            nomeDoPersonagem2 = escolhaDoPersonagem2.defineNome();
            escolhaDoPersonagem2.imprimeEscolha(nomeDoPersonagem2, player2);
            mesa = new Tabuleiro(player.getPosicao(), player2.getPosicao());
        } else {
            mesa = new Tabuleiro(player.getPosicao(), bot.personagem.getPosicao());
        }
    }
    private int escolha;

    public int escolheModo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar PVP (0) ou PVE? (1)");
        escolha = input.nextInt();
        while (escolha != 1 && escolha != 0) {
            System.out.println("Escolha invalida! Por favor escolha novamente!");
            System.out.println("Deseja jogar PVP (0) ou PVE? (1)");
            escolha = input.nextInt();
        }
        if (escolha == 0) {
            System.out.println("O modo de jogo escolhido foi PVP! ");
            return 0;
        } else {
            if (escolha == 1) {
                System.out.println("O modo de jogo escolhido foi PVE! ");
                return 1;

            }
        }
        return 1;
    }

    void tomadaDeDecisaoP1(int decisao) {
        if (escolha == 1) {
            int distancia = Math.max(Math.abs(player.getPosicao().x - bot.personagem.getPosicao().x), Math.abs(player.getPosicao().y - bot.personagem.getPosicao().y));
            switch (decisao) {
                case 1 -> {
                    String andar;
                    Scanner inputP1 = new Scanner(System.in);
                    System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                    andar = inputP1.nextLine();
                    mesa.andar1(andar, player.getPosicao());
                }
                case 2 -> {
                    if (distancia <= player.getAlcanceDeAtaque()) {
                        System.out.println("");
                        System.out.println("Voce causou " + player.getForcaDeAtaque() + " de dano ao " + bot.personagem.getClasse() + " bot!");

                        if (bot.personagem.getForcaDeDefesa() - player.getForcaDeAtaque() >= 0) {
                            bot.personagem.setForcaDeDefesa(bot.personagem.getForcaDeDefesa() - player.getForcaDeAtaque());
                        } else {
                            bot.personagem.setVida(bot.personagem.getVida() - (player.getForcaDeAtaque() - bot.personagem.getForcaDeDefesa()));
                            bot.personagem.setForcaDeDefesa(0);
                        }
                    } else {
                        System.out.println("Distancia insuficiente! Passando turno... ");
                        break;
                    }

                }
                case 3 -> {
                    if (player.getForcaDeDefesa() == player.getDefesaInicial()) {

                        System.out.println("Voce ja possui defesa maxima! Passando turno...");
                    } else {
                        player.setForcaDeDefesa(player.getDefesaInicial());
                        System.out.println("Defesa inicial: " + player.getDefesaInicial());
                        System.out.println("Defesa restaurada! ");
                    }
                }
                case 4 -> {
                    player.ativarPoderEspecial(bot.personagem);
                }
            }
        }
        if (escolha == 0) {
            int distancia = Math.max(Math.abs(player.getPosicao().x - player2.getPosicao().x), Math.abs(player.getPosicao().y - player2.getPosicao().y));
            switch (decisao) {
                case 1 -> {
                    String andar;
                    Scanner inputP1 = new Scanner(System.in);
                    System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                    andar = inputP1.nextLine();
                    mesa.andar1(andar, player.getPosicao());
                }
                case 2 -> {
                    if (distancia <= player.getAlcanceDeAtaque()) {
                        System.out.println("O jogador 1 ataca e causa " + player.getForcaDeAtaque() + " de dano ao jogador 2!");

                        if (player2.getForcaDeDefesa() - player.getForcaDeAtaque() >= 0) {
                            player2.setForcaDeDefesa(player2.getForcaDeDefesa() - player.getForcaDeAtaque());
                        } else {
                            player2.setVida(player2.getVida() - (player.getForcaDeAtaque() - player2.getForcaDeDefesa()));
                            player2.setForcaDeDefesa(0);
                        }
                    } else {
                        System.out.println("Distancia insuficiente! Passando turno... ");
                        break;
                    }

                }
                case 3 -> {
                    if (player.getForcaDeDefesa() == player.getDefesaInicial()) {

                        System.out.println("Voce ja possui defesa maxima! Passando turno...");
                    } else {
                        player.setForcaDeDefesa(player.getDefesaInicial());
                        System.out.println("Defesa inicial: " + player.getDefesaInicial());
                        System.out.println("Defesa restaurada! ");
                    }
                }
                case 4 -> {
                    player.ativarPoderEspecial(player2);
                }
            }
        }

    }

    boolean tomadaDeDecisaoP2(int decisao) {
        int distancia = Math.max(Math.abs(player.getPosicao().x - player2.getPosicao().x), Math.abs(player.getPosicao().y - player2.getPosicao().y));
        switch (decisao) {
            case 1 -> {
                String andar2;
                Scanner inputP2 = new Scanner(System.in);
                System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                andar2 = inputP2.nextLine();
                mesa.andar2(andar2, player2.getPosicao());
            }
            case 2 -> {
                if (distancia <= player2.getAlcanceDeAtaque()) {
                    System.out.println("O jogador 2 ataca e causa " + player2.getForcaDeAtaque() + " de dano ao jogador 1!");

                    if (player.getForcaDeDefesa() - player2.getForcaDeAtaque() >= 0) {
                        player.setForcaDeDefesa(player.getForcaDeDefesa() - player2.getForcaDeAtaque());
                    } else {
                        player.setVida(player.getVida() - (player2.getForcaDeAtaque() - player.getForcaDeDefesa()));
                        player.setForcaDeDefesa(0);
                    }
                } else {
                    System.out.println("Distancia insuficiente! Passando turno...");
                }
            }
            case 3 -> {
                if (player2.getForcaDeDefesa() == player2.getDefesaInicial()) {
                    System.out.println("Voce ja possui defesa maxima! Passando turno...");
                } else {
                    player2.setForcaDeDefesa(player2.getDefesaInicial());
                    System.out.println("Defesa restaurada! ");
                }
            }
            case 4 -> {
                player2.ativarPoderEspecial(player);
            }
            case 5 ->{
                return false;
            }
        }
        return true;
    }

    static void imprimeJogador(Personagem jogador) {
        System.out.println("Vida: " + jogador.getVida());
        System.out.println("Defesa: " + jogador.getForcaDeDefesa());
        System.out.println("Alcance: " + jogador.getAlcanceDeAtaque());
        System.out.println("Forca de ataque: " + jogador.getForcaDeAtaque());
    }

    void tomadaDeDecisaoBot() {
        Random escolha = new Random();
        int contador = 0;
        int distancia = Math.max(Math.abs(player.getPosicao().x - bot.personagem.getPosicao().x), Math.abs(player.getPosicao().y - bot.personagem.getPosicao().y));
        if (bot.personagem.getAlcanceDeAtaque() >= distancia && bot.personagem.getVida() >= 50) {
            if (escolha.nextInt(0, 71) <= 70) {
                bot.atacar(player);
                System.out.println("");
                System.out.println("O " + bot.personagem.getClasse() + " bot te ataca e causa " + bot.personagem.getForcaDeAtaque() + " de dano!");
            } else {
                System.out.println("");
                bot.andarBot(player, mesa);
                System.out.println("O " + bot.personagem.getClasse() + " avanca em sua direcao!");
            }
        } else if (bot.personagem.getAlcanceDeAtaque() <= distancia && bot.personagem.getVida() < 50) {
            if (bot.personagem.getForcaDeDefesa() != bot.personagem.getDefesaInicial()) {
                if (escolha.nextInt(0, 71) <= 60) {
                    bot.defendeBot();
                    System.out.println("O bot restaurou sua defesa!");
                }
            } else if (contador == 0) {
                System.out.println("O bot ativou o poder especial! ");
                bot.ativaPoderBot(player);
                contador++;
            } else {
                bot.atacar(player);
            }
        } else {
            bot.andarBot(player, mesa);
        }
    }

    public void iniciaGame() {
        if (modo == 1) {
            Scanner inputP1 = new Scanner(System.in);
            System.out.println("");
            System.out.println("Voce esta jogando contra um " + bot.personagem.getClasse());
            int decisao;
            while (player.getVida() > 0 && bot.personagem.getVida() > 0) {
                System.out.println("");
                System.out.println("Sua vez! ");
                System.out.println("Status do bot: ");
                imprimeJogador(bot.personagem);
                System.out.println("");
                System.out.println("Seus status: ");
                imprimeJogador(player);
                System.out.println("Escolha o que fazer: 1 (Andar), 2 (Atacar), 3 (Defender) , 4 (Ataque especial)");
                decisao = inputP1.nextInt();
                while (decisao != 1 && decisao != 2 && decisao != 3 && decisao != 4) {
                    System.out.println("Comando invalido, por favor digite novamente: ");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                    decisao = inputP1.nextInt();
                }
                tomadaDeDecisaoP1(decisao);
                if (bot.personagem.getVida() <= 0) {
                    System.out.println("");
                    System.out.println("Parabens!! Voce venceu a partida!!");
                    return;
                }
                if (decisao != 1) {
                    mesa.Imprime();
                }
                tomadaDeDecisaoBot();
            }
            System.out.println("Voce perdeu!! ");
            return;
        }
        if (modo == 0) {
            Scanner inputP1 = new Scanner(System.in);
            Scanner inputP2 = new Scanner(System.in);
            int decisao1;
            int decisao2;
            while (player.getVida() > 0 && player2.getVida() > 0) {
                System.out.println("");
                System.out.println("Vez do jogador 1: ");
                imprimeJogador(player);
                System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                decisao1 = inputP1.nextInt();
                while (decisao1 != 1 && decisao1 != 2 && decisao1 != 3 && decisao1 != 4) {
                    System.out.println("Comando invalido, por favor digite novamente: ");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                    decisao1 = inputP1.nextInt();
                }
                tomadaDeDecisaoP1(decisao1);
                if (player2.getVida() > 0) {
                    if (decisao1 != 1) {
                        mesa.Imprime();
                    }
                    System.out.println("");
                    System.out.println("Vez do jogador 2: ");
                    imprimeJogador(player2);
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial), 5(Parar de jogar)");

                    decisao2 = inputP2.nextInt();
                    while (decisao2 != 1 && decisao2 != 2 && decisao2 != 3 && decisao2 != 4 && decisao2 != 5) {
                        System.out.println("Comando invalido, por favor digite novamente: ");
                        System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial), 5(Parar de jogar)");
                        decisao2 = inputP2.nextInt();
                    }
                    boolean continuaJogo = tomadaDeDecisaoP2(decisao2);
                    if (decisao2 != 1 && continuaJogo) {
                        mesa.Imprime();
                    }
                    else{
                        System.out.println("Jogo finalizado");
                        return;
                    }
                } else {
                    System.out.println("");
                    System.out.println("Parabens!!! O jogador 1 vence a partida! ");
                    return;
                }
            }
            System.out.println("Parabens!! O jogador 2 vence a partida!");
        }
    }
}
