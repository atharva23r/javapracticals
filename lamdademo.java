public class lamdademo {
    public static void main(String [] args){
        add c= (a,b) ->a+b;
        System.out.println("add "+ c.sum(2,3));
    }
    
}
interface add{
    int sum(int a, int b);
}
