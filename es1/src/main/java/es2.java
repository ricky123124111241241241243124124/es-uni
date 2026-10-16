import java.util.Scanner;;

public class es2{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("inserisci la stringa: ");
        String stringa = sc.nextLine();

        char[] array = stringa.toCharArray();

        System.out.println("inserisci il carattere che dovrà essere sostituito e il carattere con cui sostituirlo: ");
        char oldChar = sc.nextLine().charAt(0); char newChar = sc.nextLine().charAt(0);

        for(int i = 0; i < array.length; i++){
            if(array[i] == oldChar){
                array[i] = newChar;
            }
        }

        for(char c : array) {
            System.out.print(c);
        }
    }
}