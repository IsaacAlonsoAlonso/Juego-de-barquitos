import java.util.*;
import java.util.ArrayList;


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

    /**
     * Constructor for objects of class tablero
     */
    public game()
    {
        // initialise instance variables
        tablero=new ArrayList<Canvas>();
        tablero.add(new Canvas("Jugador1"));
        tablero.add(new Canvas("Jugador2"));
        for(Canvas tableros: tablero){
            for (int x=0; x<924;){
                tableros.drawLine(x,1,x, 924);
                x=x+33;
            }
            for (int y=0; y<924;){
                tableros.drawLine(1,y,924, y);
                y=y+33;
            }
        }
    }

    
}
