
public class threaddemo {
    public static void main(String [] args){
        Mythread m=new Mythread();
        Mythread v=new Mythread();
        m.start();
        v.start();
    }
}
class Mythread extends Thread{
    public void run(){
        for(int i=1;i<3;i++){
            System.out.println("thread" +":"+i);
        }
    }
}
