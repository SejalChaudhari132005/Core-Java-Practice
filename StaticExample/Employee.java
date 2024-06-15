class Employee{
   

    String id;
    String name;
    static int counter=0;

    Employee(String name){
        counter++;
        this.name=name;
        this.id="emp"+counter;
        
    }
}