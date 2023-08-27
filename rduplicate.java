## Remove the duplicate from  the sorted array with elements at most two


  ##  code

  class rduplicate{
    public int relement(int [] nums){
      int j = 1;
      for(int i = 0;i<nums.length<i++){
        if(nums[j-1]!=nums[i]{
          nums[++j] = nums[i];
        }
      }
      return j+1;
    }
}
