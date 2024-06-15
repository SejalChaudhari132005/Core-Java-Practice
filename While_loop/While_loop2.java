class While_loop2{
    public static void main(String[] args){
        int n=6;
        int fact=1;
        while(n>=1){
            fact=fact*n;
            n--;
        }
        //n becomes 0 after while loop
        // dont use n in final statement
        System.out.println("Factorial of "+6+" is:"+fact);
    }
}