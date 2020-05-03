package lesson;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;  //ha saját osztályt csinálok egy másik package-ben, akkor hogy itt is tudjam használni
import java.util.logging.Level;
import java.util.logging.Logger;
//ehhez hasonlóan be kel importálnom (packgage name + class name)

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
        list.remove(0); //alma törlése ---> ez után a körte lesz az új első, nem statikus
        list.get(0); //így kapjuk meg az elem értékét
        list.indexOf("alma");  //hányadik elem
        int b = list.size(); // a length megfelelője

        ArrayList<Integer> listSzam = new ArrayList<Integer>();

        /*Különbség Array és ArrayList között:
        Array: meg kell mondanunk mekkora lesz a mérete, statikus, ha törlök belőle az érték helye ott marad üresen,
                nem megy össze a tömb, tud tárolni primitivet
                tud multidimenziós lenni pelda[0][1]
        ArrayList: nem statikus a mérete, sorba lehet egyszerűen redezni, sok beépített függvény
                    primitivet nem tud tárolni, tehát ha int-et aarunk Integer-t kell megadni
                    nem lehet multidimenziós
        Sok esetben az array a gyorsabb, de nem mindig, feladattól függ       
         */
 /*Hibakezelés:
            Javan belül van a Throwable osztály, amin belül az Error és Exception
            --Hibákkal nem foglalkozunk: rajtunk kívül álló okok: pl felhasználó gépe amin fut a JVM, nem rendelkezik
                elég memóriával, ami kell az én programomhoz. 
            --Exception: Két részből állnak, 
                a. Checked Exceptions --> fordítási idejű hibák, ezeket le kell kezelni, különben nem fordul le a
                    kód
                b. Unchecked Exceptions --> futás idejű hibák      
         */
        //Checked
        File file = new File("Ä://file.txt");
        try {
            FileReader fr = new FileReader(file);   //van egy nem kezelt exception-je---> mi legyen ha nem találja a file-t                                                   //le sem fut amíg nem kezelem
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lesson.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            //nem kötelező: akár a try akár a catch futott le, amit ide írok az jön utána, mindig lefut          
        }
//        try{
//            byte szam = 800;
//        } catch(Exception e){
//            System.out.println("Hiba" + e);
//        }

        //Unchecked
        int tomb[] = {1, 2, 3, 4, 5};
        System.out.println(tomb[6]);  //olyat akarok kiiratni ami nincs, nem fog lefutni

        //pl. null pointer exception: Létrehozok egy új Cat-et , de nem állítok be neki nevet--> null lesz
        //majd ezt megpróbálom összehasonlítani egy névvel
        //if(cat.getName().equals("Aladár")) --> itt valójában a null-ra hívok equals-t
        //try catch ilyen esetere is jó
        //vagy pl ellenőrzések: cat != null; cat,getName() != null
        //egy try hoz lehet különböző catch ágakat tenni:
//        try{
//            
//        }catch(ExceptionType1 e1){
//            
//        }catch(ExceptionType2 e2){
//            
//        }catch(ExceptionType3 e3){
//            
//        }
        try {
            test();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lesson.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    //try catch helyett használhatjuk a throws-t is
    //ez arra jó, hogy átdobom a kivételt a másik szintnek, tehát nem a test-ben kezelem le, hanem ahol meghívom

    private static void test() throws FileNotFoundException {
        File file = new File("Ä://file.txt");
        FileReader fr = new FileReader(file);
    }
}
