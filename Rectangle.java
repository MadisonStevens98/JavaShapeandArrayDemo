/*
/*Madison Stevens
May 24, 2017
 */
package project6;
public class Rectangle extends Shape {
        private int width;
        private int height;
        public Rectangle() {
            setX(1);
            setY(0);
            setWidth(5);
            setHeight(3);
        }
        public Rectangle(int tempx, int tempy, int tempwidth, int tempheight) {
            setX(tempx);
            setY(tempy);
            setWidth(tempwidth);
            setHeight(tempheight);
        }
        @Override
        public double area() {
            return width * height;
        }
        public double perimeter() {
            return 2 * (width + height);
        }
        public int getWidth() {
            return width;
        }
        public void setWidth(int tempwidth) {
            if (tempwidth < 1){
                width = 1;
            }
            else {
                width = tempwidth;
        }
        }    
        public int getHeight() {
            return height;
        }
        public void setHeight(int tempheight) {
              if (tempheight < 1){
                height = 1;
            }
            else {
                height = tempheight;
        }   
        }
        @Override
        public void display() {
            System.out.println("Shape; Rectangle "
                    + "\nx; " + getX() 
                    + "\ny; " + getY()
                    + "\nwidth; " + getWidth()
                    + "\nheight; " + getHeight());
        }
    }