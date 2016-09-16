
package bruchtest;

/**
 *
 * @author Schueler
 */
public class Bruchtest {

   
    public static void main(String[] args) {
        
        Bruch a = new Bruch();      // a als Bruch --> WICHTIG: ()
        a.zaehler = 3;              // Wert1 zuweisen
        a.nenner =4;                // Wert2 zuweisen
        
    
        
        
        
        Bruch b = new Bruch();      // b als Bruch --> WICHTIG: ()
        b.zaehler =3;               // Wert1 zuweisen
        b.nenner =12;               // Wert2 zuweisen
        
        a.multiplizieren(b);
        
       System.out.print("Ausgabe von Bruch A: ");
       a.ausgeben();
       System.out.println("\n");
       
        
       System.out.print("Vor dem kuerzen: "); 
       b.ausgeben();
                                                            // Alternativ:   b.gekuerztausgeben();
       b.kuerzen();
       
       System.out.print("Nach dem kuerzen: ");
       b.ausgeben();
       
       b.erweitern(4);      // erweitern des Bruches mit Argument 4
       System.out.print("Nach dem erweitern mit 4: ");
       b.ausgeben();            // erneute Ausgabe 
        
       
       
       a.multiplizieren(b);         // Befehl darf erst hier geschreiben werden, da Varibale b vorher nicht bekannt 
       a.ausgeben();
       
       b.setze(5, 0);       // hier werden Übergabeparameter verwendet
       b.ausgeben();        // sprich der Werte der in Klammer setht wird hier ausgegeben
       
    }
    
    
}
