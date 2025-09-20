class MoveZeros {
    public static void main(String args[]) {
        int nums[] = {0,1,3,0,8};
        moveZeroes(nums); 
        for (int i=0;i<nums.length;i++) {
            System.out.print(nums[i]+ " ");
        }
        
    }
    public static void MoveZeroes(int nums[]){
        int count =0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[count++] = nums[i];
            }

        }
        while(count<nums.length){
            nums[count++] = 0;

        }
    }

}





