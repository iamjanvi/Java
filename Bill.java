public class Bill {
    public static void main(String[] args) {
        double total_price=0;
        System.out.println("1.seat cover..");
        System.out.println("2.to steering ..");
        System.out.println("3.to car lighteening..");
        System.out.println("4.for air purifiers..");
        System.out.println("5.all other items.");

        int ch=Integer.parseInt(args[0]);
        int quantity=Integer.parseInt(args[1]);
        switch(ch)
        {
            case 1: total_price=200*quantity +(2*200/100);
            break;

            case 2: total_price=300*quantity +(3*300/100);
            break;

            case 3: total_price=100*quantity +(4*100/100);
            break;

            case 4: total_price=500*quantity +(2.5*500/100);
            break;

            case 5: total_price=200*quantity +(1.2*200/100);
            break;

            default: System.out.println("Invalid choice..");
        }
        System.out.println("price = "+total_price);
        
    }

}
