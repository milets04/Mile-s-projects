package others;

/*
Counting the number of digits that a number has
(Applying recursivity)
 */
public class NumberDigits {
    public int counting(int n){
        int res;
        if(n<10){
            res = 1;
        }else{
            n = n/10;
            res = 1 + counting(n);
        }
        System.out.println(res);
        return res;
    }

}
