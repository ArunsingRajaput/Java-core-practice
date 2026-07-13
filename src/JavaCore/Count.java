package JavaCore;

public class Count {
    static int count =0;
    Count(){
        count++;
    }

    public static void main(String[] args){
        new Count();
        new Count();
        new Count();
        System.out.println("Onbect is : "+count);
    }
}
