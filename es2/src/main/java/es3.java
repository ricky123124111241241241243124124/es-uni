import java.util.Arrays;
import java.util.Scanner;

public class es3 {
    public static boolean[] valore(String uno){

        char[] array = uno.toCharArray();
        boolean[] array2 = new boolean[array.length];

        for(int i = 0; i < array.length; i++)
            if(Character.isLetter(array[i]))
                array2[i] = true;
            else
                array2[i] = false;
        
        return array2;   
    }
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String codrif = "AAAAAA00A00A000A";
        String targarif = "AA000AA";
        
        System.out.println("inserisci il codice fiscale: ");
        String cod = sc.nextLine(); cod.toUpperCase();

        boolean[] codarr = valore(codrif);
        boolean[] codarr2 = valore(cod);

        boolean confrcod = Arrays.equals(codarr, codarr2);

        if(confrcod)
            System.out.println("il codice è valido");
        else
            System.out.println("il codice non è valido");

        /*************************************************************************************/

        System.out.println("inserisci la targa: ");
        String targa = sc.nextLine(); targa.toUpperCase();
        
        boolean[] targarr = valore(targarif);
        boolean[] targarr2 = valore(targa);

        boolean confrtar = Arrays.equals(targarr, targarr2);

        if(confrtar)
            System.out.println("la targa è valida");
        else
            System.out.println("la targa non è valida"); 
    }
}
