class NewString{
    public static void main(String[] args){
        String s1=new String("      Hello, my name is Sejal            ");
        System.out.println(Edit(s1));
    }

    static String Edit(String s1){
        String result=s1.trim();
        result=result.replace('l','o');
        return result.toUpperCase();
    }
}