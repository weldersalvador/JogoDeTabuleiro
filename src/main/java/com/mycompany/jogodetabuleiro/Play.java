package com.mycompany.jogodetabuleiro;

import br.edu.ufjf.personagem.Arqueiro;
import br.edu.ufjf.personagem.Guerreiro;
import br.edu.ufjf.personagem.Mago;
import br.edu.ufjf.personagem.Personagem;
import com.mycompany.jogodetabuleiro.Tabuleiro;
import java.util.Scanner;

/**
 *
 * @author Wemerson
 */
public final class Play {

    escolhePersonagens escolhaDoPersonagem1;
    private final Jogador player1;
    private final Jogador player2;
    private final String nomeDoPersonagem;
    private String nomeDoPersonagem2;
    private Tabuleiro mesa;

    private enum Status {
        CONTINUE, LOSE, WIN
    };
    Status gameStatus = Status.CONTINUE;
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
        }
        else{
            mesa = new Tabuleiro(player.getPosicao(), bot.personagem.getPosicao());
        }
    }
    private int escolha;

    public int escolheModo() {
        Scanner input = new Scanner(System.in);
        System.out.println("Deseja jogar PVP (0) ou PVE? (1)");
        escolha = input.nextInt();
        if (escolha == 0) {
            System.out.println("O modo de jogo escolhido foi PVP! ");
            return 0;
        } else {
            if (escolha == 1) {
                System.out.println("O modo de jogo escolhido foi PVE! ");
                return 1;
            } else {
                System.out.println("Escolha inválida! ");
                return -1;
            }
        }
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
                        System.out.println("Voce ataca e causa " + player.getForcaDeAtaque() + " de dano!");
                        bot.personagem.setVida(bot.personagem.getVida() - player.getForcaDeAtaque());
                        System.out.println("O inimigo possui " + bot.personagem.getVida() + " de vida.");
                    } else {
                        System.out.println("Distancia insuficiente! Passando turno... ");
                        break;
                    }

                }
                case 3 -> {
                    if (player.getForcaDeDefesa() == 10) {
                        System.out.println("Voce ja possui defesa maxima! Passando turno...");
                    } else {
                        player.setForcaDeDefesa(5);
                        System.out.println("Defesa restaurada! ");
                    }
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
                        System.out.println("Voce ataca e causa " + player.getForcaDeAtaque() + " de dano!");
                        player2.setVida(player2.getVida() - player.getForcaDeAtaque());
                        System.out.println("O inimigo possui " + player2.getVida() + " de vida.");
                    } else {
                        System.out.println("Distancia insuficiente! Passando turno... ");
                        break;
                    }

                }
                case 3 -> {
                    if (player.getForcaDeDefesa() == 10) {
                        System.out.println("Voce ja possui defesa maxima! Passando turno...");
                    } else {
                        player.setForcaDeDefesa(5);
                        System.out.println("Defesa restaurada! ");
                    }
                }
            }
        }

    }

    void tomadaDeDecisaoP2(int decisao) {
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
                    System.out.println("Voce ataca e causa " + player2.getForcaDeAtaque() + " de dano!");
                    player.setVida(player.getVida() - player2.getForcaDeAtaque());
                    System.out.println("O inimigo possui " + player.getVida() + " de vida.");
                } else {
                    System.out.println("Distancia insuficiente! Passando turno... ");
                    break;
                }

            }
            case 3 -> {
                if (player2.getForcaDeDefesa() == 10) {
                    System.out.println("Voce ja possui defesa maxima! Passando turno...");
                } else {
                    player2.setForcaDeDefesa(5);
                    System.out.println("Defesa restaurada! ");
                }
            }
        }
    }

    void tomadaDeDecisaoBot() {
        int distancia = Math.max(Math.abs(player.getPosicao().x - bot.personagem.getPosicao().x), Math.abs(player.getPosicao().y - bot.personagem.getPosicao().y));
        if (bot.personagem.getAlcanceDeAtaque() < distancia) {
            mesa.andar2("B", bot.personagem.getPosicao());
            System.out.println("O inimigo avanca por baixo! ");
        } else {
            player.setVida(player.getVida() - bot.atacar());
            System.out.println("O inimigo ataca e causa " + bot.atacar() + " de dano! ");
        }
    }
    
    public void iniciaGame() {
        if (modo == 1) {
            Scanner inputP1 = new Scanner(System.in);
            bot.personagem.getClasse();
            int decisao;
            while (player.getVida() > 0 && bot.personagem.getVida() > 0) {
                System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                decisao = inputP1.nextInt();
                tomadaDeDecisaoP1(decisao);
                tomadaDeDecisaoBot();
            }
        }
        if (modo == 0) {
            Scanner inputP1 = new Scanner(System.in);
            Scanner inputP2 = new Scanner(System.in);
            int decisao1;
            int decisao2;
            while (player.getVida() > 0 && player2.getVida() > 0) {
                System.out.println("");
                System.out.println("Vez do jogador 1: ");
                System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                decisao1 = inputP1.nextInt();
                while (decisao1 != 1 && decisao1 != 2 && decisao1 != 3 && decisao1 != 4) {
                    System.out.println("Comando invalido, por favor digite novamente: ");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                }
                tomadaDeDecisaoP1(decisao1);
                System.out.println("");
                System.out.println("Vez do jogador 2: ");
                System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                decisao2 = inputP2.nextInt();
                while (decisao2 != 1 && decisao2 != 2 && decisao2 != 3 && decisao2 != 4) {
                    System.out.println("Comando invalido, por favor digite novamente: ");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender) , 4 (Ataque especial)");
                }
                tomadaDeDecisaoP2(decisao2);
            }

        }
    }
}
