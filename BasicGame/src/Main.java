import java.util.Scanner;

public class Main
{
    //Scanner ist nativ in Java
    private static Scanner scanner;

    private static Hero hero;

    public static void main(String[] args)
    {
        //Scanner initialisieren
        scanner = new Scanner(System.in);

        hero = new Hero();

        System.out.println("Options: attack, arbitraryOption, quit");

        //fancy Version einer Dauerschleife
        while(scanner.hasNext())
        {
            //siehe getString()
            String scannerString = getString();

            if(scannerString.equals("attack"))
                hero.attack();

            if(scannerString.equals("arbitraryOption"))
                //execute arbitrary action
                System.out.println("Arbitrary Option executed");

            if(scannerString.equals("quit"))
                break;
        }
    }

    private static String getString()
    {
        //überprüfen, ob es eine Eingabe gibt
        if(scanner.hasNext())
            /* jedes Mal wenn scanner.next() ausgeführt wird, wird eine Zeile gelesen
             * deswegen muss sichergestellt werden, dass der Wert von scanner.next() gesichert wird
             * und _nicht_ bei Bedarf auf diese Eingabe erneut scanner.next() ausgeführt wird
             */
            return scanner.next();

        return null;
    }
}
