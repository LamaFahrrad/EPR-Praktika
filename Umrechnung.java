
public class HelloWorld {
    public static void main(String[] args) {
        //Aufgabe 1 
        System.out.println((40 - 32) * 5 / 9); // Rechnet 40 Grad Fahrenheit in Celsius um
        System.out.println((41 - 32) * 5 / 9);    
      
        // Aufgabe 2
        float geteilt =   1.1401f;
        int ergebnis = (int) (100 /geteilt); // Ergebnis wird in ein int umgewandelt
        int ergebnis2 = (int) (10000 /geteilt);
        System.out.println(ergebnis);
        System.out.println(ergebnis2);
      
        // Aufgabe 3
        /*Liefert zu einer Anzahl Minuten die vollen Stunden
        und verbleibenden Minuten im Format hmm.
        Teilt Betrag durch 60 und multipliziert das Ergebnis mit 100
        um auf das Format hmm zu gelangen, danach wird der Ursprungsbetrag
        mit dem Restwertoperator durch 60 dividiert um die verbleibenden
        Minuten auszugeben.*/

        System.out.println((5 / 60) * 100 + (5 % 60));
        System.out.println((59 / 60) * 100 + (59 % 60));
        System.out.println((60 / 60) * 100 + (60 % 60));
        System.out.println((61 / 60) * 100 + (61 % 60));
        System.out.println((825 / 60) * 100 + (825 % 60));
    }
}
