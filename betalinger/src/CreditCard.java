
public class CreditCard implements Payment{
    private String cardNumber;
    private String expiryDate;

    //constructor
    public CreditCard(String cardNumber, String expiryDate) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
    }
    @Override
    public String toString() {
        return "cardNumber is:" + cardNumber +" \n and ExpiryDate " + expiryDate;

    }
    @Override
    public String pay(double amount) {
        return "Credit card "+ cardNumber +"\nhas payed " + amount;
    }
}


