public class Circle implements Shape{
    private int radius;
    public Circle(int radius) { this.radius = radius; }
    @Override
    public void draw() { System.out.println("Circle with radius "+radius); }
    @Override
    public double getArea() { return PI*radius*radius; }
}