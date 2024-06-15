class Array1{
    public static void main(String[] args){
        int sum=0;
        int[] arr1=new int[]{2,5,6,7,8,9,23};
        for(int i:arr1){
            sum=sum+i;
        }
        System.out.println("Sum is:"+sum);
    }
}