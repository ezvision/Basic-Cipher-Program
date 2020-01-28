package EncryptionTool;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.util.UUID;
import java.util.*;

class Encryption {

    static void encrypt() throws Menu.InvalidEncryptionException {
        Menu.displayTitle("Encryption:");
        Scanner input = new Scanner(System.in);
        System.out.println("Enter text to encrypt: ");
        String text = input.nextLine();
        String level1 = new StringBuilder(text).reverse().toString();
        String check = new StringBuilder(level1).reverse().toString();
        if (check.equals(text)) level2(level1);
        else throw new Menu.InvalidEncryptionException();
    }

    private static void level2(String x) throws Menu.InvalidEncryptionException {
        char[] chars = x.toCharArray();
        int i = 0;
        while (i < chars.length) {
            if (chars[i] == 'A') {
                chars[i] = 'D';
                i++;
                continue;
            }
            if (chars[i] == 'a') {
                chars[i] = 'd';
                i++;
                continue;
            }
            if (chars[i] == 'B') {
                chars[i] = 'E';
                i++;
                continue;
            }
            if (chars[i] == 'b') {
                chars[i] = 'e';
                i++;
                continue;
            }
            if (chars[i] == 'C') {
                chars[i] = 'F';
                i++;
                continue;
            }
            if (chars[i] == 'c') {
                chars[i] = 'f';
                i++;
                continue;
            }
            if (chars[i] == 'D') {
                chars[i] = 'G';
                i++;
                continue;
            }
            if (chars[i] == 'd') {
                chars[i] = 'g';
                i++;
                continue;
            }
            if (chars[i] == 'E') {
                chars[i] = 'H';
                i++;
                continue;
            }
            if (chars[i] == 'e') {
                chars[i] = 'h';
                i++;
                continue;
            }
            if (chars[i] == 'F') {
                chars[i] = 'I';
                i++;
                continue;
            }
            if (chars[i] == 'f') {
                chars[i] = 'i';
                i++;
                continue;
            }
            if (chars[i] == 'G') {
                chars[i] = 'J';
                i++;
                continue;
            }
            if (chars[i] == 'g') {
                chars[i] = 'j';
                i++;
                continue;
            }
            if (chars[i] == 'H') {
                chars[i] = 'K';
                i++;
                continue;
            }
            if (chars[i] == 'h') {
                chars[i] = 'k';
                i++;
                continue;
            }
            if (chars[i] == 'I') {
                chars[i] = 'L';
                i++;
                continue;
            }
            if (chars[i] == 'i') {
                chars[i] = 'l';
                i++;
                continue;
            }
            if (chars[i] == 'J') {
                chars[i] = 'M';
                i++;
                continue;
            }
            if (chars[i] == 'j') {
                chars[i] = 'm';
                i++;
                continue;
            }
            if (chars[i] == 'K') {
                chars[i] = 'N';
                i++;
                continue;
            }
            if (chars[i] == 'k') {
                chars[i] = 'n';
                i++;
                continue;
            }
            if (chars[i] == 'L') {
                chars[i] = 'O';
                i++;
                continue;
            }
            if (chars[i] == 'l') {
                chars[i] = 'o';
                i++;
                continue;
            }
            if (chars[i] == 'M') {
                chars[i] = 'P';
                i++;
                continue;
            }
            if (chars[i] == 'm') {
                chars[i] = 'p';
                i++;
                continue;
            }
            if (chars[i] == 'N') {
                chars[i] = 'Q';
                i++;
                continue;
            }
            if (chars[i] == 'n') {
                chars[i] = 'q';
                i++;
                continue;
            }
            if (chars[i] == 'O') {
                chars[i] = 'R';
                i++;
                continue;
            }
            if (chars[i] == 'o') {
                chars[i] = 'r';
                i++;
                continue;
            }
            if (chars[i] == 'P') {
                chars[i] = 'S';
                i++;
                continue;
            }
            if (chars[i] == 'p') {
                chars[i] = 's';
                i++;
                continue;
            }
            if (chars[i] == 'Q') {
                chars[i] = 'T';
                i++;
                continue;
            }
            if (chars[i] == 'q') {
                chars[i] = 't';
                i++;
                continue;
            }
            if (chars[i] == 'R') {
                chars[i] = 'U';
                i++;
                continue;
            }
            if (chars[i] == 'r') {
                chars[i] = 'u';
                i++;
                continue;
            }
            if (chars[i] == 'S') {
                chars[i] = 'V';
                i++;
                continue;
            }
            if (chars[i] == 's') {
                chars[i] = 'v';
                i++;
                continue;
            }
            if (chars[i] == 'T') {
                chars[i] = 'W';
                i++;
                continue;

            }
            if (chars[i] == 't') {
                chars[i] = 'w';
                i++;
                continue;

            }
            if (chars[i] == 'U') {
                chars[i] = 'X';
                i++;
                continue;
            }
            if (chars[i] == 'u') {
                chars[i] = 'x';
                i++;
                continue;
            }
            if (chars[i] == 'V') {
                chars[i] = 'Y';
                i++;
                continue;
            }
            if (chars[i] == 'v') {
                chars[i] = 'y';
                i++;
                continue;
            }
            if (chars[i] == 'W') {
                chars[i] = 'Z';
                i++;
                continue;
            }
            if (chars[i] == 'w') {
                chars[i] = 'z';
                i++;
                continue;
            }
            if (chars[i] == 'X') {
                chars[i] = 'A';
                i++;
                continue;
            }
            if (chars[i] == 'Y') {
                chars[i] = 'B';
                i++;
                continue;
            }
            if (chars[i] == 'y') {
                chars[i] = 'b';
                i++;
                continue;
            }
            if (chars[i] == 'Z') {
                chars[i] = 'C';
                i++;
                continue;
            }
            if (chars[i] == 'z') {
                chars[i] = 'c';
                i++;
                continue;
            }
            if (chars[i] == '1') {
                chars[i] = '4';
                i++;
                continue;
            }
            if (chars[i] == '2') {
                chars[i] = '5';
                i++;
                continue;
            }
            if (chars[i] == '3') {
                chars[i] = '6';
                i++;
                continue;
            }
            if (chars[i] == '4') {
                chars[i] = '7';
                i++;
                continue;
            }
            if (chars[i] == '5') {
                chars[i] = '8';
                i++;
                continue;
            }
            if (chars[i] == '6') {
                chars[i] = '9';
                i++;
                continue;
            }
            if (chars[i] == '7') {
                chars[i] = '1';
                i++;
                continue;
            }
            if (chars[i] == '8') {
                chars[i] = '2';
                i++;
                continue;
            }
            if (chars[i] == '9') {
                chars[i] = '3';
                i++;
                continue;
            }
            if (chars[i] == '?') {
                chars[i] = '&';
                i++;
                continue;
            }
            if (chars[i] == '!') {
                chars[i] = '<';
                i++;
                continue;
            }
            if (chars[i] == '.') {
                chars[i] = '=';
                i++;
                continue;
            }
            if (chars[i] == '+') {
                chars[i] = '(';
                i++;
                continue;
            }
            if (chars[i] == '-') {
                chars[i] = ')';
                i++;
                continue;
            }
            if (chars[i] == '=') {
                chars[i] = '/';
                i++;
                continue;
            }
            if (chars[i] == '$') {
                chars[i] = '^';
                i++;
                continue;
            }
            if (chars[i] == '(') {
                chars[i] = '|';
                i++;
                continue;
            }
            if (chars[i] == ')') {
                chars[i] = ':';
                i++;
                continue;
            }
            if (chars[i] == ',') {
                chars[i] = '@';
                i++;
                continue;
            }
            if (chars[i] == ' ') {
                chars[i] = '#';
                i++;
                continue;
            }
            if (chars[i] == ':') {
                chars[i] = '?';
                i++;
                continue;
            }
            if (chars[i] == '%') {
                chars[i] = ',';
                i++;
                continue;
            }
            if (chars[i] == '@') {
                chars[i] = '$';
                i++;
                continue;
            }
            if (chars[i] == '\'') {
                chars[i] = '!';
                i++;
            } else throw new Menu.InvalidEncryptionException();
        }
        level3(String.valueOf(chars));
    }

    private static void level3(String x) throws Menu.InvalidEncryptionException {
        String positionAdjustment1 = "{";
        String positionAdjustment2 = "[";
        String positionAdjustment3 = "]";
        String start = UUID.randomUUID().toString().replaceAll("-", "");
        String mid = UUID.randomUUID().toString().replaceAll("-", "");
        String end = UUID.randomUUID().toString().replaceAll("-", "");
        int middle = x.length() / 2;
        x = positionAdjustment1 + x;
        x = x + positionAdjustment3;
        StringBuilder builder = new StringBuilder(x);
        StringBuilder x2 = builder.insert(middle, positionAdjustment2);
        x = x2.toString();

        if (x.startsWith(positionAdjustment1)) {
            x = start + x;
        }
        if (x.contains(positionAdjustment2)) {
            while (mid.length() != 4) {
                mid = mid.substring(0, mid.length() - 1);
            }
            x = x.replace(positionAdjustment2, positionAdjustment2 + mid);
        }
        if (x.endsWith(positionAdjustment3)) {
            x = x + end;
        } else throw new Menu.InvalidEncryptionException();
        level4(x);
    }

    private static void level4(String x) throws Menu.InvalidEncryptionException {
        String junk = UUID.randomUUID().toString().replaceAll("-", "");
        x = String.format("%040x", new BigInteger(1, x.getBytes(StandardCharsets.UTF_8)));
        if (junk.length() != 10) {
            while (junk.length() != 10) {
                junk = junk.substring(0, junk.length() - 1);
            }
        } else throw new Menu.InvalidEncryptionException();
        x += junk;
        level5(x);
    }

    private static void level5(String x) throws Menu.InvalidEncryptionException {
        char[] watermark = x.toCharArray();
        watermark[2] = '6';
        watermark[7] = 'c';
        watermark[watermark.length - 3] = '4';
        watermark[watermark.length - 8] = '9';

        if (watermark[2] == '6' && watermark[7] == 'c' && watermark[watermark.length - 3] == '4' && watermark[watermark.length - 8] == '9') {
            System.out.println(String.valueOf(watermark));
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
        else throw new Menu.InvalidEncryptionException();
    }
}