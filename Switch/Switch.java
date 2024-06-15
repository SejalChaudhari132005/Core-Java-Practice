class Switch{
    public static void main(String[] args){
        int a=20;
        int b=40;
        System.out.println(a+b+"is Addition");
        System.out.println("Addition is"+a+b);
        System.out.println("Addition is"+(a+b));
        String operation="modulus";
        switch(operation){
            case "addition":
                System.out.println("Addition of two numbers"+(a+b));
                break;
            case "subtraction":
                System.out.println("Subtraction of two numbers"+(a-b));
                break;
            case "multiplication":
                System.out.println("Multiplication of two numbers"+(a*b));
                break;
            default:
                System.out.println("No operation supported");   

        }
    }
}