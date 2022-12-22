import java.util.Scanner;

class Multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Row Size Of The First Array : ");
        int row = sc.nextInt();
        System.out.println("Enter The Column Size Of First Array : ");
        int col1 = sc.nextInt();
        int arr1[][] = new int[row][col1];
        System.out.println("Enter The Array value : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col1; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        System.out.println("Enter The Column Size Of Second array : ");
        int col2 = sc.nextInt();
        int arr2[][] = new int[col1][col2];
        System.out.println("Enter The Value of second array : ");
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < col2; j++) {
                arr2[i][j] = sc.nextInt();
            }
        }
        System.out.println("The First Array is : ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col1; j++) {
                System.out.print(arr1[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("The Second Array is : ");
        for (int i = 0; i < col1; i++) {
            for (int j = 0; j < col2; j++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }
        int mul[][] = new int[row][col2];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col2; j++) {
                for (int j = 0; j < col1; j++) {
                    for (int k = 0; k < col2; k++) {
                        mul[i][j] = arr1[i][k] * arr2[k][j];
                    }
                }

            }
            System.out.println("The Third Array is : ");
            for (int i = 0; i < row; i++) {
                System.out.print(arr2[i][j] + "  ");
            }
            System.out.println();
        }
    }
}