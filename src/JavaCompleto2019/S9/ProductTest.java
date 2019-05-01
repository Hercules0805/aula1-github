package JavaCompleto2019.S9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class ProductTest {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        SimpleDateFormat spf = new SimpleDateFormat("dd/MM/yyyy");

        //Teste dos Produtoss
        Product product = new Product("Notebook",1100);
        System.out.println(product.priceTag());

        Product product1 = new ImportedProduct("Tablet",260,20);
        System.out.println(product1.priceTag());

        Date date = spf.parse("25/06/2018");
        Product product2 = new UsedProduct("iPhone",400, date);
        System.out.println(product2.priceTag());

    }
}
