import java.util.Scanner;

public class Piyush_and_Magical_Park {



    public static void Display(char arr[][])
    {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    

    public static void Find(char arr[][], int n, int m, int k, int s)
    {
        
        for(int i = 0;i<n;i++)
        {
            int step = -1;
            for (int j = 0; j < m; j++) {
                if (arr[i][j] == '#') {
                    step = -1;
                    break;
                } else if (arr[i][j] == '*') {
                    // step = -1;
                    s = s + 5 + step;
                    step = 0;

                } else if (arr[i][j] == '.') {
                    s = s - 2 + step;
                    step = -1;

                }

            }
            System.out.println("after " + (i + 1) + " row : " + s);
        }
        
        if(k > s)
        {
            System.out.println("NO");
        }
        else {
            System.out.println("Yes");
            System.out.println(s);
        }
    }



    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();
        int S = sc.nextInt();
        
        char arr[][] = new char[N][M];

        for(int i=0;i<N;i++)
        {
            for (int j = 0; j < M; j++) {
                arr[i][j] = sc.next().charAt(0);
            }
        }

        // Display(arr);

        Find(arr, N, M, K, S);
        

    }
    
}
