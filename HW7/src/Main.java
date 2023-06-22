public class Main {
    static public int minNumber(int x, int y, int z) {
        if (x > y) {
            if (y > z) {
                return z;
            } else if (y < z) {
                return y;
            }
        } else {
            if (x > z) {
                return z;
            } else if (x < z) {
                return x;
            }
        }
        return x;
    }

    static public float avgNumber(int x, int y, int z) {
        return (x + y + z) / 3;
    }

    static public int vowelNumber(String str) {
        int cnt = 0;
        str = str.toLowerCase();
        for (int i = 0; i < str.length(); i++) {
            if("aeiou".indexOf(str.charAt(i)) != -1){
                cnt++;
            }
        }
        return cnt;
    }

    static public int wordNumber(String str) {
        int res = str.split("\\s").length;
        return res;
    }

    static public int cntNumber(int num) {
        int cnt = 0;
        while (num != 0) {
            if (num % 10 == 2) {
                cnt++;
            }
            num /= 10;
        }
        return cnt;
    }

    static public boolean allVowel(String str) {
        str = str.toLowerCase();
        for(int i = 0; i < str.length(); i++){
            if("aoeiu".indexOf(str.charAt(i)) == -1){
                return false;
            }
        }
        return true;
    }

    static public float areaFind(int x, int y) {
        float sum = (y * y * 6.88191f) / 4;
        return sum;
    }

    static public int sumAllDigit(int x) {
        if(x==0){
            return 0;
        } else {
            return x%10 + sumAllDigit(x/10);
        }
    }

    public static void main(String[] args) {
        //#1
        int firstNumber = 25;
        int secondNumber = 37;
        int thirdNumber = 29;
        int res = minNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(res);
        //#2
        firstNumber = 25;
        secondNumber = 45;
        thirdNumber = 65;
        float ress = avgNumber(firstNumber, secondNumber, thirdNumber);
        System.out.println(ress);
        //#3
        String str = "DarTech123";
        System.out.println(vowelNumber(str));
        //#4
        str = "Java is good to learn Object Oriented programming.";
        System.out.println(wordNumber(str));
        //#5 - 1
        int num = 1254212;
        res = cntNumber(num);
        System.out.println(res);
        //#5 - 2
        str = "AIEEE";
        boolean result = allVowel(str);
        System.out.println(result);
        //#6
        int side = 5;
        int length = 6;
        float area = areaFind(side, length);
        System.out.println(area);
        //#7
        int Number = 252;
        System.out.println(sumAllDigit(Number));
    }
}