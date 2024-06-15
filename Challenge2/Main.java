import java.util.*;


class Main{
    public static void main(String[] args) {
        ArrayList<Student> studentlist=new ArrayList<>();
        
        int enter;
        do{
            System.out.println("1.Add Student");
            System.out.println("2.Show Student List");
            System.out.println("3.Exit");
            Scanner sc=new Scanner(System.in);
            enter=sc.nextInt();

            switch(enter){
                case 1:
                    System.out.println("Please enter student name:");
                    String name=sc.next();
                    System.out.println(name);
                    
                    System.out.println("Please enter student age:");
                    int age=sc.nextInt();
                    Student s1=new Student(name,age);
                    studentlist.add(s1);
                break;

                case 2:
                   
                    for(Student s:studentlist){
                        s.ShowStudent();
                    }
            break;

            case 3:
                System.out.println("Exited");
            break;

            default:
                System.out.println("Wrong input");
        }
        }
        while(enter<3);
            

        
        

        
    }
}