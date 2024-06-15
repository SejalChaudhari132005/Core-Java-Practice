class Main1{
    public static void main(String[] args){

        Car c=new Car();
        c.setId(56);
        c.setCompany("Nexa");
        c.setColor("Black");
        c.setTotalSeats(7);
        
        System.out.println(c.getId());
        System.out.println(c.getCompany());
        System.out.println(c.getColor());
        System.out.println(c.getTotalSeats());

        Car c1=new Car("Maruti Suzuki","Red");
        System.out.println(c1.getId());
        System.out.println(c1.getCompany());
        System.out.println(c1.getColor());
        System.out.println(c1.getTotalSeats());

        Car c2=new Car(56,"White");
        System.out.println(c2.getId());
        System.out.println(c2.getCompany());
        System.out.println(c2.getColor());
        System.out.println(c2.getTotalSeats());

        Car c3=new Car("Ford","Blue",4);
        System.out.println(c3.getId());
        System.out.println(c3.getCompany());
        System.out.println(c3.getColor());
        System.out.println(c3.getTotalSeats());

        Car c4=new Car();
        System.out.println(c4.getId());
        System.out.println(c4.getCompany());
        System.out.println(c4.getColor());
        System.out.println(c4.getTotalSeats());

        Car c5=new Car(10,"Tata");
        System.out.println(c5.getId());
        System.out.println(c5.getCompany());
        System.out.println(c5.getColor());
        System.out.println(c5.getTotalSeats());


    }
}