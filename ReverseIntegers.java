
class ReverseIntegers{
    public static void main(String args[]){
       System.out.println(reverseIntegers(321));
    }
    public static int reverseIntegers(int num){
        int rev=0;
        if(rev>Integer.MAX_VALUE || rev<Integer.MIN_VALUE){
              return 0;
        }
        while( num != 0){
            int digits=num % 10;
            rev = (rev*10) + digits;
            num =num/10;
        }
        return rev;
    }
}