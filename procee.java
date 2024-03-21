interface numbers{
    public int Process(int x,int y);
}
class Sum implements numbers
{
    public int Process(int x,int y){
        int add;
        add=x + y;
       return add;
    }
}
class Average implements numbers{

    public int Process(int x,int y)
    {
        int avg;
        avg=(x+y)/2;
        return avg;
    }
}
public class procee {
    public static void main(String[] args) {
        Sum s=new Sum();
        System.out.println("Addition is : "+s.Process(3, 5));
        Average a=new Average();
        System.out.println("Average is : "+ a.Process(6, 2));
    }
    
}
