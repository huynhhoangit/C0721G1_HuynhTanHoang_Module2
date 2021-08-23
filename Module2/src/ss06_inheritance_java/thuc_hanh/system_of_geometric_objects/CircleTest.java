package ss06_inheritance_java.thuc_hanh.system_of_geometric_objects;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle = new Circle();
        System.out.println(circle);

        circle = new Circle(3.5);
        System.out.println(circle);

        circle = new Circle(3.5, "indigo", true);
        System.out.println(circle);
    }
}
