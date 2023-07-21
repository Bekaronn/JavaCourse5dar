public class Solution3 {
    public int numberOfSteps(int num) {
        int ans = 0;
        while(num!=0){
            if(num%2 == 0){
                num/=2;
            } else {
                num--;
            }
            ans+=1;
        }
        return ans;
    }
}
