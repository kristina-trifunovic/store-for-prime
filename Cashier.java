import java.util.ArrayList;
import java.util.Date;


public class Cashier {
    private ArrayList<Items> cart = new ArrayList<>();
    private Date purchaseDate;
    private double discount;
    private String discountPercentage;

    

    Cashier(ArrayList<Items> cart, Date purchaseDate) {
        this.cart = cart;
        this.purchaseDate = purchaseDate;
    }

    public void printReceipt() {
        int receipt = 0;
        double discSum = 0;
        System.out.println("Date: " + purchaseDate + "\n");
        System.out.println("--Products--" + "\n");

        for(Items item : cart) {
            System.out.println("Name: " + item.getProduct().getName() + " ");
            System.out.println("Price: " + item.getProduct().getPrice() + "\n");
            double wholePrice = item.getQuantity() * item.getProduct().getPrice();
            receipt += wholePrice;
            System.out.println(item.getQuantity() + " x $" + item.getProduct().getPrice() + " = $" + wholePrice + "\n");
            System.out.println("#discount " + item.getProduct().getDiscountPercentage() + "% $" + item.getProduct().getDiscount() + "\n");
            double disc = item.getProduct().getDiscount();
            discSum += disc;
        }
        
        System.out.println("-----------------------------------------------------------------------------------\n");
        System.out.println("SUBTOTAL: $" + receipt + "\n");
        System.out.println("DISCOUNT: -$" + discSum + "");
        double total = receipt - discSum;
        System.out.println("TOTAL: $" + total);
    }

    public ArrayList<Items> getItems() {  return cart;    }
    public Date getPurchaseDate() {  return purchaseDate;    }
    public double getDiscount() {  return discount;    }
    public String getDiscountPercentage() {   return discountPercentage;    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public void setDiscountPercentage(String discountPercentage) {
        this.discountPercentage = discountPercentage;
    }
}
