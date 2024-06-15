class For_loop3{
    public static void main(String[] args){
        int n=100;
        System.out.println("Numbers divisible by 3 till "+n+" natural numbers are:");
        for(int i=0;i<=n;i++){
            if(i%3==0){
                System.out.println(i);
            }
        }
    }
}