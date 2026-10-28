public class exceptionhandling {
    public static void main(String [] args){
        try {
            int result =10/0;
            System.out.println(result);
            
        }
        catch (Exception e) {
            System.out.println("error:"+e.getMessage());

        }
        finally{
            System.out.println("finally block always runs");
        }
    }
}
