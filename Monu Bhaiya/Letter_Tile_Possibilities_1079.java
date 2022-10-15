import java.util.Scanner;

public class Letter_Tile_Possibilities_1079 {

    public static int Posibility(int freq[],String ans)
    {
        int count = 0;
        // if(ans.length()!=0)
        // {
            // System.out.println(ans);
        // }
        
        for (int i = 0; i < freq.length; i++) {
            if(freq[i] >= 1)
            {
                char ch = (char)(i+'A');
                freq[i]--;
                count  = count + Posibility(freq, ans+ch) + 1;;
                freq[i]++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int freq[] = new int[26];
        String a = sc.nextLine();
        for (int i = 0; i < a.length(); i++) {

            freq[a.charAt(i)-65]++;
            // freq[a.charAt(i)-'A']++;
        }

        System.out.println(Posibility(freq, ""));
        // Posibility(freq, "");
        // for (int i = 0; i < freq.length; i++) {
            // System.out.println(freq[i]);
        // }
    }
    
}
