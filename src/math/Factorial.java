package math;

/**
 * Created by mrahman on 04/22/17.
 */
public class Factorial {

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(fact(5));
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */

    }
    public  static int factorial(int n){
        if(n == 0){
            return 1;

        }
        return n*factorial(n-1);
    }
    public static int fact (int n){
        int product = 1;
        for(int i = 1; i<=n;i++){
            product = product*i;
        }
        return product;
    }

}
