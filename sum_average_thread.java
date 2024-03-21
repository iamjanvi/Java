class thread1 extends Thread
{
    int sum1=0,i;
    public void run()
    {
        for(i=1;i<=10;i++)
        {
            try{
                sum1=sum1+i;
                //Thread.sleep(500);
                
            }catch (Exception e)
            {}
        }
        System.out.println("Sum of 1 to 10 is "+sum1);
                System.out.println("Average of 1 to 10 is "+sum1/10);
    }
}
class thread2 extends Thread
{
    int sum2=0,i;
    public void run()
    {
        for(i=11;i<=20;i++)
        {
            try{
                sum2=sum2+i;
               //Thread.sleep(500);
            }catch (Exception e)
            {}
        }
        System.out.println("Sum of 11 to 20 is "+sum2);
        System.out.println("Average of 11 to 20 is "+sum2/10);
    }
}

public class sum_average_thread {

    public static void main(String[] args) {
        thread1 t1=new thread1();
        thread2 t2 = new thread2();
        Thread th1=new Thread(t1);
        Thread th2 = new Thread(t2);

        t1.start();
        t2.start();

        try{
            t1.join();
            t2.join();
        }catch (Exception e)
    {}

    int total=t1.sum1+t2.sum2;

    System.out.println("************************");
    System.out.println("Final sum ="+total);
    System.out.println("************************");
    System.out.println("Average ="+total/2);
    System.out.println("*************************");
    System.out.println("Task Completed");
    }
}
