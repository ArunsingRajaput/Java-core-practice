package strings;

public class StringAdvanced {
    public boolean compare(String a, String b) {
        return a.equals(b);
    }
    public String upper(String str) {
        return str.toUpperCase();
    }
    public String lower(String str) {
        return str.toLowerCase();
    }
    public int wordCount(String str) {
        String[] words = str.split(" ");
        return words.length;
    }

    public String removeSpaces(String str) {
        return str.replace(" ", "");
    }
    public boolean searchChar(String str, char ch) {
        return str.contains(String.valueOf(ch));
    }
}