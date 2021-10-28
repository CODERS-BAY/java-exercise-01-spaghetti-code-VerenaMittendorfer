

public class Geometric {


    

    // private static int x = 10;
    // private static int y = 5;
    // private static double z = 3.0;
    // private static int x1 = 8;
    // private static int y1 = 7;
    // private static int z1 = 10;
    // private static int x2 = 100;
    // private static int y2 = 57;
    // private static int z2 = 129;
    // private static int x3 = 45;
    // private static int y3 = 89;
    // private static int z3 = 69;

    public static void main(String[] args) {

    

        
            squareArea(5);
            squarePerimeter(5);
            rectangleArea(5, 5);
            rectanglePerimeter(5, 5);
            zoneOfASphere(5, 5, 5);
            ungula(5,5);
    
    
            
    
        }
            public static int squareArea(int x) {
                System.out.println("Square Area: x * x = " + x * x);
                return x * x;
                
            }
    
            // // area ... Fläche
            // System.out.println("Square area");
            // System.out.println("x * x = " + x * x);
            // System.out.println("x1 * x1 = " + x1 * x1);
            // System.out.println("x2 * x2 = " + x2 * x2);
            // System.out.println("y * y = " + y * y);
    
            public static int squarePerimeter(int x) {
                System.out.println("Square perimeter: 4 * x =" + 4 * x);
                return 4 * x;
                
            }
    
            // // perimeter ... Umfang
            // System.out.println("Square perimeter");
            // System.out.println("4 * x = " + 4 * x);
            // System.out.println("4 * x1 = " + 4 * x1);
            // System.out.println("4 * x2 = " + 4 * x2);
            // System.out.println("4 * y = " + 4 * y);
    
            public static int rectangleArea(int x, int y) {
                System.out.println("Rectangle area: x * y = " + x * y);
                return x * y;
                
            }
    
            // System.out.println("Rectangle area");
            // System.out.println("x * y = " + x * y);
            // System.out.println("x1 * y1 = " + x1 * y1);
            // System.out.println("x2 * y2 = " + x2 * y2);
            // System.out.println("x3 * y3 = " + x3 * y3);
    
            public static int rectanglePerimeter(int x, int y) {
                System.out.println("Rectangle perimeter: (x + y) * 2 = " + (x + y) * 2);
                return (x + y) * 2;
                
            }
    
            // System.out.println("Rectangle perimeter");
            // System.out.println("x + y = " + x + y);
            // System.out.println("x1 + y1 = " + x1 + y1);
            // System.out.println("x2 + y2 = " + x2 + y2);
            // System.out.println("x3 + y3 = " + x3 + y3);
    
            // System.out.println("We can also calculate some volumes");
            /*
                z is our height
                y is our radius
             */
    
            public static double zoneOfASphere(int y, int x, double z) {
                System.out.println("Zone of a sphere = " + ((Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6));
                double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
                return v;
                
            }
            // System.out.println("Zone of a sphere");
            // double v = (Math.PI * z * (3 * Math.pow(y, 2) + 3 * Math.pow(x, 2) + Math.pow(z, 2))) / 6;
            // System.out.println(v);
    
            public static double sphereWithCylinder(double z) {
                System.out.println("Sphere with cylinder: ");
                return Math.PI * Math.pow(z, 3) / 6;
                
            }
    
            // System.out.println("Sphere with cylinder");
            // System.out.println(Math.PI * Math.pow(z, 3) / 6);
            
            public static double ungula(double x3, double z3) {
                System.out.println("Ungula: " + ((double) (2 * x3 * z3) / 3));
                return (double) (2 * x3 * z3) / 3;
                
            }
            // System.out.println("Ungula");
            // System.out.println((double) (2 * x3 * z3) / 3);
    
}
