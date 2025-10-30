import java.util.Scanner;

class EvenThread extends Thread {
    int[] numbers;

    EvenThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        try {
            for (int num : numbers) {
                if (num % 2 == 0) {
                    System.out.println("Even: " + num);
                    Thread.sleep(2000); // 2-second delay
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class OddThread extends Thread {
    int[] numbers;

    OddThread(int[] numbers) {
        this.numbers = numbers;
    }

    public void run() {
        try {
            for (int num : numbers) {
                if (num % 2 != 0) {
                    System.out.println("Odd: " + num);
                    Thread.sleep(2000); // 2-second delay
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class oddeven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < 10; i++) {
            numbers[i] = sc.nextInt();
        }

        EvenThread even = new EvenThread(numbers);
        OddThread odd = new OddThread(numbers);

        even.start();
        odd.start();

        sc.close();
    }
}
