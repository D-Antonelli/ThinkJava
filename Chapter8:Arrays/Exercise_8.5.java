import java.util.Arrays;

//Write a method called 'sieve' that takes an integer parameter ,n,and returns a boolean array that indicates, for each number from 0 to n-1, whether the number is prime. 
//based on Sieve of Eratosthenes algorithm 

public class PrimeNumbers {

    public static void sieve(int n) {

        //create a boolean and declare all values in true
        boolean[] isTrue = new boolean[n-1];
        Arrays.fill(isTrue, true);


        int increment = 1;
        for (int i = 2; i < isTrue.length; i++) {
            increment = 1;
            for (int j = i * i; j < isTrue.length; j = increment*i) {
                isTrue[j] = false;
                increment++;
            }
        }

        for (int i = 2; i < isTrue.length; i++) {
                System.out.println(i + " is a prime number? = " + isTrue[i]);
        }
    }
}
