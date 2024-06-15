class Main1{
    public static void main(String[] args){
        Student s1=new Student();
        Student s2=new Student();
        Student s3=new Student();
        s1.name="Sejal";
        s1.age=1;
        s1.id=12;
        
        s2.name="Nikhil";
        s2.age=0;
        s2.id=35;

        s3.name="Sayali";
        s3.age=3;
        s3.id=11;
        
        if(s1.age>s2.age && s1.age>s3.age){
            System.out.println(s1.getName()+" is oldest");
        }else if(s2.age>s3.age && s2.age>s1.age){
            System.out.println(s2.getName()+" is oldest");
        }else{
            System.out.println(s3.getName()+" is oldest");
        }
        
        if(s1.age<s2.age && s1.age<s3.age){
            System.out.println(s1.getName()+" is youngest");
        }else if(s2.age<s3.age && s2.age<s1.age){
            System.out.println(s2.getName()+" is youngest");
        }else{
            System.out.println(s3.getName()+" is youngest");
        }

        
    
    }
    
}