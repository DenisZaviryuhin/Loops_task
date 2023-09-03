package app;

public class Main {

    public static void main(String[] args) {
        int sum = 0;
        int a = 0;
        for (int i = 1; i <= 6; i++) {
            a++;
            sum += i;
            System.out.println(a + ") Num is " + i + "," + " sum is " + sum);
        }
        System.out.println("---------------------" + "\nSum of numbers is " + sum);
    }
}
















