import java.util.Scanner;

class Rectangle {
    int length;
    int width;

    void rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    void value() {
        System.out.println("Enter The Length of THe Rectangle: ");
        Scanner sc = new Scanner(System.in);
        sc.nextInt();
        System.out.println("Enter The Width Of The Rectangle: ");
        sc.nextInt();

    }

    void print() {
        System.out.println("The length is " + length + "The width is " + width);
    }
}

class Find {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.value();
    }
}