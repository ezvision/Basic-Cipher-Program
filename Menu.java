package EncryptionTool;
import java.util.*;

class Menu {

    private static boolean exit;

    private static void printTitle() {
        System.out.println("+-----------------------------------+");
        System.out.println("|          Encryption tool          |");
        System.out.println("+-----------------------------------+");

    }

    static void startMenu() {
        printTitle();
        while (!exit) {
            printOptions();
            int choice = getUserChoice();
            performInput(choice);
        }
    }
    private static void printOptions() {
        displayTitle("Please make a selection");
        System.out.println("1. Encrypt");
        System.out.println("2. Decrypt");
        System.out.println("3. Exit");
    }
    private static int getUserChoice() {
        Scanner keyboard = new Scanner(System.in);
        int choice = -1;
        do {
            System.out.print("Enter your choice: ");
            try {
                choice = Integer.parseInt(keyboard.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Invalid choice, only numbers are allowed");
            }
            if (choice < 0 || choice > 4) {
                System.out.println("Invalid choice, number is out of bounds");
            }
        } while (choice < 0 || choice > 4);
        return choice;
    }

    private static void performInput(int choice) {
        switch (choice) {
            case 1: {
                try {
                    Encryption.encrypt();
                } catch (InvalidEncryptionException ex) {
                    System.out.println("Given input could not be encrypted");
                }
            }
            break;
            case 2:
                try{
                    Decryption.decrypt();
                }catch (InvalidDecryptionException ex) {
                    System.out.println("Given input could not be decrypted");
                }
                break;
            case 3:
                System.out.println("Thank you for using the program");
                System.exit(0);
                break;
            default:
                System.out.println("An unknown error has occurred");
        }
    }

    static void displayTitle(String x){
        System.out.println();
        int width = x.length() + 6;
        StringBuilder sb = new StringBuilder();
        sb.append("+");
        for(int i = 0; i < width; ++i){
            sb.append("-");
        }
        sb.append("+");
        System.out.println(sb.toString());
        System.out.println("|   " + x + "   |");
        System.out.println(sb.toString());
    }

    static class InvalidEncryptionException extends Exception {

        InvalidEncryptionException() {
            super("Error encrypting input");
        }

    }

    static class InvalidDecryptionException extends Exception {

        InvalidDecryptionException() {
            super("Error decrypting input");
        }

    }
}
