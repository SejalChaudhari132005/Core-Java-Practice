class Main{
    public static void main(String[] args){
        Employee e1=new Employee();
        e1.name="Aditya";
        e1.id=12;
        e1.salary=20000;
        e1.designation="Senior Assistant";
        
        System.out.println("Details of employee 1:");
        System .out.println("ID:"+e1.id);
        System.out.println("Name:"+e1.getName());
        System.out.println("Salary:"+e1.getSalary());
        System.out.println("Designation:"+e1.designation);

        Employee e2=new Employee();
        e2.name="Samiksha";
        e2.id=45;
        e2.salary=80000;
        e2.designation="Analyst";

        System.out.println("Details of employee 2:");
        System .out.println("ID:"+e2.id);
        System.out.println("Name:"+e2.getName());
        System.out.println("Salary:"+e2.getSalar0ssy());
        System.out.println("Designation:"+e2.designation);

        if(e1.salary>e2.salary){
            System.out.println("Id with "+e1.id+" has maximum salary");
        }else{
            System.out.println("Id with "+e2.id+" has maximum salary");
        }

    }
}