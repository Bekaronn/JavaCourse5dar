import java.util.Scanner;

public class Main {
    static int findSum(String str) {
        String temp = "0";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch))
                temp += ch;
            else {
                sum += Integer.parseInt(temp);
                temp = "0";
            }
        }
        return sum + Integer.parseInt(temp);
    }

    public static void devide(int x, int y) {
        if (y == 0) {
            throw new ArithmeticException("Число не делиться на ноль");
        } else {
            System.out.println(x / y);
        }
    }

    public static void main(String[] args) {
        //#1
        System.out.println("Введите число:");
        Scanner scanner = new Scanner(System.in);

        try {
            int num = scanner.nextInt();
            System.out.println("квадратный корень - " + Math.sqrt(num));
        } catch (Exception E) {
            System.out.println("Неправильное значение");
        }


        //#2
        int x = 10;
        int y = 2;
        devide(x, y);

        //#3
        Scanner scanner1 = new Scanner(System.in);
        String enter = scanner1.nextLine();
        System.out.println("Сумма целых чисел в строке равна "+ findSum(enter));
    }
}