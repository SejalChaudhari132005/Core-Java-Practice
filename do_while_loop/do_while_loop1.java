class do_while_loop1{
    public static void main(String[] args){
        int i=30;
        int j=0;
        int sum=0;
        do{
            sum=sum+j;
            j++;
        }while(j<=i);
        System.out.println("Sum of "+i+" natural numbers is:"+sum);
    }
}