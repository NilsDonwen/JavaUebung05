
package bruchtest;

/**
 *
 * @author Schueler
 */
public class Bruch {
    
    int zaehler;
    int nenner;
    
    void ausgeben(){        //erstellen der Methode ausgeben --> durch sie wird Objekt "Bruch" abgearbeitet
        
        System.out.println(zaehler + "/" + nenner);     // Methodenrumpf --> Ausgabe 
    }
    
    void kuerzen(){
        int m, n, r;        // Variabeln definieren
       m = zaehler;
       n = nenner;
       r = m % n;
       
       while (r > 0){
           
           m = n;
           n = r;
           r = m % n;
       }
       zaehler = zaehler /n;
       nenner = nenner /n;
    }
    
    /*Alternativ: (kürzer)
    void gekuerzausgeben(){
        kuerzen();
        ausgeben();
*/
    
    void erweitern(int a){      // Methode mit Parameter, welcher übergeben werden soll (Übergabeparameter) --> Zusatzanweisung
        zaehler*= a;        
        nenner *= a;        // Alternativ: nenner = nenner * a;
    }
    
    void multiplizieren(Bruch m){       // hier wird ein Objekt übergeben als Übergabeparameter
        
        zaehler *= m.zaehler;
        nenner *= m.nenner;
    }
    
    void setze ( int z, int n){
        zaehler =z;
        nenner =n;
    }
    }

