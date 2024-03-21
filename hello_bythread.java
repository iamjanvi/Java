class thread1 extends Thread
{
    int i;
    public void run()
    {
        
            for(int i=0;i<=10;i++)
            {
                try{
                   System.out.println("T1-->x"+i);
                   Thread.sleep(500);
                }catch(Exception e )
                {}
            } 
       }
}

class thread2 extends Thread
{
    int i;
    public void run()
    {
        
            for(int i=0;i<=10;i++)
            {
                try{
                   System.out.println("T2-->x"+i);
                   Thread.sleep(500);
                }catch(Exception e )
                {}
            } 
       }
}
class thread3 extends Thread
{
    int i;
    public void run()
    {
        
            for(int i=0;i<=10;i++)
            {
                try{
                   System.out.println("T3-->x"+i);
                   Thread.sleep(500);
                }catch(Exception e )
                {}
            } 
       }
}
class thread4 extends Thread
{
    int i;
    public void run()
    {
        
            for(int i=0;i<=10;i++)
            {
                try{
                   System.out.println("T4-->x"+i);
                   Thread.sleep(500);
                }catch(Exception e )
                {}
            } 
       }
}
class thread5 extends Thread
{
    int i;
    public void run()
    {
        
            for(int i=0;i<=10;i++)
            {
                try{
                   System.out.println("T5-->x"+i);
                   Thread.sleep(500);
                }catch(Exception e )
                {}
            } 
       }
}
public class hello_bythread {
public static void main(String[] args) {
    thread1 t1=new thread1();
    thread2 t2 = new thread2();
    thread3 t3 = new thread3();
    thread4 t4 = new thread4();
    thread5 t5 = new thread5();

    Thread th1=new Thread(t1);
    Thread th2=new Thread(t2);
    Thread th3=new Thread(t3);
    Thread th4=new Thread(t4);
    Thread th5=new Thread(t5);

    t1.start();
    t2.start();
    t3.start();
    t4.start();
    t5.start();

    try{
        t1.join();
        t2.join();
        t3.join();
        t4.join();
        t5.join();
    }catch ( Exception e)
    {}

    System.out.println("Hello....");
}
}
