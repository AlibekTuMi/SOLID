import java.util.ArrayList;
import java.util.List;
import DIP.Car;
import DIP.DieselEngine;
import DIP.PetrolEngine;
import ISP.Circle;
import ISP.Cube;
import ISP.Shape;
import ISP.Sphere;
import ISP.Triangle;
import LSP.Rectangle;
import LSP.Square;
import OCP.Bus;
import OCP.CalculateSpeed;
import OCP.Sedan;
import OCP.Vehicle;
import SRP.Chief;
import SRP.Employee;
import SRP.NetSalary;

public class App {
    public static void main(String[] args) throws Exception {
        Employee employee1 = new Employee("Antony","18.11.1990");
        Employee employee2= new Employee("Genry","08.04.1993");
        Employee employee3 = new Employee("Tom","10.09.1991");
        Employee employee4 = new Employee("Trevor","16.06.1992");
        Employee employee5 = new Employee("Bob","12.03.1989");
        Employee employee6 = new Employee("Alex","15.07.1991");
        List<Employee> employees = new ArrayList<>();
        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);
        employees.add(employee4);
        employees.add(employee5);
        employees.add(employee6);

        NetSalary netSalary = new NetSalary();
        // netSalary.baseSalaryEmp(employees);

        // System.out.println();

        Chief chief = new Chief();
        // chief.workHourEmp(employees);

        // Не совсем понял как работать с классом Date, поэтому переделал на String birthday.
        // Принцип SRP понял, однако долго пришлось писать код прежде чем он заработал)))

        // SRP Выполнил!!!!!!

        // --------------------------------------------------------------------------------------------------------------------------------------

       

        Vehicle bus = new Bus(140, "ЛиАЗ");
        Vehicle sedan = new Sedan(200, "ВАЗ");

        CalculateSpeed calculateSpeed = new CalculateSpeed();
        // calculateSpeed.calculateAllowedSpeed(sedan);
        // calculateSpeed.calculateAllowedSpeed(bus);


        // Создал и переписал класс CalculateSpeed, в котором создал метод calculateAllowedSpeed, который принимает экземпляр класса Vehicle. Внутри метода
        // для экземпляра класса вызывается свой метод. Весь смысл принцпа основан на том, что есть абстрактный класс, у которого есть наследники,
        // также есть отдельный класс, который работает с наследниками, а именно принимает данные от них и выводит соответствующую по ним информацию.
        
        // OCP Выполнил!!!!!

        // ---------------------------------------------------------------------------------------------------------------------------------------

        Shape circle = new Circle(5);
        Shape cube = new Cube(7);
        Shape triangle = new Triangle(3, 4, 5);
        Shape sphere = new Sphere(9);
        // System.out.printf("Площадь круга - %s, объём круга - %s\n",circle.area(),circle.volume());
        // System.out.printf("Площадь куба - %s, объём куба - %s\n",cube.area(),cube.volume());
        // System.out.printf("Площадь треугольника - %s, объём треугольника - %s\n",triangle.area(),triangle.volume());
        // System.out.printf("Площадь сферы - %s, объём сферы - %s\n",sphere.area(),sphere.volume());

        // Тема зашла просто, создал классы разных геометрических объектов (Добавил от себя еще объекты), имплементировал через единый интерфейс (в чём как я понял суть ISP), и через 
        // String.format вывел на консоль функции к каждому объекту.

        // ISP Выполнил!!!!!

        // ----------------------------------------------------------------------------------------------------------------------------------------

        Rectangle rectangle = new Rectangle();
        rectangle.setWidth(5);
        rectangle.setHeight(6);
        // System.out.printf("Площадь прямоугольника - %d\n",rectangle.area());

        Square square = new Square();
        square.setHeight(5);
        // System.out.printf("Площадь квадрата - %d",square.area());

        // Тема LSP я понял, также в интернете нашел подробную информацию по этому принципу, где данная задача описана, получается что 
        // квадрат наследует Setter-ы прямоугольника, однако при вводе данных сторон квадрата нужно указывать лишь одну сторону,
        // а при прямоугольнике надо вводить длины двух сторон, также площадь квадрата вычисляется путем наследования функции площади прямоугольника.
        
        // LSP Выполнил!!!

        // ----------------------------------------------------------------------------------------------------------------------------------------



        Car car1 = new Car(new PetrolEngine());
        Car car2 = new Car(new DieselEngine());

        car1.start();
        car2.start();

        // В данном принципе я создал интерфейс, после подключил его к классам разных двигателей. Далее создал отдельный класс, в котором я создал
        // приватное поле для хранения экземпляра класса, который имплементирует этот интерфейс, создал конструктор, который принимает в качестве аргумента экземпляр класса 
        // имплементирующий интерфейс и присвает созданному полю этот экземпляр класса. Далее создал метод, который вызывает у экземпляра класса свой метод.

        // DIP Выполнил!!!!!
     
    }
    
}
