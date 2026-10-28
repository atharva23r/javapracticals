public class interfacecode {
    public static void main(String [] args){
        Person p=new Person();
        p.sayHello();
        p.sayBye();
    }
    
}
interface greeting{
    void sayHello();
    default void sayBye(){
        System.out.println("goodbye");
    }
}
class Person implements greeting{
    public void sayHello(){
        System.out.println("hello");
    }
}
