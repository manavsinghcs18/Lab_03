package Main;

import java.util.Scanner;

/**
 * @author ManavSingh
 * @version 1.0*/

public class Harmonic
{
    public static void main(String[] args) {
        Double n;
        Double s = 0.0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter the value of N");
        n = scanner.nextDouble();
        for (int i = 1; i <= n; i++) {
            s = s + (double) 1 / i;
        }
        System.out.println("Sum of harmonic series is " + s);
    }
}
