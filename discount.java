class discount
{
    double amount,discount=0,net=0;
    discount(double amount1)
    {
        
      amount=amount1;
        if(amount<1000)
        discount=10 * amount/100;
        else
        {if(amount>=1000 && amount<1500)
            discount=12 * amount/100;
            else if(amount>=1500)
            discount=15 * amount/100;
        }
    }
    public static void main(String args[])
    {
        discount d=new discount(2000);
        System.out.println("Sale value = "+d.amount);
        System.out.println("discount = "+ d.discount);
         d.net =d.amount-d.discount;
        System.out.println("Net-amount = "+ d.net);
    }
}