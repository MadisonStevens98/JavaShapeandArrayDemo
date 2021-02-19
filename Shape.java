/*
/*Madison Stevens
May 24, 2017
 */
package project6;
 public abstract class Shape {
        int x;
        int y;
        public int getX() {
            return x;
        }
        public void setX(int tempx) {
            x = tempx;
        }
        public int getY() {
            return y;
        }
        public void setY(int tempy) {
            y = tempy;
        }
        public abstract void display();
        public abstract double area();
    }
