import java.util.Scanner;

import java.util.*;

public class primefactor

{
    public static void main(String[] args) {
        {
        }
        System.out.println("Enter The number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = 2; i <= a;) {
            if (a % i == 0) {
                System.out.println(i);
                a = a / i;
            } else {
                i++;
            }
        }
    }

}