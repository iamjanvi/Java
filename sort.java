/*sort the elements of one dimentional array.*/

public class sort{

    
    
    public static void main(String args[])
    {
    int i,j,n=0;
    int a[]=new int[args.length];
    int temp;
       // int a[]=new int[n];
         for(i=0;i<args.length;i++)
         {

            a[i]=Integer.parseInt(args[i]);
         }
         for(i=0;i<args.length;i++){
            for(j=i+1;j<args.length;j++)
            {
                if(a[i]>a[j])
                {
                  temp=a[i];
                  a[i]=a[j];
                  a[j]=temp; 
                }
            }
         }
           for(i=0;i<args.length;i++)
           {
            System.out.println(a[i]);
           }
         
    
}
}
