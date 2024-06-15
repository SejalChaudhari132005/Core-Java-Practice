class Conditions{
    public static void main(String[] args){
        int age=-6;
        if(age<18 && age>0){
            System.out.println("Not eligible for voting");
        }else if(age>=18){
            System.out.println("Eliglible for voting ");
        }
        else{
            System.out.println("wrong age");
        }
    }
}