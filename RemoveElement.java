class RemoveElement{
    public static void main(String args[]){
        int nums[]={0,1,2,2,3,0,4,2};
        int value=2;
        System.out.println(removeElement(nums,value));
    }
    public static int removeElement(int nums[],int value){
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] != value){
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}