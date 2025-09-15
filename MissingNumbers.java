public class MissingNumbers{
    public static void main(String[]args){
        int nums[]={9,0,2,4,3,5,6,7,8};
        System.out.println(MissingNumbers(nums));

    }
    public static int MissingNumbers(int nums[]){
        int sum=0;  
        for(int i=0;i<nums.length;i++){
            sum=sum+nums[i];
        }
        int actualSum=(nums.length*(nums.length+1))/2;
        int missingnum=actualSum-sum;
        return missingnum;
    }
}