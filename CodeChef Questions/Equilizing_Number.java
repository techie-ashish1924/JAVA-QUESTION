
import java.util.*;
public class Equilizing_Number {
    

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        while(n>0)
        {
                int a = sc.nextInt();
                int b = sc.nextInt();

                if(a >= 0 && b >= 0)
                {
                    if(a==b)
                    {
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                }
                else if ( a<0 || b < 0){

                    if(a<0)
                    {
                        if(b == a*-1)
                        {
                            System.out.println("yes");
                        }
                        else{
                            System.out.println("no");
                        }
                    }
                    else if(b<0){

                        if(a == b*-1)
                        {
                            System.out.println("yes");
                        }
                        else{
                            System.out.println("no");
                        }

                    }

                }



            n -= 1;
        }
    }
    
}
