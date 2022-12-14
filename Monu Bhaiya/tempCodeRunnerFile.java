 public static int res = Integer.MAX_VALUE;
    public static int f = 1;
    public static void Count(int arr[],int curr_ind,int curr,int targ,String ans)
    {
        if(curr == targ)
        {
            f = 0;
            // System.out.println("Length of ans ");
            res = Math.min(res,ans.length());
            // System.out.println(ans);
            // return res;
            return;
            // break;
        }

        if(curr > targ)
        {
            return;
        }

        int sum = 0;
        for (int i = curr_ind ;i < arr.length; i++) {
            Count(arr,curr_ind, curr + arr[i], targ,ans + arr[i]);
        }

        // return res;
    }