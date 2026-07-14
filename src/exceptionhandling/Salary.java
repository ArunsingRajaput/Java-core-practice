package exceptionhandling;

public class Salary {
    public static void main(String[] args){
        int salary = 10000;
        try{
            if(salary < 15000){
                throw new ArithmeticException("Salary Below MInimum");
            }
            System.out.println("good salary");
        } catch (ArithmeticException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Progeam Ends.");
        }
    }
}
