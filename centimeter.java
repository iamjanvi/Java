class unitformatException extends Exception {
    unitformatException(String s)
    {
        super("Unit not valid"+s);
    }



      
    
}
 public class  centimeter
{
    public static void main(String[] args) {
        int no;
        String u;
        try{
            no=Integer.parseInt((args[0]));
            u=args[1];
            if(u.equals("centimeter")||u.equals("meter"))
            {
                if(u.equals(("centimeter")))
                {int m=no/100;
                    System.out.println((no +"centimeter ="+m+"meter"));
                }
                else
                {
                    int cm=no*100;
                    System.out.println((no +"meter ="+cm+"centimete"));
                }
            }
            else
            throw new  unitformatException(u);
        }
        catch(NumberFormatException e)
        {
            System.out.println("Number not valid");
        }
        catch(ArithmeticException e)
        {
            System.out.println("Arithmetic Exceptionnull");
        }
        catch(Exception e)
        {
            System.out.println("error=" + e.getMessage());
        }

    }
}
