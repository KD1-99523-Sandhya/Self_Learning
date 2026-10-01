package Question_5;

public class TextAnalyzer {
    private String text;

    public TextAnalyzer() {
        this.text = "";
    }

    public TextAnalyzer(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void analyze() {
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int spaces = 0;
        int specialChars = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (lowerCh == 'a' || lowerCh == 'e' || lowerCh == 'i' || lowerCh == 'o' || lowerCh == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(ch)) {
                digits++;
            } else if (Character.isWhitespace(ch)) {
                spaces++;
            } else {
                specialChars++;
            }
        }

        System.out.println("\nANALYSIS REPORT");
        System.out.println("Total Length     : " + text.length());
        System.out.println("Vowels Count     : " + vowels);
        System.out.println("Consonants Count : " + consonants);
        System.out.println("Digits Count     : " + digits);
        System.out.println("Spaces Count     : " + spaces);
        System.out.println("Special Chars    : " + specialChars);
    }
}
