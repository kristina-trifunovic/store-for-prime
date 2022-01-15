
public class Clothing extends Product{
    private String size;
    private String color;
    private Cashier cashier;
    
    Clothing(String name, String brand, double price, String size, String color) {
        super(name, brand, price);
        this.size = size;
        this.color = color;
    }

    // all functions used in discount() are implemented in Product class
    @Override
    public void discount() {
        if(!isWeekend(cashier.getPurchaseDate())) {
            set10Discount();
        }
    }

    public String getName() {  return super.getName();    }

    public String getSize() {   return size;    }
    public String getColor() {   return color;    }
}
