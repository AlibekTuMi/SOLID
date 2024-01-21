package ISP;

public class Triangle implements Shape{
    private int a;
    private int b;
    private int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double area() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        return s;
    }

    @Override
    public double volume() {
        System.out.println("Треугольник не имеет объёма");
        return 0;
    }
    
}
