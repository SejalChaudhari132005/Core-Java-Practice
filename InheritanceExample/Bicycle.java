class Bicycle{
    int gear;
    int speed;

    Bicycle(int gear,int speed){
        this.setGear(gear);
        this.setSpeed(speed);
    }

   

    void setGear(int gear){
        this.gear=gear;
    }

    int getGear(){
        return gear;
    }
    void setSpeed(int speed){
        this.speed=speed;
    }

    int getSpeed(){
        return speed;
    }

   
    
}