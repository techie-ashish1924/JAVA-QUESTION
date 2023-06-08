public class Count_Repeated_Character {



    public static int Count(String s)
    {
        int arr[] = new int[128];
        int sum = 0;

        for(int i = 0 ;i <s.length();i++)
        {

            arr[s.charAt(i) - 'a']++;
            // if (arr[s.charAt(i) - 'a'] > 1) {
            //     sum++;

            // }
        }
        
        for (int i = 0; i < arr.length; i++)
        {
            if(arr[i] == 1)
            {
                sum++;
            }
        }
        return sum;
    }




    public static void main(String[] args) {
        
        String s = "alphaadida";

        // String s = "amcam";

        System.out.println(Count(s));
    }
    
}
