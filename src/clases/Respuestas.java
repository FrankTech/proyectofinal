
package clases;

import java.util.StringTokenizer;


public class Respuestas {
    
    String[]respuestas = {
    "No","A","B","C"
    
    };
    
    String[] RadioR = {
        
        "Si,Puede ser,No,Siempre",
        "A,B,C,B",
        "B,C,D,E",
        "C,D,E,F",
        "D,E,F,G",
         
    };
    
    public String getRespuesta(int posicion){
        return respuestas[posicion];
    
    }
    
    public String[] separar(String cadena, String separador){
        StringTokenizer token = new StringTokenizer(cadena,separador);
               
    String[] a = new String[4];
    int i = 0;
    
    while(token.hasMoreTokens()){
        a[i] = token.nextToken(); 
        i++;
    
    
    
    }
    
    return a;
    }
    
    public String[] setRespuestas(int posicion){
        String s1 = RadioR[posicion];
        String [] s2 = separar(s1,",");
        return s2;
    
    
    }
    
    
    
    
    
}
