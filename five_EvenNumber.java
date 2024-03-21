
class oddExample extends Exception
{
    
    oddExample(int i,int count)
    {
        System.out.println("number is odd "+ i);

        count++;
    }
}
public class five_EvenNumber {
    
     public static void main(String[] args) {
        int count=0;
        int a[]=new int[args.length];
        
            try{
                for(int i=0;i<args.length;i++)
        {
                a[i]=Integer.parseInt(args[i]);
                if(a[i]%2 !=0){count++;
                throw new oddExample(i,count);}
        }
            }

           
        
        catch(Exception e)
        {
            System.out.println("Error"+e.getMessage());
        }
        System.out.println("Count is"+count);

     }
}
