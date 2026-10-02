/*
On 3 different vectors; names, min and max temperatures from 5 Misiones's cities are saved
On the first vector cities names are saved, on the second the min temperature reached and in the third one
the max temperatures on last weekend.
A program is needed which allows to upload the cities and its temperatures, besides, it should inform by screen
which city was the one with lower temperature and the one with higher temperature.
 */

import java.util.Scanner;

public class Weather {
    void main(){
        String cities [] = new String[5];
        double minTemp[] = new double[5];
        double maxTemp[] = new double [5];

        Scanner keyboard = new Scanner(System.in);
        Scanner keyboardT = new Scanner(System.in);

        for (int i=0; i<5; i++){
            System.out.println("Enter the name of the city: ");
            cities[i] = keyboard.next();
            System.out.println("Enter the minimum temperature of the city: ");
            minTemp[i] = keyboardT.nextDouble();
            System.out.println("Enter the minimum temperature of the city: ");
            maxTemp[i] = keyboardT.nextDouble();
        }

        double min;
        for(int i=0; i < cities.length; i++){
            
        }

    }
}
