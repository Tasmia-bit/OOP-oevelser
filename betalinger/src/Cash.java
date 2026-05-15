public class Cash implements Payment{
    private double amountInHands;

    //cunstructore
    public Cash(double amountInHands) {
        this.amountInHands = amountInHands;
    }
    @Override
    public String toString() {
        return "amount of cash" + amountInHands;
    }

    @Override
    public String pay(double amount) {
        return "Cash amount" + "has payed" + amount;
    }
}


