import java.util.Scanner;
import java.text.DecimalFormat;

class BookFair {
    // Data Members
    private String Bname;
    private double price;

    // Constructor to initialize data members
    public BookFair() {
        Bname = "";
        price = 0.0;
    }

    // Method to input and store the name and price of the book
    public void input() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the name of the book:");
        Bname = sc.nextLine();

        System.out.println("Enter the price of the book:");
        price = sc.nextDouble();
    }

    // Method to calculate the price after discount
    public void calculate() {
        double discount;

        if (price <= 1000) {
            discount = price * 0.02; // 2% discount
        } else if (price <= 3000) {
            discount = price * 0.10; // 10% discount
        } else {
            discount = price * 0.15; // 15% discount
        }

        price -= discount; // Apply the discount
    }

    // Method to display the name and price of the book after discount
    public void display() {
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Book Name = " + Bname);
        System.out.println("Price after discount: \u20B9" + df.format(price));
    }

    // Main method to test the class
    public static void main(String[] args) {
        BookFair book = new BookFair(); // Create an object of BookFair

        book.input();      // Input book details
        book.calculate();  // Calculate the price after discount
        book.display();    // Display book details
    }
}
