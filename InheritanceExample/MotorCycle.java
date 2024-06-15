class MotorCycle extends Bicycle{
    int seatHeight;

    void setHeight(int seatHeight){
        this.seatHeight=seatHeight;
    }
    int getHeight(){
        return this.seatHeight;
    }

    MotorCycle(int gear,int speed,int height){
        super(gear,speed);
        this.setHeight(height);
    }

    

}