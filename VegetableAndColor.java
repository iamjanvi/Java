abstract class vegetable
{
    public String color;
}
class potato extends vegetable
{
    public String toString()
    {
        color = "brown-skinned color";
        return "potato-->"+color;
    }
}
class Brinjal extends vegetable
{
    public String toString()
    {
        color = "purple color";
        return "Brinjal-->"+this.color;
    }
}
class tomato extends vegetable
{
    public String toString()
    {
        color = "red color";
        return "tomato-->"+this.color;
    }
}
class VegetableAndColor
{
    public static void main(String[]args)
    {
        potato p = new potato();
        Brinjal b = new Brinjal();
        tomato t = new tomato();
        System.out.println(p);
        System.out.println(b);
        System.out.println(t);
    }
}