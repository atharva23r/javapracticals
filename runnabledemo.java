public class runnabledemo {
    public static void main(String [] args){
        Thread m=new Thread(new MyTask(),"Thread-a");
        Thread v=new Thread(new MyTask(),"Thread-b");
        m.start();
        v.start();

    }

}
class MyTask implements Runnable{
    public void run(){
        for(int i=0;i<=3;i++){
            System.out.println(Thread.currentThread().getName()+ ": "+i);
        }
    }

}
