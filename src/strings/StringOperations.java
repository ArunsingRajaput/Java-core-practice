package strings;

public class StringOperations {
    public void printString(String str) {
        System.out.println("String : " + str);
    }

    public int length(String str) {
        return str.length();
    }

    public String reverse(String str) {
        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }
        return rev;
    }

    public boolean isPalindrome(String str) {
        String rev = reverse(str);
        return str.equals(rev);
    }

    public int countVowels(String str) {
        int count = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++;
            }
        }
        return count;
    }
}