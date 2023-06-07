public class Main {
    public static void main(String[] args) {
        //#1
        String flowersName = "Roses";
        //#2
        int flowersNumber = 101;
        //#3
        System.out.println(flowersName + " " + flowersNumber);
        //#4
        int a = 15;
        int b = 10;
        System.out.println(a + b);
        //#5
        int c = a + b;
        System.out.println(c);
        //#6
        int q = 5, w = 10, e = 15;
        System.out.println(q + w + e);
        //#7
        double a1, a2, a3, a4;
        a1 = a2 = a3 = a4 = 1.5d;
        System.out.println(a1 + a2 + a3 + a4);

        //#1
        double db;
        db = 2.5d;
        //#2
        final float PI = 3.14f;
        final double gravity = 9.82;
        final String city = "Almaty";

        //#1
        byte bt = 127;
        System.out.println(bt);
        short sh = 323;
        System.out.println(sh);
        int i = 2321;
        System.out.println(i);
        long l = 329329;
        System.out.println(l);
        double dob = 332.2322;
        System.out.println(dob);
        float ft = 311.2232f;
        System.out.println(ft);
        boolean bl = true;
        System.out.println(bl);
        char ch = 'c';
        System.out.println(ch);
        String st = "Hello World!";
        System.out.println(st);

        //#1
        byte bb = 123;
        int ab = bb;
        System.out.println(ab);
        //#2
        double n = 3.89;
        int a12 = (int) n;
        System.out.println(a12);
    }
}