import java.util.Scanner;
class Addmatrices{

    public static void main(String args[])
    {
      int m,n,i,j;
      Scanner in=new Scanner(System.in);
      System.out.println("Enter row size :");
      m=in.nextInt();
      System.out.println("Enter column size  :");
      n=in.nextInt();
      int first[][]=new int[m][n];
      int second[][]=new int[m][n];
      int third[][]=new int[m][n];
      System.out.println("Enter First matrix :");
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++){
            first[i][j]=in.nextInt();
        }
      }
      System.out.println("Enter second matrix :");
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++){
            second[i][j]=in.nextInt();
        }
      }
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++){
            third[i][j]=first[i][j] +second[i][j];
        }
      }

      System.out.println("Sum of the matrices:");
      for(i=0;i<m;i++)
      {
        for(j=0;j<n;j++){
            System.out.print(third[i][j] + "\t");
        }
        System.out.println();
      }
    }
}