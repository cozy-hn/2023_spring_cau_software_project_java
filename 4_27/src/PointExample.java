public class PointExample {
    public static void main(String[] args){
        ColorPoint cp = new ColorPoint(5, 5, "YELLOW");
        cp.setXY(10, 20);
        cp.setColor("red");
        String str = cp.toString();
        System.out.println(str);

        ColorPoint ZeroPoint = new ColorPoint();
        System.out.println(ZeroPoint.toString());

        ColorPoint blackPoint = new ColorPoint(5, 5);
        System.out.println(blackPoint.toString());

        Point3D p = new Point3D(1, 2, 3);
        System.out.println(p.toString());
        
        p.moveUp();
        System.out.println(p.toString());

        p.moveDown();
        System.out.println(p.toString());
        
        p.move(10,10);
        System.out.println(p.toString());

        p.move(100,200, 300);
        System.out.println(p.toString());

    }
}
