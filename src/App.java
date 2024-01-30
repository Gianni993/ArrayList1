import java.util.ArrayList;
import java.util.List;

public class App {


/*Creare una classe Student che accenti nel costruttore il parametro name (String) e age (Int)
In questa classe avere i metodi pubblici per ottenere le informazioni.
Creare un ArrayList con n elementi e stamparlo in console.
Aggiungere 4 elementi alla collezione e stampare la collezione aggiornata in console
 */

    public static void main(String[] args) throws Exception {
        
        List<Studente> studenti1 = new ArrayList<Studente>();
        Studente franco = new Studente("Franco", 20);
        Studente simone = new Studente("Simone", 21);

        studenti1.add(franco);
        studenti1.add(simone);

        System.out.println(studenti1);

        Studente franco1 = new Studente("Fra", 22);
        Studente simone1 = new Studente("Sim", 23);
        Studente franco2 = new Studente("nco", 24);
        Studente simone2 = new Studente("one", 25);

        studenti1.add(simone1);
        studenti1.add(simone2);
        studenti1.add(franco1);
        studenti1.add(franco2);

        System.out.println(studenti1);

    

    }
}
