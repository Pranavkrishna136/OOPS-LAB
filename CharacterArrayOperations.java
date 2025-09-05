import java.util.Scanner;

public class CharacterArrayOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of characters: ");
        int n = sc.nextInt();
        char[] arr = new char[n];

        System.out.println("Enter the characters: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next().charAt(0);
        }

        int vowels = 0, consonants = 0;

        for (int i = 0; i < n; i++) {
            char c = arr[i];
            if (Character.isLetter(c)) {
                if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' ||
                    c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.print("Duplicate Characters are: ");
        boolean foundDuplicate = false;
        for (int i = 0; i < n; i++) {
            int count = 1;
            if (arr[i] == '0') continue;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    arr[j] = '0';
                }
            }
            if (count > 1) {
                System.out.print(arr[i] + " ");
                foundDuplicate = true;
            }
        }
        if (!foundDuplicate) {
            System.out.print("None");
        }

        System.out.println();
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
}
