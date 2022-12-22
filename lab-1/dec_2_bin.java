import java.util.*;

class dec_2_bin {
    public static void main(String[] args) {
        System.out.println("Enter The number:-");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        for (int i = a; i > 0; i = i / 2) {
            System.out.print(i % 2);
        }
    }
}