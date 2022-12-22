import java.util.*;

class sum {
    public static void main(String[] args) {
        System.out.print("Enter The Number");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= a; i++) {
            sum = sum + i;
        }
        System.out.println("The sum is :- " + sum);
    }
}