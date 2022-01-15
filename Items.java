public class Items {
    private int quantity;
    private Product product;

    Items(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }

    public Product getProduct() {  return product;   }
    public int getQuantity() {  return quantity;   }

}
