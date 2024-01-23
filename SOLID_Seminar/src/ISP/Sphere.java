package ISP;

public class Sphere implements VolShape{
    private int radius;

    public Sphere(int radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        double s = 4*3.14*Math.pow(radius,2);
        return s;
    }

    @Override
    public double volume() {
        double v = (4/3)*3.14*Math.pow(radius,3);
        return v;
    }
    
}
