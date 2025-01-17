import java.util.*;

class Eshop 
{
    String name; // Name of the item purchased
    double price; // Price of the item purchased

    // Method to accept input
    void accept() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name of the item:");
        name = sc.nextLine();
        System.out.println("Enter the price of the item:");
        price = sc.nextDouble();
    }

    // Method to calculate the net amount to be paid after applying the discount
    double calculate() 
    {
        double discount = 0.0;

        // Determine discount based on price
        if (price >= 1000 && price <= 25000) 
        {
            discount = 5.0;
        } else if (price >= 25001 && price <= 57000)
         {
            discount = 7.5;
        } else if (price >= 57001 && price <= 100000)
         {
            discount = 10.0;
        } else if (price > 100000) 
        {
            discount = 15.0;
        }

        // Calculate net amount
        double netAmount = price - (price * discount / 100);
        return netAmount;
    }

    // Method to display the details
    void display(double netAmount)
     {
        System.out.println("Item Name: " + name);
        System.out.println("Net Amount to be Paid: " + netAmount);
    }

    // Main method to test the class
    public static void main(String[] args) 
    {
        Eshop shop = new Eshop();
        shop.accept(); // Accept details
        double netAmount = shop.calculate(); // Calculate net amount
        shop.display(netAmount); // Display details
    }
}
