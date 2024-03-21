class newthread1 extends Thread

{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
            if(i%2==0)
        System.out.println(i);
        Thread.sleep(300);
        }catch(Exception e){}
    }
}
}
class newthread2 extends Thread

{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            try{
        if(i%2!=0)
        System.out.println(i);
        Thread.sleep((300));

        }catch(Exception e){}
    }
}
}
public class Even_Odd {
    public static void main(String args[])
    {
        Thread th =Thread.currentThread();
        System.out.println("thread name is=="+th.getName());
        newthread1 n1=new newthread1();
        Thread th1=new Thread(n1,"newthread1");
        th1.start();
        newthread2 n2=new newthread2();
        Thread th2=new Thread(n2,"newthread2");
        th2.start();


    }
    
}
