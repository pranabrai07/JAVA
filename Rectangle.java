// Rectangle class with constructors to calculate area
class calRectangle {
    double length;
    double width;

    // Constructor without parameters (default values)
    calRectangle() {
        length = 0.0;
        width = 0.0;
    }

    // Constructor with parameters to initialize length and width
    calRectangle(double l, double w) {
        length = l;
        width = w;
    }

    // Method to calculate and return the area of the rectangle
    void calculateArea() {
        double ans= length * width;
	System.out.println("Area of Rectangle 1: " + ans);
    } 
}
// Main class to test Rectangle class and its constructors
class Rectangle
{
    public static void main(String[] args) {
        // Creating Rectangle objects using different constructors
        calRectangle rect1 = new calRectangle(); // Using default constructor
        calRectangle rect2 = new calRectangle(5.0, 3.0); // Using constructor with parameters

        // Calculating and displaying area of rectangles
        rect1.calculateArea();
        rect2.calculateArea();
    }
}