class Array3{
    public static void main(String[] args){
    int[] arr3=new int[]{5,6,7,8,9,10};
    arr3[3]=56;
    int arr[]=new int[arr3.length+1];
    /*for(int i=0;i<arr3.length;i++){
        System.out.println(arr3[i]);
    }*/
    for(int k=0;k<arr3.length;k++){
        arr[k]=arr3[k];
    }
    arr[arr3.length]=67;
    for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
    }
}
}