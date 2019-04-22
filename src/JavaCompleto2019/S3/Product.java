package JavaCompleto2019.S3;

public class Product {
    private String name;
    private double price;
    private int quantity;



     public double totalValueStok(){

        return price * quantity;

     }

     public void addProducts(int quantity){
         this.quantity += quantity;

     }


    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return name
                + ", $ "
                + price
                + ", "
                + quantity
                + " Units, Total: $ "
                + totalValueStok();



    }
}
