public class MinimumCostMatrix {
    public int minCost(int[][] array,int row, int col){
        if(row==-1 || col==-1){
            return -1;
        }
        if(row==0 && col==0){
            return array[0][0];
        }
        int mc1=minCost(array,row,col-1);
        int mc2=minCost(array,row-1,col);
        int mc = Integer.min(mc1,mc2);
        return mc+array[row][col];
    }
}
