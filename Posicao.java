import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.*;

/**
 * Write a description of class Posicao here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Posicao
{
    public char letra;
    public int x;
    public int y;
    
    public Posicao(char letra, int x, int y) {
        this.x = x;
        this.y = y;
        this.letra = letra;
    }
    
    public static List<Posicao> getPosicoes(char letra, List<Posicao> posicoes) {
        List<Posicao> achadas = new ArrayList<Posicao>();
        
        for(Posicao p : posicoes) {
            if(p.letra == letra) {
                achadas.add(p);
            }
        }
        
        return achadas;
    }
    
    public String toString() {
        return "Letra " + this.letra + ": {x: "+x+" y: "+y+"}";
    }
}
