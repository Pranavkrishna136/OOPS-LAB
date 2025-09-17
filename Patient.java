import java.util.Scanner;

class Patientdetails {
    private int patientId;
    private String name;
    private int age;
    private String disease;
    private double dailyRoomCharge;
    private int days;

    public Patientdetails(int patientId, String name, int age, String disease, double dailyRoomCharge, int days) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.disease = disease;
        this.dailyRoomCharge = dailyRoomCharge;
        this.days = days;
    }

    public double calculateBill() {
        double total = dailyRoomCharge * days;
        total = total + (0.05 * total);
        return total;
    }

    public void displayDetails() {
        System.out.println("------------ HOSPITAL BILL ------------");
        System.out.println("Patient ID      : " + patientId);
        System.out.println("Patient Name    : " + name);
        System.out.println("Patient Age     : " + age);
        System.out.println("Disease         : " + disease);
        System.out.println("Days Admitted   : " + days);
        System.out.println("Daily Charge    : " + dailyRoomCharge);
        System.out.println("Total Bill (with 5% tax): " + calculateBill());
        System.out.println("---------------------------------------");
    }
}

public class Patient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details of Patient 1:");
        System.out.print("Patient ID: ");
        int id1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name1 = sc.nextLine();
        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine();
        System.out.print("Disease: ");
        String disease1 = sc.nextLine();
        System.out.print("Daily Room Charge: ");
        double charge1 = sc.nextDouble();
        System.out.print("Days Admitted: ");
        int days1 = sc.nextInt();

        Patientdetails p1 = new Patientdetails(id1, name1, age1, disease1, charge1, days1);

        System.out.println("\nEnter details of Patient 2:");
        System.out.print("Patient ID: ");
        int id2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Name: ");
        String name2 = sc.nextLine();
        System.out.print("Age: ");
        int age2 = sc.nextInt();
        sc.nextLine();
        System.out.print("Disease: ");
        String disease2 = sc.nextLine();
        System.out.print("Daily Room Charge: ");
        double charge2 = sc.nextDouble();
        System.out.print("Days Admitted: ");
        int days2 = sc.nextInt();

        Patientdetails p2 = new Patientdetails(id2, name2, age2, disease2, charge2, days2);

        System.out.println("\n--- Patient 1 Bill Details ---");
        p1.displayDetails();

        System.out.println("\n--- Patient 2 Bill Details ---");
        p2.displayDetails();

        sc.close();
    }
}
