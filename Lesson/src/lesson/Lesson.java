package lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;  
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lesson {

    public static void main(String[] args) {

        String[] simpleArray1 = {"alma", "körte"};
        String[] simpleArray2 = new String[2];
        simpleArray2[0] = "alma";
        simpleArray2[0] = "körte";
        int a = simpleArray2.length;

        ArrayList<String> list = new ArrayList<String>();
        list.add("alma");
        list.add("körte");
        list.remove(0); 
        list.get(0); 
        list.indexOf("alma");  
        int b = list.size();

        ArrayList<Integer> listSzam = new ArrayList<Integer>();
        
        //Checked
        File file = new File("Ä://file.txt");
        try {
            FileReader fr = new FileReader(file);                                                    
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lesson.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
        
        }
       try{
           byte szam = 800;
       } catch(Exception e){
           System.out.println("Hiba" + e);
       }

        //Unchecked
        int tomb[] = {1, 2, 3, 4, 5};
        System.out.println(tomb[6]); 


       try{
           
       }catch(ExceptionType1 e1){
           
       }catch(ExceptionType2 e2){
           
       }catch(ExceptionType3 e3){
           
       }
        
        try {
            test();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lesson.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    private static void test() throws FileNotFoundException {
        File file = new File("Ä://file.txt");
        FileReader fr = new FileReader(file);
    }
}
