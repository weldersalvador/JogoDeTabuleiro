package br.edu.ufjf.personagem;

/**
 *
 * @author Wemerson
 */
public class Guerreiro extends Personagem {    
    public Guerreiro(String nome){
        super(nome,"Guerreiro",8, 15, 1);
    }

    public boolean ativarPoderEspecial() {
        if(getMana() == 100){
            setMana(0);
            setForcaDeAtaque(getForcaDeAtaque()*2);
            System.out.printf("CARGA BRUTAL! O Guerreiro %s usou seu poder especial.", getNome());
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
    
}
