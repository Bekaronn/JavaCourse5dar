import java.awt.image.AreaAveragingScaleFilter;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //#1
        int a = 25, b = 12;
        System.out.println(25 + 12);
        System.out.println(25 * 12);
        System.out.println(25 - 12);
        System.out.println(25 / 12);
        System.out.println(25 % 12);

        //#2
        int n = 1;
        while (n <= 20) {
            System.out.println(n);
            n += 2;
        }

        //#3
        int x = 10;
        int y = 8;
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println("x number is " + x + " and y number is " + y);

        //#4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите 3 числа: ");
        int[] numbers = new int[3];
        numbers[0] = scanner.nextInt();
        numbers[1] = scanner.nextInt();
        numbers[2] = scanner.nextInt();
        int temp = numbers[0];
        for (int i = 0; i < 3; i++) {
            if (temp < numbers[i]) {
                temp = numbers[i];
            }
        }
        System.out.println(temp);

        //#5
        int number = 12;
        if (number > 0) {
            System.out.println("число положительное");
        } else if (number == 0) {
            System.out.println("Число равен нулю");
        } else {
            System.out.println("Число отрицательное");
        }

        //#6
        String str = "adfbaibibaaaabnfdaa";
        int length = str.length();
        char[] ch = str.toCharArray();
        for (int i = 0; i < length; i++) {
            if (ch[i] == 'a') {
                ch[i] = 'b';
            }
        }
        str = new String(ch);
        System.out.println(str);

        //#7
        int[] array = {23,1,2,3,4,12,13,8,5};
        int sum = 0;
        for(int i = 0; i<array.length; i++){
            sum += array[i];
        }
        System.out.println(sum);

        //#8
        int[] Array = {23,1,2,3,4,12,13,8,5};
        Arrays.sort(Array);
        System.out.println(Array[Array.length-2]);

        //additional-Tasks
        //#1
        Solution1 solution1 = new Solution1();
        String s = "codeleet";
        int[] indices = {4,5,6,7,0,2,1,3};
        System.out.println(solution1.restoreString(s, indices));

        //#2
        Solution2 solution2 = new Solution2();
        int number_1 = 121;
        int number_2 = -121;
        int number_3 = 10;
        System.out.println(solution2.isPalindrome(number_1));
        System.out.println(solution2.isPalindrome(number_2));
        System.out.println(solution2.isPalindrome(number_3));

        //#3
        Solution3 solution3 = new Solution3();
        int number1 = 14;
        int number2 = 8;
        int number3 = 123;
        System.out.println(solution3.numberOfSteps(number1));
        System.out.println(solution3.numberOfSteps(number2));
        System.out.println(solution3.numberOfSteps(number3));

        //#4
        Solution4 solution4 = new Solution4();
        String[] word1 = {"ab", "c"};
        String[] word2 = {"a", "bc"};
        System.out.println(solution4.arrayStringsAreEqual(word1,word2));
        String[] word1_2 = {"a", "cb"};
        String[] word2_2 = {"ab", "c"};
        System.out.println(solution4.arrayStringsAreEqual(word1_2,word2_2));
        String[] word1_3 = {"abc", "d", "defg"};
        String[] word2_3 = {"abcddefg"};
        System.out.println(solution4.arrayStringsAreEqual(word1_3,word2_3));

        //#5
        Solution5 solution5 = new Solution5();
        int[] arr_1 = {1,4,2,5,3};
        int[] arr_2 = {1,2};
        int[] arr_3 = {10,11,12};
        System.out.println(solution5.sumOddLengthSubarrays(arr_1));
        System.out.println(solution5.sumOddLengthSubarrays(arr_2));
        System.out.println(solution5.sumOddLengthSubarrays(arr_3));
    }
}