class area{
    double area1(int x)
    {
        return x*x;
    }
    double area1(int x, int y)
    {
        return x*y;
    }
}
public class areaByOverloading {
public static void main(String[] args) {
     int x,y;
     x=Integer.parseInt(args[0]);
     y=Integer.parseInt(args[1]);
     area  obj=new area();
     System.out.println("Area of square : "+obj.area1(x));
     System.out.println("Area of rectangle : "+obj.area1(x,y));
}
}
