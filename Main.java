import java.util.*;
class WordThread extends Thread {
    String text;

    WordThread(String text) {
        this.text = text;
    }

    public void run() {
        String[] words = text.split(" ");
        try {
            for (String word : words) {
                System.out.println("Word: " + word);
                Thread.sleep(2000); // 2-second delay
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class VowelThread extends Thread {
    String text;

    VowelThread(String text) {
        this.text = text;
    }

    public void run() {
        try {
            for (int i = 0; i < text.length(); i++) {
                char ch = text.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                    ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                    System.out.println("Vowel: " + ch);
                    Thread.sleep(2000); // 2-second delay
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        String paragraph = "Java supports multithreading";

        WordThread w = new WordThread(paragraph);
        VowelThread v = new VowelThread(paragraph);

        w.start();
        v.start();
    }
}
