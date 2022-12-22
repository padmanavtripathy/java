import java.util.*;

class customers {
    String Name;
    String mob_Number;
    String address;
    String product_no;

    public customers(String name, String mob_Number, String address, String product_no) {
        this.Name = name;
        this.mob_Number = mob_Number;
        this.address = address;
        this.product_no = product_no;
    }
}

class customer {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<customers> cu = new ArrayList<>();
        int count = 0;
        boolean b = true;
        while (b) {
            if (count < 10) {
                System.out.println("Enter The Customer name :- ");
                String Name = sc.nextLine();
                System.out.println("Enter The Mobile Number :- ");
                String mob_Number = sc.nextLine();
                System.out.println("Enter The Shoping Address :- ");
                String address = sc.nextLine();
                System.out.println("Enter The  product_number :- ");
                String product_no = sc.nextLine();
                cu.add(new customers(Name, mob_Number, address, product_no));
                count++;
                System.out.println("1. Continue 2. Break ------- Do you wants to continue:- ");
                int a = sc.nextInt();
                if (a == 2) {
                    break;
                }
            } else {
                System.out.println("Customer excids");
                break;
            }
        }
        System.out.println("        NAME        " + "        NUMBER      " + "     SHOPPING ADDRESS        "
                + "     PRODUCT NUMBER      ");
        System.out.println(
                "--------------------  --------------------  ------------------------------  --------------------------");
        for (customers cse : cu) {

            System.out.println(
                    cse.Name + "      " + cse.mob_Number + "               " + cse.address + "              "
                            + cse.product_no);
            System.out.println(
                    "--------------------  --------------------  ------------------------------  --------------------------");
        }

    }

}