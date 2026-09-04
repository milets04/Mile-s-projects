
/*
Basically doing the next sequence xd
   *
  ***
 *****
*******
  |||
 */

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args){
        Scanner usr = new Scanner(System.in);
        System.out.println("Enter the number of rows");
        int height = usr.nextInt();
        for(int row = 0; row <height; row++){
            for(int space = 0; space < (height-row-1); space++) {
                System.out.print(" ");
            }
            for (int asterisk = 0; asterisk <(row*2)+1;asterisk++){
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int space = 0; space < (height - 2); space++){
            System.out.print(" ");
        }
        System.out.println("|||");
    }
}
