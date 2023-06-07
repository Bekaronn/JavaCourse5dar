public class Main {
    public static void main(String[] args) {
        //#1
        System.out.println(10*5);
        //#2
        System.out.println(20/2.5);
        //#3
        int a = 15;
        int b = 9;
        System.out.println(15*9);
        System.out.println((15+9)*2);
        //#4
        int x = 3;
        x++;
        System.out.println(x);
        //#5
        x+=5;
        //#6
        System.out.println(25==43);
        //#7
        a = 10;
        b = 5;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
        //#8
        float Fahrenheit = 35;
        float Celsius = (Fahrenheit - 32) * 5/9;
        System.out.println(Celsius);
        //#9
        int num = 451;
        System.out.println(((num+10)/3+5)*5);
        //#10
        a = 65;
        b = 80;
        System.out.println(a < 50 || a < b);
    }
}