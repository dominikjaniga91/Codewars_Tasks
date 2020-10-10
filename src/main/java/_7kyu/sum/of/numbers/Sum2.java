package _7kyu.sum.of.numbers;

public class Sum2 {

    public int GetSum(int a, int b)
    {
        return (a + b) * (Math.abs(a - b) + 1) / 2;
    }
}
