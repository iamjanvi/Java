class one
{
    public void display()
    {
        System.out.println("one");
    }
}
class two extends one
{
    public void display1()
    {
        System.out.println("two");
    }
}
class three extends one
{
    public void display2()
    {
        System.out.println("three");
    }
}
class hierarchical
{
    public static void main(String args[])
    {
        two obj = new two();
        obj.display();
        obj.display1();
        three obj1 = new three();
        obj1.display2();
}
}