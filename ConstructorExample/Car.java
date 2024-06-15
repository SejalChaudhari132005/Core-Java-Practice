class Car{
    int id;
    String company;
    String color;
    int totalSeats;

    int getId(){
        return this.id;
    }
    void setId(int id){
        this.id=id;
    }

    String getCompany(){
        return this.company;
    }
    void setCompany(String company){
        this.company=company;
    }

    String getColor(){
        return this.color;
    }
    void setColor(String color){
        this.color=color;
    }

    int getTotalSeats(){
        return this.totalSeats;
    }
    void setTotalSeats(int totalSeats){
        this.totalSeats=totalSeats;
    }

    Car(){
        this.id=89;
        this.company="Ford";
        this.color="White";
        this.totalSeats=4;
    }
    
    Car(String company,String color){
        this.id=23;
        this.company=company;
        this.color=color;
        this.totalSeats=6;
    }

   
    
    Car(String company,String color,int totalSeats){
        this.id=90;
        this.company=company;
        this.color=color;
        this.totalSeats=totalSeats;
    }
    Car(int id,String company){
        this.id=id;
        this.company=company;
        this.color="White";
        this.totalSeats=4;
    }

}