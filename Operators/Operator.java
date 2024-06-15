class Operator{
    public static void main(String[] args){
        int a=23;
        int b=20;
        String str1="hi";
        String str2="hiii";
        String str3="hi";

        System.out.println("Arithmetic Operations");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        System.out.println("Relational Operations");
        System.out.println(a==b);
        System.out.println(a!=b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a>b);
        System.out.println(a<b);

        System.out.println(str1==str2);
        System.out.println(str1==str3);
        System.out.println(str1!=str3);

    }
}