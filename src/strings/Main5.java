package strings;

public class Main5 {

    public static void main(String[] args) {
        String str = "Java Programming";

        StringOperations op = new StringOperations();
        StringAdvanced adv = new StringAdvanced();
        op.printString(str);
        System.out.println("Length : " + op.length(str));
        System.out.println("Reverse : " + op.reverse(str));
        System.out.println("Palindrome : " + op.isPalindrome("madam"));
        System.out.println("Vowels : " + op.countVowels(str));
        System.out.println("Uppercase : " + adv.upper(str));
        System.out.println("Lowercase : " + adv.lower(str));
        System.out.println("Words : " + adv.wordCount(str));
        System.out.println("Without Spaces : " + adv.removeSpaces(str));
        System.out.println("Search 'a' : " + adv.searchChar(str,'a'));
    }
}