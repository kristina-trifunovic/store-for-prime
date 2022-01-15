import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.Calendar;

public class Product {
    private String name;
    private String brand;
    private double price;
    private double discount = 0;
    private String discountPercentage;

    Product(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public void discount() {}

    public long difference(Date first, Date second)  {
        long diff_in_milis = second.getTime() - first.getTime();
        long diff = TimeUnit.MILLISECONDS.toDays(diff_in_milis);
        return diff;
    }

    public void set10Discount() {
        discount += price / 10;
        discountPercentage = "10%";
    }

    public void set50Discount() {
        discount += price / 2;
        discountPercentage = "50%";
    }

    public void set5Discount() {
        discount += price / 0.05;
        discountPercentage = "5%";
    }

    public boolean isWeekend(Date date) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int day = cal.get(Calendar.DAY_OF_WEEK);
        return day == Calendar.SATURDAY || day == Calendar.SUNDAY;
    }

    public String getName() {  return name;    }
    public String getBrand() {   return brand;    }
    public double getPrice() {   return price;    }
    public double getDiscount() {   return discount;   }
    public String getDiscountPercentage() {   return discountPercentage;  }
}
