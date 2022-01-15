import java.util.Date;

public class Appliance extends Product{
    private String model;
    private Date productionDate;
    private int weight;
    private Cashier cashier;

    Appliance(String name, String brand, double price, String model, Date productionDate, int weight) {
        super(name, brand, price);
        this.model = model;
        this.productionDate = productionDate;
        this.weight = weight;
    }
    // all functions used in discount() are implemented in Product class
    @Override
    public void discount() {
        if(isWeekend(cashier.getPurchaseDate()) && this.getPrice() > 999) {
            set5Discount();
        }
    }

    public String getModel() {   return model;    }
    public Date getProductionDate() {   return productionDate;    }
    public int getWeight() {   return weight;    }
}
