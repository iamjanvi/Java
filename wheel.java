abstract class Vehicle{
    abstract public void numWheels();
}
class car extends Vehicle {
    public void numWheels()
    {
        System.out.println("cars has four wheels");
    }
}
class truck extends Vehicle {
    public void numWheels()
    {
        System.out.println("Truck has six wheels");
    }
}
public class wheel {
    public static void main(String[] args) {
        car c=new car();
        c.numWheels();
        truck t=new truck();
        t.numWheels();
    }
}































