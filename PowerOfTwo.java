class PowerOfTwo {
    public static void main(String args[]){
        int num = 16;
        System.out.println(IsPowerOfTwo(num));
    }
    public static boolean IsPowerOfTwo(int num){
        if(num == 0 ){
            return false;
        }
        while(num!=1){
            if(num % 2 != 0){
                return false;
            }
            else{
                num = num/2;
            }
        }
        return true;
    }
}