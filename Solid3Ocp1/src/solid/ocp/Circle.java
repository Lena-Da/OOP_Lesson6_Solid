package solid.ocp;

public class Circle implements Shape {
    
    public Circle(Integer radius) {
        this.radius = radius;
    }

    private Integer radius;

    @Override
    public double GetArea() {
        return Math.PI * Math.pow(getRadius(),2);
    }

    public Integer getRadius() {
        return radius;
    }
    
}
