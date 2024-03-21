//class pack from package p
package p;
public class pack
{
    public int findmax(int a, int b, int c)
    {
        int max=((a>b)?((a>c)?a:c):((b>c)?b:c));
        return(max);
    }
}

class findmax_1
{
    public static void main (String args[])
    {
        pack p1 = new pack();
        int ans = p1.findmax(10,5,23);
        System.out.println("Answer is"+ans);
}
}
