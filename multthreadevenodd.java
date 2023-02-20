class Myrunnable1 implements Runnable{

    public void run(){
        for(int i=0;i<10;i++)
        {
            if(i%2==0)
            {System.out.println(""+i);}
        
try{
        Thread.sleep(1000);
    }
    catch(Exception e){
        e.printStackTrace();
    }

    }
    System.out.println("Even numbers are printed");
}
}
class MyThread extends Thread{
    public void run(){
        for(int i=0;i<10;i++)
        {
            if(i%2!=0)
            {System.out.println(""+i);}
            try{
                Thread.sleep(10500);
            }
            catch(Exception e){
                e.printStackTrace();
            }
        
            }
            System.out.println("Odd numbers are printed");
        }
        }
        
    

public class multthread3{
    public static void main(String args[]){
        
        Myrunnable1 runnable1=new Myrunnable1();
        Thread thread1 = new Thread(runnable1);
        MyThread thread2 = new MyThread();
        thread1.start();
        thread2.start();

    }
}

