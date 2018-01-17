import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		double[] d=new double[6];
		for(int i=0;i<6;i++) d[i]=in.nextDouble();
		shape[] a=new shape[4];
		Circle x1=new Circle(d[0]);
		Circle x2=new Circle(d[1]);
		Rectangle x3=new Rectangle(d[2],d[3]);
		Rectangle x4=new Rectangle(d[4],d[5]);
		a[0]=x1;
		a[1]=x2;
		a[2]=x3;
		a[3]=x4;
		System.out.printf("The total area is %.4f",sumArea(a));
	}
	public static double sumArea(shape[] a){
		double sum=0;
		for(int i=0;i<4;i++){
			sum+=a[i].getArea();
		}
		return sum;
	}
}

abstract class shape {
	public abstract double getArea();
	public abstract double getPerimeter();
}

class Circle extends shape{
	double r;
	Circle(double r){
		this.r=r;
	}
	@Override
	public double getArea() {
		return Math.PI*r*r;
	}
	@Override
	public double getPerimeter() {
		return 0;
	}
}

class Rectangle extends shape{
	double m,n;
	Rectangle(double m,double n){
		this.m=m;
		this.n=n;
	}
	@Override
	public double getArea(){
		return m*n;
	}
	@Override
	public double getPerimeter() {
		return 0;
	}
}
