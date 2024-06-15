class Max_Min{
    public static void main(String[] args){
        int[] arr=new int[]{43,3,4,56,0,8};
        int m1=arr[0];
        int m2=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>m1){
                m1=arr[i];
            }
            if(arr[i]<m2){
                m2=arr[i];
            }
        }
        System.out.println("Maximum is:"+m1);
        System.out.println("Minimum is:"+m2);
    }
}