import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;
import java.awt.Color;

/**
 * Write a description of class Letra here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Letra extends Actor
{
    /**
     * Act - do whatever the Letra wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
   
 
    public void act() 
    {
        String className = this.getClass().getSimpleName();
        String letra = className.replace("Letra","");
        
        if (Greenfoot.mouseClicked(this) || Greenfoot.isKeyDown(letra)) {
           BG myworld = (BG) getWorld();
           String palavraSorteada = myworld.palavraSorteada;
           
           if(this.contemLetra(letra, palavraSorteada)) {
               this.preenchePosicoes(letra, palavraSorteada, myworld);
           } else {
               this.realizaPunicao();
           }
        }
    }
    
    public boolean contemLetra(String letra, String palavra) {
        return palavra.contains(letra);
    }
    
    public void preenchePosicoes(String letra, String palavra, BG world) {
        //O método deverá preencher as posicoes com a letra determinada
        int index = 0;
        char letraChar = letra.toCharArray()[0];
        int letraCode = (int) letraChar;
        int palavraLetraCode;
        char[] palavraArray = palavra.toCharArray();
        List<Posicao> achadas;
        
        for(index = 0; palavraArray.length > index; index++) {
            palavraLetraCode = (int) palavraArray[index];
            if(letraCode == palavraLetraCode) {
                System.out.println("Letra " + letra + " encontrada na posição " + index);
                
                achadas = Posicao.getPosicoes(letraChar, world.posicoes);
                this.criaLetras(letraChar, achadas);
            }
        }
    }
    
    public void criaLetras(char letra, List<Posicao> achadas) {
        String className = "Letra"+letra;
        try {     
            Class classeLetra = Class.forName(className);
            for(Posicao p : achadas) {
                getWorld().addObject((Actor) classeLetra.newInstance(), p.x, p.y);
            }
        } catch (Exception e) {
            System.out.println("Erro: Classe da letra não encontrada");
        }
    }
    
    //Implementar punição. Será necessário desenhar o boneco enforcado.
    public void realizaPunicao() {
        System.out.println("A letra não foi encontrada. Portanto deverá ser punido");
    }
}
