class Solution {
    public boolean canBe(int[] nums,int val,int k){
    int cows=1;
    int pos=0;
    for(int i=1;i<nums.length;i++){
    if(nums[i]-nums[pos]>=val){
        pos=i;
        cows++;
        if(cows==k) return true;
    }
    }
    if(cows==k)
    return true;
    else
    return false;
    }

    public int aggressiveCows(int[] nums, int k) {
   int low=1;
   Arrays.sort(nums);
   int high=nums[nums.length-1]-nums[0];
   
   int ans=0;
   while(low<=high){
    int mid=low+(high-low)/2;
    boolean check=canBe(nums,mid,k);
    if(check){
        ans=mid;
        low=mid+1;
    }
    else
    high=mid-1;
   }
   return ans;
    }
}
