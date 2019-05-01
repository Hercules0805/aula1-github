package JavaCompleto2019.S9;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product {
    SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufactureDate;

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag() {
        return getName()
                + " (used) $ "
                + String.format("%.2f",getPrice())
                //+ super.price
                + " (Manufacture date: "
                +spf.format(manufactureDate) + ")"
                + "\n"+"-----------";
    }

//    @Override
//    public String priceTag() {
//        return getName()
//                + " (used) $ "
//                + String.format("%.2f", getPrice())
//                + " (Manufacture date: "
//                + spf.format(manufactureDate)
//                + ")";
//    }
}
