class Main {

    /**
      It prints the text "It works correctly" to the standard output */
    public static void main(String[] args) {
        String textWithWhitespaces = "\t text with whitespaces   !\n  \t";
        System.out.println(textWithWhitespaces);
        String trimmedText = textWithWhitespaces.trim(); // "text with whitespaces   !"
        System.out.println(trimmedText);
    }
}