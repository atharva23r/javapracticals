public class throwsdemo {
    static void test() throws Exception{
        throw new Exception("exception passed using throws");

    }
    public static void main(String[] args){
        try {
            test();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
