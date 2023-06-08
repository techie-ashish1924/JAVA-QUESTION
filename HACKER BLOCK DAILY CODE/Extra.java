import java.util.*;

class Display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();
        int[][] arr = new int[M][N];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = sc.nextInt();

            }
        }
        Waveprint(arr);
    }

    public static void Waveprint ( int[][] arr){
            for (int row = 0; row < arr.length; row++) {
                if (row % 2 == 0) {
                    for (int col = 0; col < arr[0].length; col++) {
                        System.out.println(arr[row][col] + " ");
                    }
                } else {
                    for (int col = arr[0].length-1; col >= 0; col--) {
                        System.out.println(arr[row][col] + " ");
                    }
                }
            }
    }
}