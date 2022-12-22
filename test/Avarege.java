import java.util.Scanner;

public class Avarege {
    public static void main(String[] args) {
        System.out.println("Enter the values acordingly");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The FLO mark:");
        int FLO = sc.nextInt();
        System.out.println("Enter SLE mark:");
        int SLE = sc.nextInt();
        System.out.println("Enter The TLH or TLS mark: ");
        int TL = sc.nextInt();
        System.out.println("Enter The MATH mark:");
        int MATH = sc.nextInt();
        System.out.println("Enter The scince mark:");
        int sin = sc.nextInt();
        int total = FLO + SLE + TL + MATH + sin;
        int avg = total / 5;
        System.out.println("The sum is :" + total);
        System.out.println("The Avarage is :" + avg);
    }
}
