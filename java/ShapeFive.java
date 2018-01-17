class RPentagon extends shape
{
	private double a;
	@Override
	public double getArea() {
		// TODO 自动生成的方法存根
		return 5*Math.pow(a,2)/(4*Math.tan(36*Math.PI/180));
	}

	@Override
	public double getPerimeter() {
	// TODO 自动生成的方法存根
		return 5*a;
	}
	public RPentagon(double a1)
	{
		a=a1;
	}
}

