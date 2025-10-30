import java.util.Scanner;

class TableThread extends Thread {
    int num;

    TableThread(int num) {
        this.num = num;
    }

    public void run() {
        try {
            for (int i = 1; i <= 10; i++) {
                System.out.println("Table: " + num + " x " + i + " = " + (num * i));
                Thread.sleep(2000); // 2-second delay
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class DivisorThread extends Thread {
    int num;

    DivisorThread(int num) {
        this.num = num;
    }

    public void run() {
        try {
            System.out.println("Divisors of " + num + ":");
            for (int i = 1; i <= num; i++) {
                if (num % i == 0) {
                    System.out.println("Divisor: " + i);
                    Thread.sleep(2000); // 2-second delay
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class multidiv {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        TableThread t1 = new TableThread(num);
        DivisorThread t2 = new DivisorThread(num);

        t1.start();
        t2.start();

        sc.close();
    }
}
