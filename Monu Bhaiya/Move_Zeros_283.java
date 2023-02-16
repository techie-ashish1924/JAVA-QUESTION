import java.util.Scanner;

public class Move_Zeros_283 {


    public void Swap(int arr,int e1,int e2)
    {
        int temp = e2;
        e2 = e1;
        e1 = temp;
    }

    public static void Display(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }



    public static void Move(int arr[])
    {

        int ind = 0;
        int zero_ind = 0;

        while(ind < arr.length)
        {
            if (arr[ind] != 0) {
                int temp = arr[ind];
                arr[ind] = arr[zero_ind];
                arr[zero_ind] = temp;
                ind++;
                zero_ind++;

            } else {
                ind++;
            }
        }

        System.out.println("Display function call inside the function : ");
        Display(arr);
        
    

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int arr[] = { 0, 1, 0, 3, 12 };

        Move(arr);
        System.out.println("Display function call inside the main function");
        Display(arr);


    }
    
}
