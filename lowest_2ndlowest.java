public class lowest_2ndlowest {

    public static void main(String[] args) {
        int a[]= new int[args.length];
        try
        {
            for(int i=0;i<args.length;i++)
            {
                a[i]=Integer.parseInt(args[i]);
            }
            for(int i=0;i<args.length;i++)
            {
                for( int j=i+1;j<args.length;j++)
                {
                    if(a[i]>a[j])
                    {
                        int temp=a[i];
                        a[i]=a[j];
                        a[j]=temp;
                    }
                }
            }
            System.out.println("Lowest number = "+a[0]);
            System.out.println("Second lowest number = "+a[1]);
        }

        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic exception occur");
        }

        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Array index outof BoundException occur");
        }

        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
