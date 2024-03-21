class complex
{
    int real,image;
    complex()
    {}
    complex(int real1,int image1)
    {
        real=real1;
        image=image1;
    }
 static complex add(complex c1,complex  c2)
 {
     
    complex c= new complex();
    c.real=c1.real+c2.real;
    c.image=c1.image + c2.image;
    return c;

 }

 static complex sub(complex c1,complex  c2)
 {
     
    complex c= new complex();
    c.real=c1.real-c2.real;
    c.image=c1.image - c2.image;
    return c;

 }

 static complex mul(complex c1,complex  c2)
 {
     
    complex c= new complex();
    c.real=c1.real*c2.real;
    c.image=c1.image * c2.image;
    return c;

 }
 public static void main(String args[])
 {
   complex c1=new complex(1,2);
  
   complex c2=new complex(3,4);
    complex sum=new complex();
    sum=add(c1,c2);

    complex minus=new complex();
    minus=sub(c1,c2);

    complex multi=new complex();
    multi=mul(c1,c2);

    System.out.println("addition = "+sum.real+" "+"+"+" "+sum.image+"i");
    System.out.println("subtraction = "+minus.real+" "+"+"+" "+minus.image+"i");
    System.out.println("multiplication = "+multi.real+" "+"+"+" "+multi.image+"i");
    
 }

 }  

