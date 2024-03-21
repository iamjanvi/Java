class A
{
    public void display()
    {
        System.out.println("one");
    }
}
interface B
{
    public void display1();
}
interface C
{
    public void display2();
}
class D extends A implements B,C
{
    public void display3()
    {
        System.out.println("four");
    }
    public void display1()
    {
        System.out.println("two");
    }
    public void display2()
    {
        System.out.println("three");
    }
}
class hybrid
{
    public static void main(String args[])
    {
        D obj = new D();
        obj.display();
        obj.display1();
        obj.display2();
        obj.display3();
    }
}