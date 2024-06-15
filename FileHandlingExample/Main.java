import java.io.FileReader;
import java.io.FileWriter;
//FileWriter->inbuild class in java.io  package
class Main{
    public static void main(String[] args){
        String str="Lets create a file and write a file";
        int ch;
        FileWriter fw=null;
        try{
            fw=new FileWriter("output.txt");
            for(int i=0;i<str.length();i++){
                fw.write(str.charAt(i));
            }
            fw.close(); //If not closed it will lead to memory leak
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        FileReader fr=null;
        try{
            fr=new FileReader("output.txt");
            while((ch=fr.read())!=-1){
                System.out.println((char)ch);       //(char)c is known as typecasting    
                }
            fr.close();    
        }catch(Exception e){
            System.out.println(e);
            e.printStackTrace();
        }

        
    }
}