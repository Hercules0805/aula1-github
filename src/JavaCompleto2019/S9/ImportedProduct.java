package JavaCompleto2019.S9;

public class ImportedProduct extends Product {
    protected double customFee;

    public ImportedProduct(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }


    @Override
    public String priceTag() {
        return super.getName() + " \n"
                + "Valor sem a taxa: $"
                //+ String.format("%2.f",super.price) + "\n"
                +super.price + "\n"
                + "Valor Total: $"
                + String.format("%.2f",totalPrice())+ "\n"
                //+ totalPrice() +"\n"
                + "(Customs fee: $ " + String.format("%.2f",customFee) + ")"
                + "\n"+"-----------";
    }

//    @Override
//    public String priceTag() {
//        return getName()
//                + " $ "
//                + String.format("%.2f", totalPrice())
//                + " (Customs fee: $ "
//                + String.format("%.2f", customFee)
//                + ")";
//    }
//
    public double totalPrice(){
        return super.getPrice() + customFee;
    }
}
