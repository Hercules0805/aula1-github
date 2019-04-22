package JavaCompleto2019.S3;

public class Employee {
    private String name;
    private double grossSalary;
    private double tax;

    public void setName(String name) {
        this.name = name;
    }

    public void setGrossSalary(double grossSalary) {
        this.grossSalary = grossSalary;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public double netSalary(){
        return grossSalary - 1000;
    }

    public void increaseSalary(double percent){
        grossSalary = grossSalary +(grossSalary * (percent/100));
    }

    public String toString(){
        return "Employee: "
                + name
                + ", $ "
                + netSalary();
    }


}
