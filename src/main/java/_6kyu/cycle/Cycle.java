package _6kyu.cycle;

// https://www.codewars.com/kata/5a057ec846d843c81a0000ad/train/java

public class Cycle {
    public static int cycle(int n) {
        if(n % 2==0 || n % 5 ==0){
            return -1;
        }
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r =  r * 10 % n;
            if (r == 1) {
                return i;
            }
        }
        return -1;
    }
}
