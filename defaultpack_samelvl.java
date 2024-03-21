//package p1
package p1;
public class c1
{
    public void printc1()
    {
        System.out.println("Package p1 andd class c1");
    }
}


//package p2
package p2;
public class c2
{
    public void printc2()
    {
        System.out.println("Package p2 andd class c2");
    }
    
}


//package p3
package p3;
public class c3
{
    public void printc3()
    {
        System.out.println("Package p3 andd class c3");
    }
    
}


//package access
package access;

public class defaultpack_samelvl
{
    public static void main(String args[])
    {
        c1 obj1 = new c1();
        c2 obj2 = new c2();
        c3 obj3 = new c3();
        obj1.printc1();
        obj2.printc2();
        obj3.printc3();
    }
}
