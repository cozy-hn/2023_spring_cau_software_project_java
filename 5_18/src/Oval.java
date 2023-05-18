public class Oval implements Shape{
    private int a,b;
    public Oval(int a, int b) { this.a = a; this.b = b; }
    @Override
    public void draw() { System.out.println("Oval with "+a+"x"+b); }
    @Override
    public double getArea() { return PI*a*b; }
}
