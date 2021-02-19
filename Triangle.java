/*
Madison Stevens
May 24, 2017
*/
package project6;
public class Triangle extends Shape {

    private int base;
    private int height;

    public Triangle() {
        setX(1);
        setY(0);
        setBase(3);
        setHeight(5);
    }

    public Triangle(int tempx, int tempy, int tempbase, int tempheight) {
        setX(tempx);
        setY(tempy);
        setBase(tempbase);
        setHeight(tempheight);
    }

    public int getBase() {
        return base;
    }

    public void setBase(int tempbase) {
        if (tempbase < 1) {
            base = 1;
        } else {
            base = tempbase;
        }
    }
    public int getHeight() {
        return height;
    }
    public void setHeight(int tempheight) {
        if (tempheight < 1) {
            height = 1;
        } else {
            height = tempheight;
        }
    }
        @Override
        public void display () {
        System.out.println("Shape; Triangle "
                    + "\nx; " + getX()
                    + "\ny; " + getY()
                    + "\nwidth; " + getBase()
                    + "\nheight; " + getHeight());
        }
    
        @Override
        public double area() {
            return (height * base)/2; 
        }
    }
