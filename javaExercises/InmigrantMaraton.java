import java.util.Scanner;

/*
In the city of Oberá, Misiones, the "Immigrant Marathon" is held year after year as part of the National Immigrant Festival.
The event has a registration day the day before the race, so the exact number of participants that there
might end up being is unknown. The Federation of Associations (the organizing body) stated that the following data
is requested for each participant's registration: ID number (dni), name, and age.
Regarding the possible categories for registration, the following are handled:
Minors A (ages 6 to 10)
Minors B (ages 11 to 17)
Youth (ages 18 to 30)
Adults (ages 31 to 50)
Older Adults (over 50 years old)
A program is needed that, based on the input of each participant's data and age, displays on the screen which category
they should be registered in. It should be noted that at the end of the day, to finish the registrations,
an ID number (dni) with the value 0 and a name with the word "fin" must be entered.
 */
public class InmigrantMaraton {
    public static void main (String[] args){
        Scanner usrID = new Scanner(System.in);
        Scanner usrName = new Scanner(System.in);
        Scanner usrAge = new Scanner(System.in);
        System.out.println("Enter the participant details");
        System.out.println("ID number (dni)");
        int id = usrID.nextInt();
        System.out.println("name");
        String name = usrName.nextLine();
        System.out.println("age");
        int age = usrAge.nextInt();

        while(id !=0 && !name.equalsIgnoreCase("fin")){
            if(age >= 6 && age <=10){
                System.out.println("The participant bellows to te Minors A category");
            }else if(age >= 11 && age <=17){
                System.out.println("The participant bellows to te Minors B category");
            }else if(age >= 18 && age <=30){
                System.out.println("The participant bellows to te Youth category");
            }else if(age >= 31 && age <=50){
                System.out.println("The participant bellows to te Adults category");
            }else{
                System.out.println("The participant bellows to Older Adults category");
            }
            System.out.println("Enter details of other participants");
            System.out.println("ID number (dni)");
            id = usrID.nextInt();
            System.out.println("name");
            name = usrName.nextLine();
            System.out.println("age");
            age = usrAge.nextInt();
        }
    }
}
