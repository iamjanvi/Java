public class reverse_pos_palin_uprLwr {
    public static void main(String[] args) {
     char c[]=args[0].toCharArray();
     System.out.println("\n Display each Character on seperate line in Reverse order");
     for(int i=c.length-1;i>=0;i--)
      System.out.println(c[i]);
 
         System.out.println("\n Count total number of character and display each character position ");
         System.out.println("\n Total number of characters are "+c.length);
         for(int i=0;i<c.length;i++)
         System.out.println(c[i]+"Character is at "+i+"position");
 
         System.out.println("\n Idenfying the string is palindrom or not");
         StringBuffer S1 =new StringBuffer(args[0]);
         StringBuffer S2 = S1.reverse();
         if (S1.equals(S2)==true)
         System.out.println("\nString is palindrom");
         else 
         System.out.println("\nstring is not palindrom");
 
         System.out.println("\ntotal numnber of uppercase and lowercase characters");
         int up=0,lw=0;
         for(int i=0;i<c.length;i++)
         {
             if(Character.isUpperCase(c[i]))
             up++;
             else
             lw++;
 
         }
         System.out.println("n Uppercase chracter are :"+up);
         System.out.println("n lowercase chracter are :"+lw);
 
 
    }
 }
 