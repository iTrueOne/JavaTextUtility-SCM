import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean running = true;

        System.out.println("=== Java Text Utility Tool ===");

        while (running) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Count characters");
            System.out.println("2. Count words");
            System.out.println("3. Reverse text");
            System.out.println("4. Check palindrome");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter text: ");
                    String charText = scanner.nextLine();
                    System.out.println("Number of characters: " + countCharacters(charText));
                    break;

                case 2:
                    System.out.print("Enter text: ");
                    String wordText = scanner.nextLine();
                    System.out.println("Number of words: " + countWords(wordText));
                    break;

                case 3:
                    System.out.print("Enter text: ");
                    String reverseText = scanner.nextLine();
                    System.out.println("Reversed text: " + reverseText(reverseText));
                    break;

                case 4:
                    System.out.print("Enter text: ");
                    String palindromeText = scanner.nextLine();

                    if (isPalindrome(palindromeText)) {
                        System.out.println("The text is a palindrome.");
                    } else {
                        System.out.println("The text is not a palindrome.");
                    }
                    break;

                case 0:
                    running = false;
                    System.out.println("Goodbye!");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }

    public static int countCharacters(String text) {
        return text.length();
    }

    public static int countWords(String text) {
        if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }

    public static String reverseText(String text) {
        return new StringBuilder(text).reverse().toString();
    }

    public static boolean isPalindrome(String text) {
        String cleanedText = text.replaceAll("\\s+", "").toLowerCase();
        String reversedText = new StringBuilder(cleanedText).reverse().toString();
        return cleanedText.equals(reversedText);
    }
}
