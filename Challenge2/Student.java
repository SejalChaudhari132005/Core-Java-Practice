
class Student{
      String name;
      int age;

    Student(String name,int age){
        this.name=name;
        this.age=age;
    }

    String getName(){
        return this.name;
    }

    int getAge(){
        return this.age;
    }


    void  ShowStudent(){
        System.out.println("Name:"+getName()+", age:"+getAge());
    }

}