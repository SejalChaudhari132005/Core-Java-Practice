class Factorial{
    public static void main(String[] args){
        System.out.println(Fact(6));
        System.out.println(Fact(3));
}
    static int Fact(int n){
        int fact=1;
        for(int i=n;i>=1;i--){
            fact=fact*i;
        }
        return fact;
    }
}