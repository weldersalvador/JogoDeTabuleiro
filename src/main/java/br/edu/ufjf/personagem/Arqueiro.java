package br.edu.ufjf.personagem;

/**
 *
 * @author Wemerson
 */
public class Arqueiro extends Personagem{    
    public Arqueiro(String nome){        
        super(nome, "Arqueiro", 5,8,5);
    }
    
    public boolean ativarPoderEspecial(){
        if(getMana() == 100){
            setMana(0);
            setMana(getMana()+1);
            return true;
        }
        else{
            System.out.println("Mana insuficiente! Não é possível ativar a poder especial.");
            return false;
        }
    }
}
