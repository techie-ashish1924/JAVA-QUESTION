import java.util.Scanner;

public class Extra {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int total_star = 2 * n - 1;
        int row = 1;

        while (row <= n) {
            if (row == 1) {
                int st = 1;
                while (st <= total_star) {
                    System.out.print("* ");
                    st++;
                }

            } else {
                // System.out.println("value of row : " + row);

                int space = 2 * row - 3;
                int starPrinting = total_star - space;
                int left_star = starPrinting / 2;

            //  left star print

            int st_left = 1;
                // System.out.println("value of total space : " + space );

                while (st_left <= left_star) {
                    System.out.print("* ");
                    st_left++;
                }

                // Space print 

                int sp = 1;

                while (sp <= space) {
                    System.out.print("  ");
                    sp++;
                }

                // right star print.

                int st_right = left_star + 1;

                while (st_right <= starPrinting) {
                    System.out.print("* ");
                    st_right++;
                }

            }

            row++;
            System.out.println();

        }
    }

}
