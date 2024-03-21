class RangeException extends Exception 
{ 
    RangeException(String message) {
    super(message); 
}
 }
    class Age_byException {    
    public static void main(String args[]) {    
    int a[]=new int[5];
    try {
    for(int j=0;j<5;j++) {
    a[j]=Integer.parseInt(args[j]);
    if(a[j]>100||a[j]<0)
    throw new
    RangeException("invalid Range"+a[j]); } }
    
    catch (NumberFormatException e) {
    System.out.println("Number Format Exception"); }
    catch(ArithmeticException e) 
    {
    System.out.println("arithmetic exception occur"); 
    }
    catch(ArrayIndexOutOfBoundsException e) 
    { 
        System.out.println("array index exception occur");
     }
    catch(Exception e) 
    {    
    System.out.println("Exception"+e.getMessage());
}
}
}
