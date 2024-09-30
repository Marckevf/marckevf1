package math;

public class HexArea {

    // calculate the area of the hexagon
    public static double calculateHexagonArea(double side) {
        // Formula: (3 * sqrt(3) / 2) * side^2
        double area = (3 * Math.sqrt(3) / 2) * (side * side);
        return area;
    }

    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        System.out.println("************************************");
        System.out.print("Enter the side: ");
        double side = input.nextDouble();
               
        double area = calculateHexagonArea(side);
        
       
        System.out.printf("The area of the hexagon is %.2f\n", area);
        
        input.close(); 
    }
}
