import java.util.Scanner;
class Student{
    String studentName;
    int studentAge;
    char studentGender;
    
    Student(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student name:");
        studentName=sc.nextLine();
        System.out.println("Enter Student age:");
        studentAge=sc.nextInt();
        try{
            if(studentAge<18){
                throw new MyException("Age is less than 18");
            }else{
                System.out.println("Valid age");
                System.out.println("Enter Student gender(M/F/O):");
                studentGender=sc.next().charAt(0);
                System.out.println("Name:"+studentName);
                System.out.println("Age:"+studentAge);
                System.out.println("Gender:"+studentGender);

            }
        }catch(MyException e){
                System.out.println("Exception has occured");
                System.out.println("Error:"+e.getMessage());
                e.printStackTrace();
            }
    } 
}   