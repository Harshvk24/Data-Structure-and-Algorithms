public class topdown {

        private int waysToGetNTopDown(int[]dp,int n){
            if(n==0 || n==1 || n==2){
                return 1;
            }
            if(n==3){
                return 2;
            }
            if(dp[n]==0){
                int sp1 =waysToGetNTopDown(dp,n-1);
                int sp2 =waysToGetNTopDown(dp,n-3);
                int sp3 =waysToGetNTopDown(dp,n-4);
                dp[n]= sp1+sp2+sp3;
            }
            return dp[n];
        }

        public int waysToGetNTopDown(int n) {
            // TODO
            int[] dp = new int[n+1];
            int result = waysToGetNTopDown(dp,n);
            return result;
        }


}
