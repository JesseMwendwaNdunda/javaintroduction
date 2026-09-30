package week1;
public class RectangleProcedural {
    public static double calculateArea(double length, double width) {
        return length * width;
    }

    public static void main (String[] args) {
        double length = 5.0;
        double width = 3.0;
        double area = calculateArea(length, width);
        double Perimeter= 2 * (length + width);
        System.out.println("Procedural approcach:");
        System.out.println("Length: " + length);
        System.out.println("Width: " + width);
        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + Perimeter);

        
        
    }
}


