class Reverse{
    public static void main(String[] args){
        int[] arr=new int[]{2,5,6,3,9};
        int[] arr1=new int[arr.length];
        //int start=0;
        int end=arr1.length-1;
        for(int i=0;i<arr.length;i++){
            arr1[i]=arr[end];
            end--;
        }
        System.out.println("Reverse of array is:");
        for(int j=0;j<arr1.length;j++){
            System.out.print(arr1[j]+" ");
        }
        

    }
}