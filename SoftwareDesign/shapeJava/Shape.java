interface Shape {
	public void display();
	double area();
}

class Rectangle implements Shape {
	private double xtl;
	private double ytl;
	private double xbr;
	private double ybr;
	public Rectangle(double xtl, double ytl, double xbr, double ybr){
		this.xtl = xtl;
		this.ytl = ytl;
		this.xbr = xbr;
		this.ybr = ybr;
	}
	public void display(){
		System.out.println("("+xtl+", "+ytl+"), ("+xbr+", "+ybr+")");
	}
	public double area(){
		double w = xtl - xbr;
		double h = ytl - ybr;
		return w*h;
	}
}
class Circle implements Shape {
	private double xc;
	private double yc;
	private double r;
	public Circle(double xc, double yc, double r){
		this.Circle = new circle(xc, yc, r);
	}
	public void display(){
		System.out.println("("+xc+", "+yc+"), "+r);
	}
	public double area() {
		double r2 = r*r;
		return Math.PI*r2;
	}
}
