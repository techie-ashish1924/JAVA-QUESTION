


public class Occurrences_After_Bigram_1078 {



    public static String[] OccuranceString(String text,String first,String second)
    {
        String arr[] = text.split(" ");

        String res[] = new String[arr.length];
        int resIndex = 0;
        for (int i = 0; i < arr.length - 1; i++) 
        {
            // System.out.println("value of  : " + i);
            if (arr[i].compareTo(first) == 0 && arr[i + 1].compareTo(second) == 0) 
            {
                if (i < arr.length - 2) 
                {
                    // System.out.println("value of  : " + arr[i+2]);
                    res[resIndex++] = arr[i + 2];
                }
            }
        }
        Display(res);
        return res;
    }

    
    public static void Display(String arr[])
    {
        for(int i=0;i<arr.length;i++)
        {
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        

        String ans =  "alice is a good girl she is a good student" ;
        String first = "a";
        String second = "good";

        System.out.println(OccuranceString(ans, first, second));

    }



    
    
}
