import java.util.Scanner;

public class VectorSortVowels {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = input.nextInt();

        int[] numbers = new int[n];

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = input.nextInt();
        }

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.println("\nSorted vector:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

        input.nextLine();

        System.out.print("\n\nEnter your name: ");
        String name = input.nextLine();

        char[] letters = name.toLowerCase().toCharArray();
        int vowelCount = 0;

        for (int i = 0; i < letters.length; i++) {
            if ("aeiouáàâãéêíóôõú".indexOf(letters[i]) != -1) {
                vowelCount++;
            }
        }

        System.out.println("Number of vowels: " + vowelCount);

        input.close();
    }
}