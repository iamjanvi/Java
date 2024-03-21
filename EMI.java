import java.util.Scanner;

public class EMI {
public static void main(String[] args) {
     double amount , rate,total;
     Scanner sc=new Scanner(System.in);
     
     System.out.println("Enter the loan amount: ");
     amount=sc.nextInt();
     System.out.println("Enter the rate:");
     rate=sc.nextInt();
     total=amount*rate/(100*60);
     System.out.println("EMI = "+total);
}
}
