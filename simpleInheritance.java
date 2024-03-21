class A
{
    public void display()
    {
        System.out.println("one");
    }
}
class B extends A
{
    public void display1()
    {
        System.out.println("two");
    }
}

public class simpleInheritance {
  public static void main(String args[])
    {
        B obj = new B();
        obj.display();
        obj.display1();
}


}
