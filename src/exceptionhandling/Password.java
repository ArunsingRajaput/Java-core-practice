package exceptionhandling;

public class Password {
    public static void main(String[] args){
        try{
            String  password = "arun123";

            if(password.length() < 8) {
                throw new ArithmeticException("Password Too Short.");
            }
        System.out.println("Password is Valid.");
        } catch(ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program Ends.");
        }
    }
}
