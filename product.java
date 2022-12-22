import java.util.ArrayList;
    class Product {
        int pid;
        String pname;
        char pavailability;
        double pprice;
        float prating;
        public int size=1;

        Product(int pid, String pname, char pavailability, double pprice, float prating) {

            this.pid = pid;
            this.pname = pname;
            this.pavailability = pavailability;
            this.pprice = pprice;
            this.prating = prating;
        }

    public static void main(String args[]) {

        int pid[] = { 21823, 89774, 34007, 12098, 45098, 10067 };
        String pname[] = { "HP Laptop", "Inverters", "Volats AC", "iPhone 11", "CanonDSLR", "SonyLEDTV" };
        char pavailability[] = { 'Y', 'Y', 'N', 'Y', 'Y', 'N' };
        double pprice[] = { 31987, 16900, 28000, 99000, 67570, 60500 };
        float prating[] = { 4.5f, 4.0f, 4.7f, 4.5f, 3.9f, 4.0f };

        Product calobj = new Product();
       
        calobj.addElements(pid, pname, pavailability, pprice, prating);
    }

    public void addElements(int pid[], String pname[], char pavailability[], double pprice[], float prating[]) {
  
        ArrayList<Product> arraylist = new ArrayList<>();
        for (int i = 0; i < size; i++) {

            arraylist.add(new Product(pid[i], pname[i], pavailability[i], pprice[i], prating[i]));
        }

        displayElements(arraylist);
    }

    public void displayElements(ArrayList<Product> arraylist) {
        System.out.println("Product ID" + "   Product Name" + "     Product Availability" + "    Product Price"
                + "   Product Rating");
        System.out.println("-------------------------------------------------------------------------------------");

        for (int i = 0; i < size; i++) {
  
            Product product = arraylist.get(i);
           
            System.out.println(product.pid + "    " + "    " + product.pname + "               " + "  "
                    + product.pavailability + "                " + product.pprice + "           "
                    + String.format("%.01f", product.prating));
        }
    }
}