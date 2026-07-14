package exceptionhandling;

public class Mobile {
    static void mobileNumber(String number) throws InvalidMobileNumberException{
//        if(10 > number.length() || 10 < number.length()){
        if(number.length() != 10) throw new InvalidMobileNumberException("Number is not valid.");
        System.out.println("Number is valid");
    }

    public static void main(String[] args){
        try{
            mobileNumber("123456");
        }catch (InvalidMobileNumberException e) {
            System.out.println(e.getMessage());
        }
    }
}
