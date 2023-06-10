public class Main {
    public static void main(String[] args) {
        //#1
        int[] arr = {1, 3, 4, 1, 5, 5};
        float sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println(sum / arr.length);
        //#2
        int[] arr2 = {1, 3, 4, 1, 5, 5};
        for (int i = 0; i < arr2.length; i++) {
            for (int j = i + 1; j < arr2.length; j++) {
                if (arr2[i] == arr2[j]) {
                    System.out.print(arr2[i] + " ");
                }
            }
        }
        System.out.print('\n');
        //#3
        int[] arr3 = {1, 3, -6, 23, 14, 2};
        int x = 23;
        boolean ans = false;
        for (int n : arr3) {
            if (n == x) {
                ans = true;
                break;
            }
        }
        System.out.println(ans);
        x = 0;
        ans = false;
        for (int n : arr3) {
            if (n == x) {
                ans = true;
                break;
            }
        }
        System.out.println(ans);
        //#4
        int[] arr4 = {1, 3, -6, 23, 14, 2};
        x = 23;
        for (int i = 0; i < arr4.length; i++) {
            if (x == arr4[i]) {
                System.out.println(i);
            }
        }
        x = 5;
        for (int i = 0; i < arr4.length; i++) {
            if (x == arr4[i]) {
                System.out.println(i);
            }
        }
        //#5
        int[] arr5 = {34, 82, 29, 30, 25, 40, 32, 31, 35, 410, 7};
        int n = 3;
        int m = 8;
        for (int i = 0; i < arr5.length; i++) {
            if (i >= n && i <= m) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.print("\n");
        arr5 = new int[]{1, 3, -6, 23, 14, 2};
        n = 1;
        m = 3;
        for (int i = 0; i < arr5.length; i++) {
            if (i >= n && i <= m) {
                System.out.print(arr5[i] + " ");
            }
        }
        System.out.print("\n");
        //#6
        int[] arr6 = {1, 3, -6, 23, 14, 2};
        x = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] < x) {
                x = arr6[i];
            }
        }
        System.out.println("Min value is " + x);
        x = arr6[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] > x) {
                x = arr6[i];
            }
        }
        System.out.println("Max value is " + x);
        //#7
        int[] arr7 = {1, 3, -6, 23, 14, 2};
        x = arr7[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] < x) {
                x = arr6[i];
            }
        }
        System.out.println("First min value is " + x);
        int k = x;
        x = arr7[0];
        for (int i = 1; i < arr6.length; i++) {
            if (arr6[i] < x && k != arr6[i]) {
                x = arr6[i];
            }
        }
        System.out.println("Second min value is " + x);
        //#8
        int[] arr8 = {1, 2, 3, 0, 4, 6};
        n = 0;
        for (int i = 0; i < arr8.length; i++) {
            for (int j = 0; j < arr8.length - 1 - i; j++) {
                if (arr8[j] < arr8[j + 1]) {
                    n = arr8[j];
                    arr8[j] = arr8[j + 1];
                    arr8[j + 1] = n;
                }
            }
        }
        for (int num : arr8) {
            System.out.print(num);
        }
        System.out.print('\n');
        //#9
        n = 2;
        m = 3;
        int[][] arr9 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr9[j][i] + " ");
            }
            System.out.print('\n');
        }
        System.out.print('\n');
        arr9 = new int[][]{
                {4, 2, 1},
                {2, 7, 2}
        };
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr9[j][i] + " ");
            }
            System.out.print('\n');
        }
        //#10
        n = 2;
        m = 3;
        int sum2 = 0;
        int[][] arr10 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                sum2 += arr10[i][j];
            }
        }
        System.out.println(sum2);
        //#11
        int[][] arr11 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        if (arr11.length == arr11[0].length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        arr11 = new int[][]{
                {10, 20},
                {40, 50}
        };
        if (arr11.length == arr11[0].length) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        //#12
        n = 5;
        int[][] arr12 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                arr12[i][j] = (i + 1) * (j + 1);
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr12[i][j] + " ");
            }
            System.out.print('\n');
        }
        //#13
        int[][] arr13 = {
                {10, 20, 30},
                {40, 50, 60}
        };
        x = arr13[0][0];
        for(int i = 0; i < arr13.length; i++){
            for(int j = 0; j < arr13[0].length; j++){
                if(x < arr13[i][j]){
                    x = arr13[i][j];
                }
            }
        }
        System.out.println("Max element is "+ x);
        x = arr13[0][0];
        for(int i = 0; i < arr13.length; i++){
            for(int j = 0; j < arr13[0].length; j++){
                if(x > arr13[i][j]){
                    x = arr13[i][j];
                }
            }
        }
        System.out.println("Min element is "+ x);
    }
}