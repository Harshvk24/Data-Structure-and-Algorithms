public class LongestPalindromicSubsequence {
    private int findLPS(String s, int startIndex,int endIndex){
        if(startIndex>endIndex){
            return 0;
        }
        if(startIndex==endIndex){
            return 1;
        }
        int c1=0;
        if(s.charAt(startIndex)==s.charAt(endIndex)){
            c1= 2+findLPS(s,startIndex+1,endIndex-1);
        }
        int c2=0;
        c2 = findLPS(s,startIndex+1,endIndex);
        int c3 = findLPS(s,startIndex,endIndex-1);
        return Math.max(c1,Math.max(c2,c3));
    }
    public int findLPS(String s){
        return findLPS(s,0,s.length()-1);
    }
}
