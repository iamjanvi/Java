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
class three extends two
{
    public void display2()
    {
        System.out.println("three");
    }
}
class multilevel
{
    public static void main(String args[])
    {
        three obj = new three();
        obj.display();
        obj.display1();
        obj.display2();
}
}

