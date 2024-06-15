class Operations{
    public static void main(String[] args){
        System.out.println(Operation("Add",1,5,6,7,8,3,4,9));
        System.out.println(Operation("Sub",1,2));
        System.out.println(Operation("Mul",4,5,2,0));
        System.out.println(Operation("xYZ",5,8,9,3,1,2));
    }
    static long Operation(String op,int ...a){
        int sum=0;
        int sub=0;
        long mul=1;
        
        if(op=="Add"){
            for(int i:a){
                sum=sum+i;
            }
            return sum;

        }else if(op=="Sub"){
            for(int i:a){
                sub=sub-i;            
                }
                return sub;

        }else if(op=="Mul"){
            for(int i:a){
                mul=mul*i;
            }
            return mul;
        }else{
            System.out.println("Operation invalid");
        }
        return 0;

    }
}