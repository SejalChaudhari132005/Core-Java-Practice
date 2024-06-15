class Vehicle{
    private int totalWheels;
    private String color;

    Vehicle(int totalWheels,String color){
        this.totalWheels=totalWheels;
        this.color=color;
    }

    int getTotalWheels(){
        return this.totalWheels;
    }
    String getColor(){
        return this.color;
    }

    
}