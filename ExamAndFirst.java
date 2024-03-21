import java.util.Scanner;

interface Exam{

    boolean Pass(int mark);
}
interface Classify{
    String Division(int avg);
}
class Result implements Exam,Classify
{

    public boolean Pass(int marks)
    {
        if(marks>=35)
        return true;
        else
        return false;
    }
    public String Division(int avg)
    {
        if(avg>=60)
        return "First";
        else if(avg>=50)
        return "second";
        else
        return "no-division";
    }
}
public class ExamAndFirst {
    public static void main(String args[])
    {
        Result obj=new Result();
        Scanner sc=new Scanner(System.in);
        boolean pass;
        String div1;
        int marks=50,avg=60;
        
        pass=obj.Pass(marks);
        div1=obj.Division(avg);
        
        System.out.println("Enter marks");
        marks=sc.nextInt();
        System.out.println("Enter average");
        avg=sc.nextInt();

        System.out.println("student marks is "+marks);
        System.out.println("student avg is "+avg);
        System.out.println("student class is "+div1);
       
        if(obj.Pass(marks))
        System.out.println("Student is  pass and class is " +obj.Division(avg));
        else
        System.out.println("Student is  fail ");

    }
    
}
