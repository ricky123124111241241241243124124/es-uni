import java.util.Random;
import java.util.Scanner;

public class es4 {

    public static String generateRandomChars(String candidateChars, int length) {
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for(int i = 0; i < length; i ++)
            sb.append(candidateChars.charAt(random.nextInt(candidateChars.length())));
        return sb.toString();
    }

    public static boolean isDigitre(char c) {

        boolean bool = false;

        if(Character.isDigit(c))
            bool = true;

        return bool;
    }

    public static boolean pariOrDispari(String stringa) {

        char c = '\0';
        int min = 0;
        int mai = 0;
        boolean bool = false;

        for(int i = 0; i < stringa.length(); i++) {
            c = stringa.charAt(i);

            if(Character.isDigit(c))
                continue;
            else if(c >= 97 && c <= 122)
                min++;
            else
                mai++;
        }

        if(min % 2 == 0 || mai % 2 == 0)
            bool = true;

        return bool;
    }

    public static boolean soloLett(char c) {

        boolean bool = true;

        if(Character.isDigit(c))
            bool = false;

        return bool;
    }

    public static boolean dueCond(char c) {

        boolean bool = false;

        if(Character.isDigit(c) && c % 2 == 0)
            bool = true;

        return bool;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Inserisci la lunghezza della stringa da generare: ");
        int lunghezza = sc.nextInt();

        if(lunghezza < 0) {
            System.out.println("La lunghezza non può essere negativa.");
            sc.close();
            return;
        }

        String randomString = generateRandomChars(
            "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstwxyz1234567890",
            lunghezza
        );

        System.out.println("Stringa random generata > " + randomString);

        char c = '\0';
        int count1 = 0;
        int gettoni = 0;

        boolean boolpariodisp = false;
        boolean boolsololett = true;
        boolean boolduecond = false;

        for(int i = 0; i < randomString.length(); i++) {

            c = randomString.charAt(i);

            if(isDigitre(c))
                count1++;

            boolsololett = boolsololett && soloLett(c);

            if(dueCond(c))
                boolduecond = true;
        }

        boolpariodisp = pariOrDispari(randomString);

        if(count1 >= 3)
            gettoni += 1;

        if(boolpariodisp)
            gettoni += 5;

        if(boolsololett)
            gettoni += 10;

        if(count1 >= 3 && boolduecond)
            gettoni += 4;

        System.out.println("Gettoni vinti: " + gettoni);

        sc.close();
    }
}