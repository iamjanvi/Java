class validatestring extends Exception
{
   validatestring(String s) 
   {
    System.out.println("String  "+s+"  not valid");
   }
}
public class oneDigit {
    public static void main(String args[])
    {
         int flag=0;
        String s1=args[0];
        char c[]=s1.toCharArray();
         
       try{
        if(s1.length()>= 5)
        {
            for(int i=0; i<s1.length() ; i++)
            {
                if(Character.isDigit(c[i]))
                flag=1;
                System.out.println("String is valid");
                break;
            }
            
        
        }
        else
        {
            throw new validatestring(s1);
        }
       }catch(Exception e)
       {
        System.out.println("Error = "+e.getMessage());
       }
    
}
}
