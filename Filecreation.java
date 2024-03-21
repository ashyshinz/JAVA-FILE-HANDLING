import java.io.File;
import java.io.IOException;

class Filecreation {
    public static void main(String[] args){

        System.out.println("Hello AJ!");
        File textFile = new File("main.txt");
        
        try {

           if(textFile.createNewFile()){
            System.out.println("File Successfully!");
           }else {
            System.out.println("File Already Exists");
        
           }
           
        } catch (IOException e) {

            System.out.println("Nag error lagi siya");
        }
    }
}
