import  calculator.Add;
import calculator.Sub;
import calculator.Multiply;
import calculator.Divide;

class Main{
    public static void main(String[] args){
        Add add=new Add(2,7);
        Sub sub=new Sub(2,8);
        Multiply mul=new Multiply(3,2.3);
        Divide div=new Divide(3,7);

        System.out.println(add.calculation());
        System.out.println(sub.calculation()); 
        System.out.println(mul.calculation()); 
        System.out.println(div.calculation()); 
    }
}