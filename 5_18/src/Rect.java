public class Rect implements Shape, Angular {
    private int a,b;
    public Rect(int a, int b) { this.a = a; this.b = b; }
    @Override
    public void draw() { System.out.println("Rectangle with "+a+"x"+b); }
    @Override
    public double getArea() { return a*b; }
    @Override
    public void printVertex() { System.out.printf("Vertex: (%d,%d) (%d,%d) (%d,%d) (%d,%d)\n", -a/2, -b/2, a/2, -b/2, -a/2, b/2, a/2, b/2); }
    
}
