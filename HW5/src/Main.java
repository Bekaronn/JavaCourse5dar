import javax.annotation.processing.SupportedSourceVersion;
import java.sql.SQLSyntaxErrorException;

public class Main {
    public static void main(String[] args) {
        //1
        int a = 10;
        int b = 9;
        if (a == b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        //2
        int cost = 8000;
        if (cost < 5000) {
            System.out.println(cost);
        } else {
            System.out.println(cost * 0.9);
        }
        //3
        int grade = 81;
//        Ниже 25 - F
//        От 25 до 45 - E
//        От 45 до 50 - D
//        От 50 до 60 - C
//        От 60 до 80 - B
//        Выше 80 - A
        if (grade < 25) {
            System.out.println("F");
        } else if (25 <= grade && grade < 45) {
            System.out.println("E");
        } else if (45 <= grade && grade < 50) {
            System.out.println("D");
        } else if (50 <= grade && grade < 60) {
            System.out.println("C");
        } else if (60 <= grade && grade < 80) {
            System.out.println("B");
        } else {
            System.out.println("A");
        }
        //4
        int x = 12345;
        int result = 0;
        for (int i = x; i != 0; i /= 10) {
            result = result * 10 + i % 10;
        }
        System.out.println(result);
        //5
        x = 31;
        int n = 2;
        boolean ans = true;
        while (x >= n * 2) {
            if (x % n == 0) {
                ans = false;
                System.out.println(n);
                break;
            }
            n++;
        }
        if (ans == true) {
            System.out.println("prime number");
        } else {
            System.out.println("not prime numbers");
        }
        //6
        //i)
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
        //ii)
        x = 5;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print('*');
            }
            System.out.println('*');
        }
        //iii)
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j > 1; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(' ');
                }
            }
            for (int j = 1; j <= 5; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(' ');
                }
            }
            System.out.print('\n');
        }
        //7
        a = 2;
        b = 8;
        int res = 0;
        for(int i = a; i<=b; i++){
            res += i;
        }
        System.out.println(res);
        //8
        int salary = 300000;
        int rank = 'A';
        switch (rank){
            case 'A':
                System.out.println(salary*1.5);
                break;
            case 'B':
                System.out.println(salary*1.25);
                break;
            case 'C':
                System.out.println(salary);
                break;
        }
        //9
        n = 10;
        int num1 = 0;
        System.out.print(0 + " ");
        int num2 = 1;
        System.out.print(1 + " ");
        int num3 = 0;
        for(int i = 0; i < n-2; i++){
            num3 = num1 + num2;
            num1 = num2;
            num2 = num3;
            System.out.print(num3 + " ");
        }
    }
}