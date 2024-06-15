class Maximum{
    public static void main(String[] args){
        int [] arr=new int[]{2,5,7,4,9};
        System.out.println(Max(arr));
    }

    static int Max(int [] arr){
        int max=arr[0];
        for(int i:arr){
            if(i>max){
                max=i;
            }
        
    }
    return max;
    }
}