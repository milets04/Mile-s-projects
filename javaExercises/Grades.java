/*
Grades of 4 highschool students are saved in a 4 rows and 4 columns table.
Each row corresponds to the grades and average grade of each student.
It's required a program who allows a professor to upload on the 3 row's columns, student's grades and in the
last column the average grade is calculated.
Grades and average grade have to be printed.
 */

import java.util.Scanner;

public class Grades {
    void main(){
        double table [][] = new double [4][4];
        double add = 0;
        Scanner keyboard = new Scanner(System.in);

        for(int i=0; i<4; i++){
            for(int j=0; j<3; j++){
                System.out.println("Enter the student's grade: " + i);
                table [i][j] =  keyboard.nextDouble();
                add = add + table [i][j];
            }
            table[i][3] = add/3;
            add = 0;
        }

        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){
                System.out.println("Student grades: " + table[i][j]);
            }
        }
    }
}
