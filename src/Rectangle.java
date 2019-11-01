public class Rectangle extends Shape {
    private double width = 1.0;
    private double length = 1.0;

    public Rectangle() {
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.length = height;
    }
    public Rectangle(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width =width;
        this.length =height;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public double getLength(){
        return length;
    }
    public void  setLength() {
        this.length = length;
    }

    public String toString() {
        return "A Rectangle with width= " + getWidth() +" and length = " + getLength() + ", which is a subclass of " + super.toString();
    }

}
