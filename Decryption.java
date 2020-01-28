package EncryptionTool;
import java.util.*;

class Decryption {

    static void decrypt() throws Menu.InvalidDecryptionException {
        Menu.displayTitle("Decryption:");
        boolean pass = false;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to decrypt: ");
        String x = input.nextLine();
        char[] watermarkCheck = x.toCharArray();

        while (!pass) {
            if (watermarkCheck[2] == '6' && watermarkCheck[7] == 'c' && watermarkCheck[watermarkCheck.length - 3] == '4' && watermarkCheck[watermarkCheck.length - 8] == '9') {
                System.out.println("Enter decryption key: ");
                String response = input.nextLine();
                if (response.equals("Monarch2011")) {
                    pass = true;
                    level4And3(x);
                } else {
                    System.out.println("Incorrect decryption key");
                }
            } else throw new Menu.InvalidDecryptionException();
        }
    }

    private static String hexToString(String hex) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < hex.length(); i += 2) {
            str.append((char) Integer.parseInt(hex.substring(i, i + 2), 16));
        }
        return str.toString();
    }

    private static void level4And3(String x) throws Menu.InvalidDecryptionException {
        x = hexToString(x);
        x = x.substring(32);
        x = x.substring(0, x.length() - 37);
        x = x.replace("{", "");
        x = x.replace("]", "");
        int startIndex = x.indexOf("[");
        int endIndex = x.indexOf("[") + 5;
        String remove = x.substring(startIndex, endIndex);
        x = x.replace(remove, "");

        if (x.contains("{") || x.contains("]") || x.contains("[")) {
            throw new Menu.InvalidDecryptionException();
        } else level2(x);
    }

    private static void level2(String x) throws Menu.InvalidDecryptionException {

        char[] chars = x.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == 'D') {
                chars[i] = 'A';
                i++;
                continue;
            }
            if (chars[i] == 'd') {
                chars[i] = 'a';
                i++;
                continue;
            }
            if (chars[i] == 'E') {
                chars[i] = 'B';
                i++;
                continue;
            }
            if (chars[i] == 'e') {
                chars[i] = 'b';
                i++;
                continue;
            }
            if (chars[i] == 'F') {
                chars[i] = 'C';
                i++;
                continue;
            }
            if (chars[i] == 'f') {
                chars[i] = 'c';
                i++;
                continue;
            }
            if (chars[i] == 'G') {
                chars[i] = 'D';
                i++;
                continue;
            }
            if (chars[i] == 'g') {
                chars[i] = 'd';
                i++;
                continue;
            }
            if (chars[i] == 'H') {
                chars[i] = 'E';
                i++;
                continue;
            }
            if (chars[i] == 'h') {
                chars[i] = 'e';
                i++;
                continue;
            }
            if (chars[i] == 'I') {
                chars[i] = 'F';
                i++;
                continue;
            }
            if (chars[i] == 'i') {
                chars[i] = 'f';
                i++;
                continue;
            }
            if (chars[i] == 'J') {
                chars[i] = 'G';
                i++;
                continue;
            }
            if (chars[i] == 'j') {
                chars[i] = 'g';
                i++;
                continue;
            }
            if (chars[i] == 'K') {
                chars[i] = 'H';
                i++;
                continue;
            }
            if (chars[i] == 'k') {
                chars[i] = 'h';
                i++;
                continue;
            }
            if (chars[i] == 'L') {
                chars[i] = 'I';
                i++;
                continue;
            }
            if (chars[i] == 'l') {
                chars[i] = 'i';
                i++;
                continue;
            }
            if (chars[i] == 'M') {
                chars[i] = 'J';
                i++;
                continue;
            }
            if (chars[i] == 'm') {
                chars[i] = 'j';
                i++;
                continue;
            }
            if (chars[i] == 'N') {
                chars[i] = 'K';
                i++;
                continue;
            }
            if (chars[i] == 'n') {
                chars[i] = 'k';
                i++;
                continue;
            }
            if (chars[i] == 'O') {
                chars[i] = 'L';
                i++;
                continue;
            }
            if (chars[i] == 'o') {
                chars[i] = 'l';
                i++;
                continue;
            }
            if (chars[i] == 'P') {
                chars[i] = 'M';
                i++;
                continue;
            }
            if (chars[i] == 'p') {
                chars[i] = 'm';
                i++;
                continue;
            }
            if (chars[i] == 'Q') {
                chars[i] = 'N';
                i++;
                continue;
            }
            if (chars[i] == 'q') {
                chars[i] = 'n';
                i++;
                continue;
            }
            if (chars[i] == 'R') {
                chars[i] = 'O';
                i++;
                continue;
            }
            if (chars[i] == 'r') {
                chars[i] = 'o';
                i++;
                continue;
            }
            if (chars[i] == 'S') {
                chars[i] = 'P';
                i++;
                continue;
            }
            if (chars[i] == 's') {
                chars[i] = 'p';
                i++;
                continue;
            }
            if (chars[i] == 'T') {
                chars[i] = 'Q';
                i++;
                continue;
            }
            if (chars[i] == 't') {
                chars[i] = 'q';
                i++;
                continue;
            }
            if (chars[i] == 'U') {
                chars[i] = 'R';
                i++;
                continue;
            }
            if (chars[i] == 'u') {
                chars[i] = 'r';
                i++;
                continue;
            }
            if (chars[i] == 'V') {
                chars[i] = 'S';
                i++;
                continue;
            }
            if (chars[i] == 'v') {
                chars[i] = 's';
                i++;
                continue;
            }
            if (chars[i] == 'W') {
                chars[i] = 'T';
                i++;
                continue;

            }
            if (chars[i] == 'w') {
                chars[i] = 't';
                i++;
                continue;

            }
            if (chars[i] == 'X') {
                chars[i] = 'U';
                i++;
                continue;
            }
            if (chars[i] == 'x') {
                chars[i] = 'u';
                i++;
                continue;
            }
            if (chars[i] == 'Y') {
                chars[i] = 'V';
                i++;
                continue;
            }
            if (chars[i] == 'y') {
                chars[i] = 'v';
                i++;
                continue;
            }
            if (chars[i] == 'Z') {
                chars[i] = 'W';
                i++;
                continue;
            }
            if (chars[i] == 'z') {
                chars[i] = 'w';
                i++;
                continue;
            }
            if (chars[i] == 'A') {
                chars[i] = 'X';
                i++;
                continue;
            }
            if (chars[i] == 'B') {
                chars[i] = 'Y';
                i++;
                continue;
            }
            if (chars[i] == 'b') {
                chars[i] = 'y';
                i++;
                continue;
            }
            if (chars[i] == 'C') {
                chars[i] = 'Z';
                i++;
                continue;
            }
            if (chars[i] == 'c') {
                chars[i] = 'z';
                i++;
                continue;
            }
            if (chars[i] == '4') {
                chars[i] = '1';
                i++;
                continue;
            }
            if (chars[i] == '5') {
                chars[i] = '2';
                i++;
                continue;
            }
            if (chars[i] == '6') {
                chars[i] = '3';
                i++;
                continue;
            }
            if (chars[i] == '7') {
                chars[i] = '4';
                i++;
                continue;
            }
            if (chars[i] == '8') {
                chars[i] = '5';
                i++;
                continue;
            }
            if (chars[i] == '9') {
                chars[i] = '6';
                i++;
                continue;
            }
            if (chars[i] == '1') {
                chars[i] = '7';
                i++;
                continue;
            }
            if (chars[i] == '2') {
                chars[i] = '8';
                i++;
                continue;
            }
            if (chars[i] == '3') {
                chars[i] = '9';
                i++;
                continue;
            }
            if (chars[i] == '&') {
                chars[i] = '?';
                i++;
                continue;
            }
            if (chars[i] == '<') {
                chars[i] = '!';
                i++;
                continue;
            }
            if (chars[i] == '=') {
                chars[i] = '.';
                i++;
                continue;
            }
            if (chars[i] == '(') {
                chars[i] = '+';
                i++;
                continue;
            }
            if (chars[i] == ')') {
                chars[i] = '-';
                i++;
                continue;
            }
            if (chars[i] == '/') {
                chars[i] = '=';
                i++;
                continue;
            }
            if (chars[i] == '^') {
                chars[i] = '$';
                i++;
                continue;
            }
            if (chars[i] == '|') {
                chars[i] = '(';
                i++;
                continue;
            }
            if (chars[i] == ':') {
                chars[i] = ')';
                i++;
                continue;
            }
            if (chars[i] == '@') {
                chars[i] = ',';
                i++;
                continue;
            }
            if (chars[i] == '#') {
                chars[i] = ' ';
                i++;
                continue;
            }
            if (chars[i] == '?') {
                chars[i] = ':';
                i++;
                continue;
            }
            if (chars[i] == ',') {
                chars[i] = '%';
                i++;
                continue;
            }
            if (chars[i] == '$') {
                chars[i] = '@';
                i++;
                continue;
            }
            if (chars[i] == '!') {
                chars[i] = '\'';
                i++;
            } else throw new Menu.InvalidDecryptionException();
        }
        level1(String.valueOf(chars));
    }

    private static void level1(String x) throws Menu.InvalidDecryptionException {
        x = new StringBuilder(x).reverse().toString();
        String check = new StringBuilder(x).reverse().toString();
        if (!check.equals(x)) {
            System.out.println(x);
            Scanner input = new Scanner(System.in);
            System.out.println("Start again? Y/N: ");
            String response = input.nextLine();
            switch (response) {
                case "N":
                case "n":
                    System.exit(0);
                default:
                    break;
            }
        }
        else throw new Menu.InvalidDecryptionException();
    }
}


