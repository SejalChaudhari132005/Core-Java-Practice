class Preferance{
    //Preferance: int, long, Integer, int ... 
    //For byte and short use------> (byte)10/(short)10
    
    public void print(Integer i){
        System.out.println("Integer");
    }
    
    public void print(int i){
        System.out.println("int");
    }
    
    public void print(int ...i){
        System.out.println("int ...");
    }
    
    public void print(byte i){
        System.out.println("byte");
    }

    public void print(short i){
        System.out.println("short");
    }
    
    public void print(long i){
        System.out.println("long");
    }
    
    public void print(double i){
        System.out.println("double");
    }
    
}