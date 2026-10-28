import java.util.Scanner;

public class ReverseName {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();

        char[] letters = name.toCharArray();

        int start = 0;
        int end = letters.length - 1;

        while (start < end) {
            char temp = letters[start];
            letters[start] = letters[end];
            letters[end] = temp;

            start++;
            end--;
        }

        String reversedName = new String(letters);

        System.out.println("Reversed name: " + reversedName);

        input.close();
    }
}