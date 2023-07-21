public class Solution2 {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int rev_x = 0;
        int temp_x = x;
        while (temp_x != 0) {
            rev_x = (rev_x * 10) + (temp_x % 10);
            temp_x /= 10;
        }
        return rev_x == x;
    }
}
