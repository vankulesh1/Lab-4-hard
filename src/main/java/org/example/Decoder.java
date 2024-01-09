
public class Decoder {

    public static String VowelReplacementDecoding(String input) {
        return input.replaceAll("a", "1")
                .replaceAll("e", "2")
                .replaceAll("i", "3")
                .replaceAll("o", "4")
                .replaceAll("u", "5");
    }

    public static String ConsonantsReplaceDecoding(String input) {
        StringBuilder decoded = new StringBuilder();
        char[] chars = input.toCharArray();
        for (char c : chars) {
            if (isConsonant(c)) {
                decoded.append(getNextConsonant(c));
            } else {
                decoded.append(c);
            }
        }
        return decoded.toString();
    }

    private static boolean isConsonant(char c) {
        return "bcdfghjklmnpqrstvwxyzBCDFGHJKLMNPQRSTVWXYZ".indexOf(c) != -1;
    }

    private static char getNextConsonant(char c) {
        if (c == 'z') return 'b';
        if (c == 'Z') return 'B';
        return (char) (c + 1);
    }

    public static void main(String[] args) {
        String encryptedMessage1 = "t2st3ng";
        String encryptedMessage2 = "vetviph";

        String decodedMessage1 = VowelReplacementDecoding(encryptedMessage1);
        String decodedMessage2 = ConsonantsReplaceDecoding(encryptedMessage2);

        System.out.println("Encoded Message 1: " + encryptedMessage1);
        System.out.println("Decoded Message 1: " + decodedMessage1);

        System.out.println("Encoded Message 2: " + encryptedMessage2);
        System.out.println("Decoded Message 2: " + decodedMessage2);
    }

}