public class Main {
    public static void main (String[] args){

   CreditCard card1= new CreditCard("1234567891234567","123");
   Cash cash1 = new Cash(50);
   MobilPay phonenumber1 = new MobilPay("20520874");




   System.out.println(card1);
   System.out.println(cash1);
   System.out.println(phonenumber1);

        System.out.println(card1.pay( 100));
        System.out.println(cash1.pay( 150));
        System.out.println(phonenumber1.pay( 200));

    }
}