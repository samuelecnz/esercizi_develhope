package it.develhope.overload;

public class ShapeTest {

    public static void main(String[] args) {

        Shape square = new Shape("square", 4);
        Shape triangle = new Shape("triangle", 3);
        Shape pentagon = new Shape("pentagon", 5);
        Shape hexagon = new Shape("hexagon", 6);
        Shape circle = new Shape("square", 4);

        circle.setShapeName("square");
        circle.setNumberOfEdges(0);

        // Invoke getShapeDetails() for each Shape object and assign the returned values to dedicated String variables
        String squareDetails = square.getShapeDetails();
        String triangleDetails = triangle.getShapeDetails();
        String pentagonDetails = pentagon.getShapeDetails();
        String hexagonDetails = hexagon.getShapeDetails();
        String circleDetails = circle.getShapeDetails();

        // Print the values of the dedicated String variables
        System.out.println(squareDetails);
        System.out.println(triangleDetails);
        System.out.println(pentagonDetails);
        System.out.println(hexagonDetails);
        System.out.println(circleDetails);
    }
}
