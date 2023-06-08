
import java.util.*;

public class Valentine_Magic {

    public static int MinDiff(int boy[],int girl[],int i,int j)
    {

        if(i == boy.length)
        {
            return 0;
        }

        if(j == girl.length)
        {
            return 10000000;
        }


        int pair  = Math.abs(boy[i] - girl[i]) + MinDiff(boy, girl, i+1, j+1);

        int nopair = MinDiff(boy, girl, i, j+1);

        return Math.min(pair, nopair);

    }


    public static void main(String[] args) {
        
        int n = 2;
        int m = 5;

        int boys[] = {1,11,3};
        int girls[] = {5,7,3,2};

        Arrays.sort(boys);
        Arrays.sort(girls);

        System.out.println(MinDiff(boys, girls, 0, 0));


    }
    
}
