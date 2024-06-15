class For_loop4{
    //Fibonacci series
    public static void main(String[] args){
        int f1=0,f2=1;
        int t;
        int n=5;
        System.out.println(f1);
        System.out.println(f2);

        for(int i=1;i<=n-2;i++){
            t=f1+f2;
            System.out.println(t);
            f1=f2;
            f2=t;

        }
        
    }
}