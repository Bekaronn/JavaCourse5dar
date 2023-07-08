import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1
        Student student1 = new Student("Dias", 13231231, 1);
        Student student2 = new Student("Danial", 3211232, 2);
        //Student-1
        System.out.println(student1.getName());
        System.out.println(student1.getId());
        System.out.println(student1.getYear());
        //Student-2
        System.out.println(student2.getName());
        System.out.println(student2.getId());
        System.out.println(student2.getYear());

        student1.setYear(2);
        student2.setYear(5);

        System.out.println(student1.getYear());
        System.out.println(student2.getYear());

        //#2
        StarTriangle small = new StarTriangle(3);
        System.out.println(small.toString());

        //#3
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите длину стороны:");
        int a = scan.nextInt();
        Square square = new Square(a);
        System.out.println(square.toString());

        //#4
        Temperature temperature1 = new Temperature();
        Temperature temperature2 = new Temperature(23.1f, 43.2f);

        System.out.println(temperature2.getDegreesC());
        System.out.println(temperature2.getDegreesF());
        System.out.println(temperature2.toString());
    }
}