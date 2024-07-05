
import java.util.HashSet;
import java.util.*;

/**
 * Write a description of class barcos here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class barcos
{
    // instance variables - replace the example below with your own
    public Boolean tocado = false;
    public HashSet<String> coordBarco = new HashSet<String>();
    

    /**
     * Constructor for objects of class barcos
     */
    public barcos() {
        coordBarco.add("B2");
        coordBarco.add("C2");
        coordBarco.add("D2");
        
    }
    
    public String tocadoOAgua(String coord){
        String respuesta="";
        if(coordBarco.contains(coord)){
            coordBarco.remove(coord);
            if(coordBarco.isEmpty()){
                respuesta="tocado y hundido";
            }
            else{
                respuesta="tocado";
            }
        }
        else{
            respuesta="agua";
        }
        return respuesta;
    }
    
    public HashSet<String> getCoordBarco(){
        return coordBarco;
    }
}
