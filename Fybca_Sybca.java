class fythread extends Thread
{
 public void run()
{
 for(int i=1;i<=4;i++)
 {
    try
    {
        System.out.println("FYBCA");
        Thread.sleep(1000);
    }
    catch(InterruptedException e)
    {}
  }
 }
}    
class sythread extends Thread
{
    public void run()
 {
 for(int i=1;i<=6;i++)
  {
    System.out.println("SYBCA");
   }
 }
}
class Fybca_Sybca
{
 public static void main(String args[])
 {
    fythread fyt=new fythread();
    Thread fyth=new Thread(fyt,"first year Thread");
    System.out.println("Name of the thread = "+fyth.currentThread());
    fyth.setPriority(Thread.MAX_PRIORITY-3);
    sythread syt=new sythread();
    Thread syth=new Thread(syt,"Secound Year Thread");
    System.out.println("Name of the thread="+syth.currentThread());
    syth.setPriority(Thread.MIN_PRIORITY + 3);
    fyth.start();
    syth.start();
     try
     {
         fyth.join();
         syth.join();
     }catch(InterruptedException e)
     {}
   System.out.println("TYBCA");
}
}
