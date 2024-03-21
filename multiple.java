interface A
{
    public void display();
}
interface B
{
    public void display1();
}
class multiple1 implements A,B
{
    public void display()
    {
        System.out.println("Interface of A");
    }
    public void display1()
    {
        System.out.println("Interface of B");
    }
}
class C extends multiple1
{
    public void display2()
    {
        System.out.println("this is c");
    }
}


class  multiple
{
    public static void main(String args[])
    {
        C obj = new C();
        obj.display();
        obj.display1();
        obj.display2();
}
}