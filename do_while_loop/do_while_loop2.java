class do_while_loop2{
    public static void main(String[] args){
        int i=6;
        int fact=1;
        do{
            fact=fact*i;
            i--;
        }while(i>=1);
        System.out.println("Factorial of 6 is:"+fact);
    }
}