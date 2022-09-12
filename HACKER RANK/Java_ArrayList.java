import java.util.ArrayList;
import java.util.Scanner;

import javax.sound.midi.SysexMessage;

public class Java_ArrayList {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr[] = new ArrayList[n];
         

        for(int i=0;i<n;i++)
        {
            int a = sc.nextInt();
            for(int j=0;j<a;j++)
            {
                arr[i].add(sc.nextInt());
            }
        }

        int querr = sc.nextInt();
        ArrayList<Integer> quer[] = new ArrayList[querr];
        for(int i=0;i<querr;i++)
        {
            for(int j=0;j<2;j++)
            {
                quer[i].add(sc.nextInt());
            }
        }
        for(int i=0;i<querr;i++)
        {

            int row = (int) quer.get(i).get(0);
            // if(quer.get(i,0) 
            // {

            // }
        }

        for(int i=0;i<n;i++)
        {
            
        }
    }
    
}
