import java.util.Scanner;

public class centinelaWord {
    /*
    Create a program which prints on screen the words that are entered by keyboard
    and not finish until the user enter the word "exit"
     */
    public static void main(String[] args) {
        System.out.println("Input one word");
        Scanner usr = new Scanner (System.in);
        String word = usr.nextLine();

        while(!word.equals("exit")){
            System.out.println("Write another word");
            word = usr.nextLine();
        }

    }
}
