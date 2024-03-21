class classA{
    public void show()
    {
        System.out.println("This is classA method");
    }
}
class classB extends classA
{
    public void show()
    {
        System.out.println("This is classB method");
    }
    public void print()
    {
   super.show();
    }
}
public class super1 {
    public static void main(String args[])
    {
        classB obj=new classB();
        obj.show();
        obj.print();

    }
    
    
}
