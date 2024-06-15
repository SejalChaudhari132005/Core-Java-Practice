class While_loop1{
    public static void main(String[] args){
        int i=30;
        int j=0;
        int sum=0;
        while(j<=i){
            sum=sum+j;
            j++;
        }
        System.out.println("Sum of "+i+" natural numbers is:"+sum);
    }
}