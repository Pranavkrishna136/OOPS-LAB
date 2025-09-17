import java.util.Scanner;

class Cake {
    protected String name;
    protected String flavor;
    protected double price;

    public Cake(String name, String flavor, double price) {
        this.name = name;
        this.flavor = flavor;
        this.price = price;
    }

    public void CalculatePrice() {
        System.out.println("Base Price: " + price);
    }

    public void displayDetails() {
        System.out.println("\n------ Cake Details ------");
        System.out.println("Name   : " + name);
        System.out.println("Flavor : " + flavor);
        System.out.println("Price  : " + price);
    }
}

class OrderCake extends Cake {
    private double weight;

    public OrderCake(String name, String flavor, double price, double weight) {
        super(name, flavor, price);
        this.weight = weight;
    }

    @Override
    public void CalculatePrice() {
        price = price * weight;
        System.out.println("Total Price (OrderCake): " + price);
    }
}

class ReadyMadeCake extends Cake {
    private int quantity;

    public ReadyMadeCake(String name, String flavor, double price, int quantity) {
        super(name, flavor, price);
        this.quantity = quantity;
    }

    @Override
    public void CalculatePrice() {
        price = price * quantity;
        System.out.println("Total Price (ReadyMadeCake): " + price);
    }
}

public class CakeShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose Cake Type:");
        System.out.println("1. Order Cake");
        System.out.println("2. ReadyMade Cake");
        int choice = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Cake Name: ");
        String name = sc.nextLine();
        System.out.print("Enter Flavor: ");
        String flavor = sc.nextLine();
        Cake cake = null;

        if (choice == 1) {
            System.out.print("Enter Price per Kg: ");
            double price = sc.nextDouble();
            System.out.print("Enter Weight (kg): ");
            double weight = sc.nextDouble();
            cake = new OrderCake(name, flavor, price, weight);
        } else if (choice == 2) {
            System.out.print("Enter Price per Cake: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();
            cake = new ReadyMadeCake(name, flavor, price, quantity);
        } else {
            System.out.println("Invalid choice!");
            sc.close();
            return;
        }

        cake.CalculatePrice();
        cake.displayDetails();
        sc.close();
    }
}
