class secondlargest{
    public static void main(String [] args){
        int arr[]={10,23,4,32,76};
        int largest=arr[0];
        for(int i = 1 ;i < arr.length;i++){
            if(arr[i]  > largest ){
                largest=arr[i];
            }
        }
       int secondLrg=-1;
       for(int i =0;i<arr.length;i++){
        if(arr[i] > secondLrg && arr[i]!=largest){
            secondLrg=arr[i];
        }
     }
       System.out.println("second largrest element: "+secondLrg);
    }
}

