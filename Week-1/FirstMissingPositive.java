class Solution {
    public int firstMissingPositive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();
        int ans=1;
        for(int i:nums){
            s.add(i);
        }
        while(s.contains(ans)){
            ans++;
        }
        return ans;
    }
}

// int n=nums.length;
//         int j=0;
//         while(j<n){
//            int correctindex=nums[j]-1;
//            if(nums[j]>0 && nums[j]<=n  && nums[j]!=nums[correctindex]){
//                 int temp=nums[j];
//                 nums[j]=nums[correctindex];
//                 nums[correctindex]=temp;
//            }
//            else{
//             j++;
//            }
//         }
//         for(int k=0;k<n;k++){
//             if(nums[k]!=k+1){
//                 return k+1;
//             }
//         }
//         return n+1;