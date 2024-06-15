class FindElement{
    public static void main(String[] args){
        int[] arr=new int[]{1,30,4,6,7,56,89};
        int target=11;
        int target1=7;
        System.out.println(Search(arr,target));
        System.out.println(BSearch(arr,target1));
    }
    static int Search(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            if(target==arr[i]){
                return i;  
            }
        }
        return -1;
    }

    static int BSearch(int []arr,int target1){
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target1<arr[mid]){
                end=mid-1;
            }else if(target1>arr[mid]){
                start=mid+1;
            }else{
                return mid;
            }
        }
        return -1;
    }
}