package _8kyu.multiplication;

class Multiplication {
    public static String multiTable(int num) {
        String finalString = "";
        for (int i = 1; i <= 10; i++) {
            int result = i * num;
            finalString += i + " * " + num + " = " + result + "\n";
        }
        return finalString.trim();
    }
}
