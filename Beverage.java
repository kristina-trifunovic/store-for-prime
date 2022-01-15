import java.util.Date;

public class Beverage extends Product{
    private Date expirationDate;
    Cashier cashier;
    Date purchaseDate;
   
    Beverage(String name, String brand, double price, Date expirationDate) {
        super(name, brand, price);
        this.expirationDate = expirationDate;
    }

    // all functions used in discount() are implemented in Product class
    @Override
    public void discount() {
        purchaseDate = cashier.getPurchaseDate();
        if(difference(purchaseDate, expirationDate) <= 5) {
            set10Discount();
        }
        if(expirationDate.equals(cashier.getPurchaseDate())) {
            set50Discount();
        }
    }

    public Date getExpirationDate() {   return expirationDate;    }
}
