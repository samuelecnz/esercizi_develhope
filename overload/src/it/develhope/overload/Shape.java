package it.develhope.overload;

public class Shape {
    private String shapeName;
    private int numberOfEdges;
    public Shape(String square, int edgeLength) {
        System.out.println("E' stata creata una nuova forma");
        shapeName = "Undefined";
    }
    public Shape(double radius) {
        System.out.println("E'stato creato il cerchio");
        shapeName = "Circle";
    }

    public Shape(int edges, double edgeLength) {
        System.out.println("E' stato creato il quadrato");
        shapeName = "Square";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2) {
        System.out.println("E' stato creato il rettangolo");
        shapeName = "Rectangle";
        numberOfEdges = edges;
    }

    public Shape(int edges, double e1, double e2, double e3) {
        System.out.println("E' stato creato il triangolo");
        shapeName = "Triangle";
        numberOfEdges = edges;
    }

    public String getShapeDetails() {
        String shapeName = "square";
        int numberOfEdges = 4;
        return "Shape name: " + shapeName + ", number of edges: " + numberOfEdges;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public void setNumberOfEdges(int i) {
    }
}
