class Main{
    public static void main(String[] args){
       
        try{
            int ans=5/0;
            System.out.println(ans);
        }catch(ArithmeticException e){

            System.out.println(e);
            System.out.println("Cannot divide by zero");
        }
        
        try{
            int[] arr=new int []{1,5,6,7};
            System.out.println(arr[10]);
        }catch(IndexOutOfBoundsException e){
            e.getMessage();
            System.out.println(e);//exception name and message
            e.printStackTrace();//exception name,message and line at which error occured
        }
       
        try{
            String str="Sejal";
            System.out.println(str.charAt(0));
       }catch(Exception e){
            System.out.println("Exception has occured");
            System.out.println(e);
            e.printStackTrace();
       }
        
    }
        
}