package JavaCompleto2019.S9;

public class OutsourceEmployee extends Employee{

    private double addtionalCharge;

    public OutsourceEmployee(){
        super();
    }

    public OutsourceEmployee(String name, int hours, double valuePerHour, double addtionalCharge) {
        super(name, hours, valuePerHour);
        this.addtionalCharge = addtionalCharge;
    }

    @Override
    public double payment() {
        double total = super.payment();
        return total + addtionalCharge * 1.10;
    }
}
