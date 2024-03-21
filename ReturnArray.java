public class ReturnArray {
    public static int[] display()
    {
        int a[]={1,2,3,4,5};
        return a;
        
    }
public static void main(String[] args) {
    
    int n[];
    n=display();
        for(int i=0;i<5;i++)
        {
            System.out.println(n[i]);
        }
 
}

}
