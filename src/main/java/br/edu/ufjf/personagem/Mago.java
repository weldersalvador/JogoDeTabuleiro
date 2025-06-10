package br.edu.ufjf.personagem;

/**
 *
 * @author Welder
 */
public class Mago extends Personagem{
    public Mago(String nome){
        super(nome, "Mago", 7, 10, 3);
    }
    
    public boolean ativarPoderEspecial(Personagem inimigo){
        if(getMana() == 100){
            setMana(0);
            inimigo.setVida(getVida());
            this.setVida(inimigo.getVida());
            System.out.printf("TROCAR VIDA! O Mago ");
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
    
}
