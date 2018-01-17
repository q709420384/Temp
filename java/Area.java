import java.text.DecimalFormat;
import java.util.Scanner;

abstract class shape {
    public abstract double getArea();
    public abstract double getPerimeter();
}
class RPentagon extends shape{
    private double side;
    public RPentagon(double side) {
        this.side = side;
    }
    @Override
    public double getArea() {
        //return 5*side*side/(4*Math.tan(36.0/180*Math.PI));
        return 0.25*side*side*Math.sqrt(25+10*Math.sqrt(5));
    }
    @Override
    public double getPerimeter() {
        return side*5;
    }
}
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        DecimalFormat decimalFormat= new DecimalFormat("#.####");
        double a=in.nextDouble();
        RPentagon rPentagon= new RPentagon(a);
        System.out.println(decimalFormat.format(rPentagon.getArea()));
        System.out.println(decimalFormat.format(rPentagon.getPerimeter()));
        in.close();
    }
}
