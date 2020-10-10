package _6kyu.prime.number;

public class Prime {

    // https://www.codewars.com/kata/5262119038c0985a5b00029f
    public static boolean isPrime(int num) {

        boolean isPrime = true;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        return num > 1 && isPrime;
    }
}
