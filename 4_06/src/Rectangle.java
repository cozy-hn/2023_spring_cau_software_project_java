public class Rectangle {
    int x,y,width,height;

    Rectangle(int a, int b, int c, int d) {
        x = a;
        y = b;
        width = c;
        height = d;
    }

    void show()
    {
        System.out.println("A rectangle with " + width + "x" + height + " at (" + x + "," + y + ")");
    }

    int square()
    {
        return width*height;
    }

    boolean contains(Rectangle rec)
    {
        if (x<rec.x && y<rec.y && x+width>rec.x+rec.width && y+height>rec.y+rec.height)
            return true;
        else
            return false;
    }
}
