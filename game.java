import java.util.*;
import java.util.ArrayList;
import java.util.HashMap;


/**
 * Write a description of class tablero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class game
{
    // instance variables - replace the example below with your own
    private ArrayList<Canvas> tablero;
    public HashMap<String,Integer> coordenadas;

    /**
     * Constructor for objects of class tablero
     */
    public game()
    {
        // initialise instance variables
        tablero=new ArrayList<Canvas>();
        tablero.add(new Canvas("Jugador1"));
        tablero.add(new Canvas("Jugador2"));
        String abc ="abcdefghijklmnñopqrstuvwxyz";
        for(Canvas tableros: tablero){
            for (int x=0; x<924;){
                tableros.drawLine(x,1,x, 924);
                x=x+33;
            }
            for (int y=0; y<924;){
                tableros.drawLine(1,y,924, y);
                y=y+33;
            }
            int y=49;
            for(int n=1; n<28;n++){
                tableros.drawInt(n,16,y);
                y=y+33;
            }
            int x=49;
            for(int a=0; a<27;a++){
                char letra = abc.charAt(a);
                tableros.drawString(Character.toString(letra),x,16);
                x=x+33;
            }
        }
    }

    
}
