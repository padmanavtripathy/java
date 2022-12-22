import java.util.Scanner;

class Rectangle {
    Float length;
    Float width;

    void rectangle(Float length, Float width) {
        this.length = length;
        this.width = width;
    }

    void value() {
        System.out.println("Enter The Length of THe Rectangle: ");
        Scanner sc = new Scanner(System.in);
        length = sc.nextFloat();
        System.out.println("Enter The Width Of The Rectangle: ");
        width = sc.nextFloat();

    }

    void print() {
        System.out.println("The length is " + length + "The width is " + width);
    }

    double Area() {
        double area = length * width;
        return area;
    }

    double perimiter() {
        double peri = 2 * (length + width);
        return peri;
    }

}

class Find {
    public static void main(String[] args) {
        Rectangle R1 = new Rectangle();
        R1.value();
        R1.print();
        double area = R1.Area();
        double peri = R1.perimiter();
        System.out.println("The Area of the rectangle is " + area);
        System.out.println("The Perimetere of the rectangle is " + peri);
    }
}