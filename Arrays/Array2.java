class Array2{
    public static void main(String[] args){
        int[] arr2=new int[]{1,3,5,6,7,8,9,10};
        int target=7;
        for(int i:arr2){
            if(target==i){
                System.out.println("Array contains "+target);
            }
        }

    }
}