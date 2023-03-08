public class AreaCalculator {
    public static double area(double radius) {
        if (radius < 0) {
            return -1.0; // invalid value
        }

        return Math.PI * radius * radius; // area of a circle formula
    }

    public static double area(double x, double y) {
        if (x < 0 || y < 0) {
            return -1.0; // invalid value
        }

        return x * y; // area of a rectangle formula
    }

}