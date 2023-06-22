import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        //#1
        Student student1 = new Student("Алиса", "Смит", "Коктем-2", 24);
        System.out.println(student1);
        Student student2 = new Student("Азамат", "Даурбеков", "Таугуль-1", 23);
        System.out.println(student2);
        Student student3 = new Student("Кристина", "Иринова", "Орбита-3", 22);
        System.out.println(student3);
        //#2
        Triangle triangle = new Triangle(3, 4, 5);
        triangle.perimeter();
        triangle.area();
        //#3
        Rectangle rectangle1 = new Rectangle(5, 9);
        int area1 = rectangle1.returnArea();
        Rectangle rectangle2 = new Rectangle(10, 14);
        int area2  = rectangle2.returnArea();
        System.out.println(area1);
        System.out.println(area2);
        //#4
        Average average = new Average(5,10,15);
        average.average();
        //#5
        Movie movie1 = new Movie("Фокус","RatPac-Dune Entertainment", "R");
        Movie movie2 = new Movie("Главный герой", "20th Century Studios");
        movie1.print();
        movie2.print();
    }
}