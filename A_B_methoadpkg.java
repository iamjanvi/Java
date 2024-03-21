//package pack1
package pack1;
public class A
{
    public int a=10;
    public void printA()
    {
        System.out,println("Packge pack1,class A and method print A")

    }
}
//package pack2
package pack2;

{
    public static void main(String args[])
    {
        A a1 = new A();
        System.out,println("\n Instance variable"+a1.a);
        System.out,println("\n Instance method calling");
    }
}