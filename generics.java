public class generics {
    public static void main(String[] args) {
        box<Integer> a=new box<>(100);
        box<String> b=new box<>("atharva");
        System.out.println(a.get());
        System.out.println(b.get());
        demo d=new demo();
        d.display(10);
        d.display("atharva");
        
    }
}
class box <T>{
    T value;

    box(T v){
        this.value=v;
    }

    T get(){
        return value;
    }
}

class demo{
    public <T> void display(T value){
        System.out.println(value);

    }
}
