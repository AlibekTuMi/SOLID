package ISP;

// 3) Переписать код в соответствии с Interface Segregation Principle:

public class Circle implements Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 2 * 3.14 * radius;
    }

    @Override
    public double volume() {
        System.out.println("Круг не имеет объёма");
        return 0;
    }
}

// Подсказка: круг не объемная фигура и этому классу не нужен метод volume().