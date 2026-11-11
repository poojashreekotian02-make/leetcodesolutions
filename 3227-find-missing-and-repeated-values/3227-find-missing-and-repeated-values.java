class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length, a = 0, b = 0;
        int[] c = new int[n*n+1];
        for(int[] r : grid)
            for(int x : r) c[x]++;
        for(int i=1; i<=n*n; i++) {
            if(c[i]==2) a=i;
            if(c[i]==0) b=i;
        }
        return new int[]{a,b};
    }
}