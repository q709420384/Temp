class RTriangle implements IShape {
    double  a;
    double  b;
    RTriangle(double a, double b){
        this.a =a;
        this.b =b;
    }
    public double getArea() {
        return (a*b/2);
    }
    public double getPerimeter() {
        return (a+b+Math.sqrt(a*a+b*b));
    }
}

