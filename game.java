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
    public HashMap<String,String> coordenadas =new HashMap();
    
    /**
     * Constructor for objects of class tablero
     */
    public game()
    {
        // initialise instance variables
        tablero=new ArrayList<Canvas>();
        tablero.add(new Canvas("Jugador1"));
        tablero.add(new Canvas("Jugador2"));
        String abc ="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        for(Canvas tableros: tablero){
            for (int x=0; x<952;){
                tableros.drawLine(x,1,x, 952);
                x=x+34;
            }
            for (int y=0; y<952;){
                tableros.drawLine(1,y,952, y);
                y=y+34;
            }
            int y=51;
            for(int n=1; n<28;n++){
                tableros.drawInt(n,17,y);
                y=y+34;
            }
            int x=51;
            for(int a=0; a<27;a++){
                char letra = abc.charAt(a);
                tableros.drawString(Character.toString(letra),x,16);
                x=x+34;
            }
        }
        int a=0;
        int y=51;
        int x=51;
        String coord="";
        String clave="";
        for(int i=0;i<729;i++){
            while (a<27){
                char letra = abc.charAt(a);
                for(int b=1;b<28;b++){
                    clave = Character.toString(letra) + b;
                    coord= y + " "+ x;
                    y=y+34;
                    coordenadas.put(clave,coord);
                }
                x=x+34;
                y=51;
                a++;
            }
        }
    }
    
    
    public void prueba(){
        int a=0;
        String abc ="ABCDEFGHIJKLMNÑOPQRSTUVWXYZ";
        while (a<27){
            char letra = abc.charAt(a);
            for(int b=1;b<28;b++){
                String clave = Character.toString(letra) + b;
                System.out.println(clave);
            }
            a++;
        }
        
    }
    
    public void prueba2(){
        int y=51;
        int x=51;
        String coord="";
        for(int hori=0;hori<28;hori++){
            for(int n=1; n<28;n++){
                    coord= y + " "+ x;
                    y=y+34;
                    for(Canvas tableros: tablero){
                        String[] coordena =coord.split(" ");
                        String coordy = coordena[0];
                        String coordx = coordena[1];
                        int coordY = Integer.parseInt(coordy);
                        int coordX = Integer.parseInt(coordx);
                        tableros.drawString("X",coordX,coordY);
                    }
                }
            x=x+34;
            y=51;
        }
    }
    
    public void prueba3 (String clave){
        String coord=coordenadas.get(clave);
        for(Canvas tableros: tablero){
                        String[] coordena =coord.split(" ");
                        String coordy = coordena[0];
                        String coordx = coordena[1];
                        int coordY = Integer.parseInt(coordy);
                        int coordX = Integer.parseInt(coordx);
                        tableros.drawString("X",coordX,coordY);
                    }
    }
    
    public void prueba4 (String clave){
        String coord=coordenadas.get(clave);
        for(Canvas tableros: tablero){
                        String[] coordena =coord.split(" ");
                        String coordy = coordena[0];
                        String coordx = coordena[1];
                        int coordY = Integer.parseInt(coordy);
                        int coordX = Integer.parseInt(coordx);
                        tableros.fillCircle(coordX-15,coordY-15,30);
                    }
    }
    
    public void prueba5(){
        int y=51;
        int x=51;
        String coord="";
        for(int hori=0;hori<28;hori++){
            for(int n=1; n<28;n++){
                    coord= y + " "+ x;
                    y=y+34;
                    for(Canvas tableros: tablero){
                        String[] coordena =coord.split(" ");
                        String coordy = coordena[0];
                        String coordx = coordena[1];
                        int coordY = Integer.parseInt(coordy);
                        int coordX = Integer.parseInt(coordx);
                        tableros.fillCircle(coordX-15,coordY-15,30);
                    }
                }
            x=x+34;
            y=51;
        }
    }
}
