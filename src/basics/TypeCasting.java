package basics;

public class TypeCasting {
    public static void main(String[] args) {

        int num = 100;
        double value = num;
        System.out.println("Widening Casting:");
        System.out.println("Integer Value : " + num);
        System.out.println("Double Value  : " + value);

        double price = 99.99;
        int amount = (int) price;
        System.out.println("\nNarrowing Casting:");
        System.out.println("Double Value : " + price);
        System.out.println("Integer Value : " + amount);

        char ch = 'A';
        int ascii = ch;
        System.out.println("\nCharacter to Integer:");
        System.out.println("Character : " + ch);
        System.out.println("ASCII Value : " + ascii);

        int number = 66;
        char character = (char) number;
        System.out.println("\nInteger to Character:");
        System.out.println("Integer : " + number);
        System.out.println("Character : " + character);

        String str = "123";
        int result = Integer.parseInt(str);
        System.out.println("\nString to Integer:");
        System.out.println("String : " + str);
        System.out.println("Integer : " + result);

        int age = 25;
        String text = String.valueOf(age);
        System.out.println("\nInteger to String:");
        System.out.println("Integer : " + age);
        System.out.println("String : " + text);
    }
}