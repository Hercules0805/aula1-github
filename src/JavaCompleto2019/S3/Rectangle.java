package JavaCompleto2019.S3;

public class Rectangle {
    private double width;
    private double height;

    public double area(){
        return width * height;
    }

    public double perimeter(){
        return 2 * (width+height);
    }

    public double diagonal(){
        return Math.round(Math.sqrt(2*area()));
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString(){
        return "Area: " + area() +"\n"
                + "Perimeter : " + perimeter() +"\n"
                + "Diagonal: " + diagonal();
    }
}
