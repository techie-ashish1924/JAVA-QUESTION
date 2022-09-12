import java.util.*;
class Main {
    public static int Valid_Gas_Station(int gas[],int cost[])
    {
        // Here current value index show that how many difference between present gast at station and required gas by the car. 
        int curr_val = 0;
        int sum = 0;
        int ind = 0;

        for(int i=0;i<gas.length;i++)
        {
            // here we calculate the total sum of difference between present gas at station  and requuired gas by the car.
            
            sum += gas[i] - cost[i];

            // curr_val shows the difference between present gas at station and required gas by the car.

            curr_val += gas[i] - cost[i];

            // If cuur_val < 0 then we can not travel required distance so we can not start your travelling with this index.
            // we will try to start travelling with next station
            if(curr_val < 0)
            {
                curr_val = 0;
                ind = i;
            }
        }
        if(sum < 0)
        {
            return -1;
        }
        else{
            return ind+1;
        }
    }
    public static void main(String args[]) {
         Scanner sc = new Scanner(System.in);
         int n_gas = sc.nextInt();
         int gas[] = new int[n_gas];
         for(int i=0;i<n_gas;i++)
         {
             gas[i] = sc.nextInt();
         }
         int n_cost = sc.nextInt();
         int cost[] = new int[n_cost];
         for(int i=0;i<n_cost;i++)
         {
             cost[i] = sc.nextInt();
         }

         System.out.println(Valid_Gas_Station(gas,cost));

     }
}