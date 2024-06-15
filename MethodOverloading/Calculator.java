class Calculator{
     
    static int Add(int a,int b){
        return a+b;
    }

    static int Add(int a,int b,int c){
        return a+b+c;
    }

    static int Add(int ...a){
        int sum=0;
        for(int i:a){
            sum=sum+i;
        }
        return sum;
    }
}