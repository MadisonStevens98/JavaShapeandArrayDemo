/*
Madison Stevens
May 24, 2017
 */
package project6;
public class Circle extends Shape {
    final double pi = Math.PI;
    private int radius;
    public Circle() {
        setRadius(3);
        setX(1);
        setY(0);
    }
    public Circle(int tempx, int tempy, int tempradius) {
        setRadius(tempradius);
        setX(tempx);
        setY(tempy);
    }
    @Override
    public double area() {
        return pi * Math.pow(radius, 2);
    }
    public double perimeter() {
        return 2 * pi * radius;
    }
    public int getRadius() {
        return radius;
    }
    public void setRadius(int tempradius) {
        if (tempradius < 1) {
            radius = 1;
        } else {
            radius = tempradius;
        }
    }
    @Override
    public void display() {
           System.out.println("Shape; Circle "
                    + "\nx; " + getX() 
                    + "\ny; " + getY()
                    + "\nwidth; " + getRadius());
    }
}
