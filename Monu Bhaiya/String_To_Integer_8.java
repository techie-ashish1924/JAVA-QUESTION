import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class String_To_Integer_8 {



    public static int Find(String s) {
        int ans = 0;

        int l = s.length() - 1;
        for (int i = 0; i < s.length(); i++) {
            ans = (s.charAt(i) - 48) * (int) Math.pow(10, l--) + ans;

        }
        return ans;

    }
    



    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // String s = sc.next();
        String s = "  -42";
        // String s = "--42";
        // String s = "1234 words i love ypu 856484";



        int flag = 0;
        String f = "";
        int sum = 0;
        s = s.replaceAll("\\s", "");

        for (int i = 0; i < s.length(); i++) {

            if (s.charAt(i) == '-' && flag == 0) {
                if (sum == 0) {
                    f = f + s.charAt(i);
                    sum++;
                } else {
                    break;
                }
            } else if ((s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag <= 0)) {
                f = f + s.charAt(i);
            } else {
                flag = 1;
            }

            // if ((s.charAt(i) >= '0' && s.charAt(i) <= '9' && flag <= 0)) {
            //     fDigit_ind = Math.min(fDigit_ind, i);
            //     f = f + s.charAt(i);
            // } 
            // else if(s.charAt(i) == '-' && flag <= 0)
            // {
            //     flag++;
            //     f = f + s.charAt(i);

            // } 
            // else {
            //     flag = 1;
            // }

        }
        
        // System.out.println("String is : " + f + " ans " + f.length());

        if (f.length() == 0) {
            // return 0;
            System.out.println(0);
        }

        else if (f.charAt(0) == '-') {
            // return Find(f.substring(1)) * -1;
            System.out.println(Find(f.substring(1)) * -1);
        } else {
            // return Find(f);
            System.out.println(Find(f));
        }

       
    }
}
