import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Shape3DInterface> shapes = new ArrayList<>();
        var rand = new Random();

        for (int i = 0; i < 10; i++) {
            int shapeType = rand.nextInt(3);
            Shape3DInterface shape;

            switch (shapeType) {
                case 0:
                    shape = new Sphere();
                    break;
                case 1:
                    shape = new Cylinder();
                    break;
                case 2:
                    shape = new Cube();
                    break;
                default:
                    shape = new Sphere();
            }
            shapes.add(shape);
        }

        for (Shape3DInterface shape : shapes) {
            System.out.println("Shape: " + ((shape instanceof Sphere) ? "Sphere" :
                    (shape instanceof Cylinder) ? "Cylinder" : "Cube"));
            System.out.println("Surface Area: " + shape.surfaceArea());
            System.out.println("Volume: " + shape.volume());
            System.out.println();
        }
    }
}