import java.util.*;

public class Gas_Station {

    
    public static int Find_Index(int gas[],int cost[])
    {
        int currentGas = 0;
        int totalGas = 0;
        int currentIndex =0;

        for(int i = 0;i<gas.length;i++)
        {
            currentGas = currentGas + (gas[i] - cost[i]);
            totalGas = totalGas + ( gas[i] - cost[i] );

            if(currentGas < 0)
            {
                currentIndex = i + 1;
                currentGas = 0;

            }
        }

        if(totalGas <= 0)
        {
            return currentIndex;
        }
        else{
            return -1;
        }
    }


    public static void main(String[] args) {
        


        Scanner sc = new Scanner(System.in);

        int gas[] = { 1, 2, 3, 4, 5 };
        int cost[] = { 3, 4, 5, 1, 2 };

        System.out.println(Find_Index(gas, cost));
    }
    
}
