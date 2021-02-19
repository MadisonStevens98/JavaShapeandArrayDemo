/*Madison Stevens
May 24, 2017
 */
package project6;

public class Project6 {
   
  private Shape [] thearray = new Shape[100];  // 100 Shapes, circle's, tri's and rects
 
  public static void main (String [] args) {
    Project6 tpo = new Project6();
    tpo.run();
  }  // end of main
 
  public void run () {
    int count = 0;
 
    // ------------------------   Fill the array section ----------------------
 thearray[count++] = new Circle(20, 20, 40);
    thearray[count++] = new Triangle(70, 70, 20, 30);
    thearray[count++] = new Rectangle(150, 150, 40, 40);
    thearray[count++] = new Circle(20, 20, 40);
    thearray[count++] = new Triangle(70, 70, 20, 30);
    Rectangle rectangleobject = new Rectangle();
    rectangleobject.setX(150);    rectangleobject.setY(rectangleobject.getX());
    rectangleobject.setHeight(40);
    rectangleobject.setWidth(40);
    thearray[count++] = rectangleobject;

    // ------------------------------  array fill done ------------------------
 
    //---------------------------  loop through the array  --------------------
 
    for (int i = 0; i < count; i ++ ) {    // loop through all objects in the array
       thearray[i].display();              // don’t care what kind of object, display it
    }  // end for loop
 
    int offset = 0;
    double totalarea = 0.0;
    while (thearray[offset] != null) {          // loop through all objects in the array
       totalarea = totalarea + thearray[offset].area();   // get area for this object
       offset++;
    } // end while loop
    System.out.println("The total area for " + offset + " Shape objects is " + totalarea);
 
  }  // end of run
 
}  // end of class Project6
 
 