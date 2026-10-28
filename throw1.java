public class throw1 {
    static void checkage(int age ){
        if(age <18){
            throw new ArithmeticException("Not eligible to vote");
        }
        System.out.println("eligible to vote");
        
    }
    public static void main(String [] args){
        try {
            checkage(19);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
