public class MobilPay implements Payment {
    private String phoneNumber ;

    public MobilPay (String phoneNumber) {
        this.phoneNumber = phoneNumber ;
    }

    @Override
    public String toString() {
        return "Number is" + phoneNumber;
    }

    @Override
    public String pay(double amount) {
        return "the number" + phoneNumber +" has payed" + amount;
    }
}

