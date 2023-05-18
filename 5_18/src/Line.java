public class Line implements Angular{
    private int a,b;
    public Line(int a, int b) { this.a = a; this.b = b; }
    @Override
    public void printVertex() { System.out.printf("Vertex: (%d,0) (%d,0)\n", a-b/2,a+b/2); }
}
