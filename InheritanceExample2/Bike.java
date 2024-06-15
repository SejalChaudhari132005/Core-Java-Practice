class Bike extends Vehicle{

    private String engine;
    Bike(int totalWheels,String color,String engine){
        super(totalWheels,color);
        this.engine=engine;
    }

    String getEngine(){
        return engine;
    }

   
}