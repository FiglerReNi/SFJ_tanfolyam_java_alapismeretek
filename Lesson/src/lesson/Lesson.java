package lesson;

import java.util.ArrayList;  //ha saját osztályt csinálok egy másik package-ben, akkor hogy itt is tudjam használni
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
        
    }
    
}
