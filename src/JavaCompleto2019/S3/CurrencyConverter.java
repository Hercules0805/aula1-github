package JavaCompleto2019.S3;

public class CurrencyConverter {

    public static double dolarConverter(double cotacao, double dolarQuantity){
        double valorReais = (dolarQuantity * cotacao);
        return valorReais += valorReais * 0.06;
    }
}
