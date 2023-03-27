public class K_Items_With_the_Maximum_Sum {


    public static int kItemsWithMaximumSum(int numOnes, int numZeros, int numNegOnes, int k) {

        int ans = 0;

        while (numOnes > 0 && k > 0) {
            ans += 1;
            k--;
            numOnes--;
        }

        while (numZeros > 0 && k > 0) {
            ans += 0;
            k--;
            numZeros--;
        }

        while (numNegOnes > 0 && k > 0) {
            ans -= 1;
            k--;
            numNegOnes--;
        }

        return ans;

    }



    public static void main(String[] args) {


        int numOnes = 3;
        int numZeros = 2;
        int numNegOnes = 4;
        int k = 6;

        System.out.println(kItemsWithMaximumSum(numOnes, numZeros, numNegOnes, k));
        

    }
    
}
