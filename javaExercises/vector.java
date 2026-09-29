/*
How many times the number 3 appears in the vector (array)
 */

import java.util.Scanner;

public class vector {
    void main() {
        int list[] = new int[15];
        Scanner board = new Scanner(System.in);
        System.out.println("Enter 15 numbers");
        for(int i=0; i<15; i++){
            list[i] = board.nextInt();
        }

        int count = 0;
        for(int i = 0; i<15; i++){
           if(list[i] == 3){
               count++;
           }
        }
        System.out.print("There are " + count + " number three");
    }
}
