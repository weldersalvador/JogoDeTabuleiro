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

    escolhePersonagens escolhaDoPersonagem = new escolhePersonagens();
    private final int escolhaDePersonagem;
    private final String nomeDoPersonagem;

    private enum Status {
        CONTINUE, LOSE, WIN
    };
    Status gameStatus = Status.CONTINUE;
    public Tabuleiro mesa;
    public int modo;

    public Play() {
        escolhaDePersonagem = escolhaDoPersonagem.escolhaDoPersonagem();
        nomeDoPersonagem = escolhaDoPersonagem.defineNome();
        escolhaDoPersonagem.imprimeEscolha(nomeDoPersonagem, escolhaDePersonagem);
        modo = escolheModo();
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
    Scanner input1 = new Scanner(System.in);

    public void iniciaGame() {
        if (modo == 1) {
            Bot bot = new Bot();
            int decisao;
            if (escolhaDePersonagem == 1) {
                Mago mago1 = new Mago();
                Tabuleiro mesa = new Tabuleiro(mago1.posicao, bot.personagem.getPosicao());
                while (mago1.getVida() >= 0 && bot.personagem.getVida() >= 0) {
                    int distancia = Math.max(Math.abs(mago1.posicao.x - bot.personagem.getPosicao().x), Math.abs(mago1.posicao.y - bot.personagem.getPosicao().y));
                    System.out.println("");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender)");
                    decisao = input1.nextInt();
                    switch (decisao) {
                        case 1 -> {
                            String andar;
                            Scanner input2 = new Scanner(System.in);
                            System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                            andar = input2.nextLine();
                            mesa.andar(andar, mago1.posicao);
                        }
                        case 2 -> {
                            if (distancia <= 3) {
                                System.out.println("O mago ataca e causa " + mago1.getForcaDeAtaque() + " de dano!");
                                bot.personagem.setVida(bot.personagem.getVida() - mago1.getForcaDeAtaque());
                                System.out.println("O inimigo possui " + bot.personagem.getVida() + " de vida.");
                            } else {
                                System.out.println("Distancia insuficiente! Passando turno... ");
                                break;
                            }

                        }
                        case 3 -> {
                            if (mago1.getForcaDeDefesa() == 10) {
                                System.out.println("Voce ja possui defesa maxima! Passando turno...");
                            } else {
                                mago1.setForcaDeDefesa(mago1.getForcaDeDefesa() + 3);
                                System.out.println("Voce ganhou +3 de defesa! ");
                            }
                        }
                    }
                }
            } else if (escolhaDePersonagem == 2) {
                Guerreiro guerreiro1 = new Guerreiro();
                Tabuleiro mesa = new Tabuleiro(guerreiro1.posicao, bot.personagem.getPosicao());
                while (guerreiro1.getVida() >= 0 && bot.personagem.getVida() >= 0) {
                    int distancia = Math.max(Math.abs(guerreiro1.posicao.x - bot.personagem.getPosicao().x), Math.abs(guerreiro1.posicao.y - bot.personagem.getPosicao().y));
                    System.out.println("");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender), 4 (Poder especial)");
                    decisao = input1.nextInt();
                    switch (decisao) {
                        case 1 -> {
                            String andar;
                            Scanner input2 = new Scanner(System.in);
                            System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                            andar = input2.nextLine();
                            mesa.andar(andar, guerreiro1.posicao);
                        }
                        case 2 -> {
                            if (distancia == 1) {
                                System.out.println("Voce ataca e causa " + guerreiro1.getForcaDeAtaque() + " de dano!");
                                bot.personagem.setVida(bot.personagem.getVida() - guerreiro1.getForcaDeAtaque());
                                System.out.println("O inimigo possui " + bot.personagem.getVida() + " de vida.");
                            } else {
                                System.out.println("Distancia insuficiente! Passando turno... ");
                                break;
                            }

                        }
                        case 3 -> {
                            if (guerreiro1.getForcaDeDefesa() == 10) {
                                System.out.println("Voce ja possui defesa maxima! Passando turno...");
                            } else {
                                guerreiro1.setForcaDeDefesa(guerreiro1.getForcaDeDefesa() + 3);
                                System.out.println("Voce ganhou +3 de defesa! ");
                            }
                        }
                        case 4 -> {
                            guerreiro1.ativarPoderEspecial();
                            System.out.println("Poder especial ativado! Voce recebeu +15 de força de ataque.");
                        }
                    }
                }
            } else {
                Arqueiro arqueiro1 = new Arqueiro();
                Tabuleiro mesa = new Tabuleiro(arqueiro1.posicao, bot.personagem.getPosicao());
                while (arqueiro1.getVida() >= 0 && bot.personagem.getVida() >= 0) {
                    int distancia = Math.max(Math.abs(arqueiro1.posicao.x - bot.personagem.getPosicao().x), Math.abs(arqueiro1.posicao.y - bot.personagem.getPosicao().y));
                    System.out.println("");
                    System.out.println("Escolha o que fazer: 1 (Andar), 2(Atacar), 3 (Defender)");
                    decisao = input1.nextInt();
                    switch (decisao) {
                        case 1 -> {
                            String andar;
                            Scanner input2 = new Scanner(System.in);
                            System.out.println("Escolha para onde quer andar: C (cima), B(baixo), E(esquerda), D(direita)");
                            andar = input2.nextLine();
                            mesa.andar(andar, arqueiro1.posicao);
                        }
                        case 2 -> {
                            if (distancia <= 5) {
                                System.out.println("Voce ataca e causa " + arqueiro1.getForcaDeAtaque() + " de dano!");
                                bot.personagem.setVida(bot.personagem.getVida() - arqueiro1.getForcaDeAtaque());
                                System.out.println("O inimigo possui " + bot.personagem.getVida() + " de vida.");
                            } else {
                                System.out.println("Distancia insuficiente! Passando turno... ");
                                break;
                            }

                        }
                        case 3 -> {
                            if (arqueiro1.getForcaDeDefesa() == 10) {
                                System.out.println("Voce ja possui defesa maxima! Passando turno...");
                            } else {
                                arqueiro1.setForcaDeDefesa(arqueiro1.setForcaDeDefesa());
                                System.out.println("Forca de defesa restaurada!");
                            }
                        }
                    }
                }
            }
        }
    }
}
