package ss07_abstract_class_and_interface.bai_tap.implement_colorable_interface_for_geometry_assignment_classes;

public class Shape {
    private String color;
    private boolean filled;
    public Shape() {
        this("red", true);
    }
    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }
    public String getColor () {
        return this.color;
    }
    public void setColor (String color) {
        this.color = color;
    }
    public boolean isFilled () {
        return this.filled;
    }
    public void setFilled (boolean filled) {
        this.filled = filled;
    }
    @Override
    public String toString () {
        return "A Shape with color of " + getColor() + " and " + (isFilled() ? "filled" : "not filled");
    }
}