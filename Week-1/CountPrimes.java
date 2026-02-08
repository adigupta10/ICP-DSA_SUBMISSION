class Solution {
    public int countPrimes(int n) {
       boolean[] vis=new boolean[n];
       if(n<3) return 0;
       Arrays.fill(vis,true);
       vis[0]=false;
       vis[1]=false;
       for(int i=2;i*i<n;i++){
            if(vis[i]){
                for(int j=i*i;j<n;j+=i){
                    vis[j]=false;
                }
            }
       } 
       int count=0;
       for(boolean i:vis){
        if(i) count++;
       }
       return count;
    }
}