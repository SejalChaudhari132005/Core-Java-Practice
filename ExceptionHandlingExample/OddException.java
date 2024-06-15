class OddException{
    int n;
    

    OddException(int n){
        this.n=n;
        try{
            if(n%2==0){
            System.out.println(n+" is an even number");
            }else{
                throw new MyException("Number is odd"); 
            }
        }catch(MyException e){
            System.out.println("Exception occured");
            System.out.println("Error:"+e.getMessage());
        }
}
}