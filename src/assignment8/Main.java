package assignment8;

public class Main {
    public static void main(String[] args) {
        // Create shapes
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 6);
        Shape triangle = new Triangle(3, 7);

        // Create a drawing and add shapes to it
        Drawing drawing = new Drawing();
        drawing.addShape(circle);
        drawing.addShape(rectangle);
        drawing.addShape(triangle);

        // Create an AreaCalculator visitor
        AreaCalculator areaCalculator = new AreaCalculator();

        // Calculate the areas of all shapes
        System.out.println("Calculating areas for shapes in the drawing:");
        drawing.calculateAreas(areaCalculator);
    }
}