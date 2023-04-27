public class ColorPoint extends Point{
    private String color;

    ColorPoint(){
        super(0, 0);
        this.color = "BLACK";
    }
    ColorPoint(int x, int y){
        this();
        move(x, y);
    }
    ColorPoint(int x, int y, String color){
        super(x, y);
        this.color = color;
    }
    public void setXY(int x, int y){
        move(x, y);
    }
    public void setColor(String color){
        this.color = color;
    }
    public String toString(){
        return "The "+this.color+" point is at ("+getX()+", "+getY()+")";
    }
}
