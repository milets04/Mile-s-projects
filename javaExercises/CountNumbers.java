//Just practicing my java skills
/*
Create a count number by a limit entered by the user, counting numbers 2 by 2
 */
void main() {
    Scanner usr = new Scanner(System.in);
    System.out.println("input the limit");
    int limit = usr.nextInt();
    int cont = 0;

    while (cont <= limit) {
        System.out.println(cont);
        cont = cont + 2;
    }
}
