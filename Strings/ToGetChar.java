class ToGetChar{
    public static void main(String[] args){
        String s1= new String("Hello World");
        String s2=new String(" My name is Sejal!!!");
        
        System.out.println(s1.charAt(3));
        System.out.println(s1.concat(s2));
        System.out.println(s2.concat(s1));
        System.out.println(s1.toUpperCase());
        System.out.println(s2.toLowerCase());
        System.out.println(s2.replace('e','u'));
        //Can use wild characters for searching
        System.out.println(s2.replaceAll(" My","Hi"));
        
}
}