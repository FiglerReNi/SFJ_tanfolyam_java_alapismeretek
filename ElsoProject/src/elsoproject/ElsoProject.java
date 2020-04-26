package elsoproject;
public class ElsoProject {
//Mindig a main fut le először, amikor elindítunk egy programot, ez a belépési pont.
//A különböző kódrészleteket package-ben tároljuk, különböző osztályokat teszünk alá, amik logikailag összetartoznak.
//Tehát packageken belül hozzük létre az osztályokat. Mindig nagy betűvel kezdődnek.
    public static void main(String[] args) {
      //Csak az fut le ami a main-ben van, azon kívül csak az fut le amit meghívunk.
      //ctrl + space -> elkezdek írni valamit és lehetőségeet ajánl.
      //Csak ez működik: "" a másik '' nem
      //Console-ra ír dolgokat -> ha lefuttatjuk cmd-ben ott is látjuk
      //7.video
      //  System.out.println("Szia! " + 2 + 2);
      //  System.out.println(2 + 2 + "Szia!");
      String result = censor("A kutya nagyon aranyos kutya.", "kutya", "macska");
      System.out.println(result);
    }
    //8.video
    /* 1.lépés metódus vagy függvény, lesz visszatérési értéke vagy nem, itt előre meg kell mondani és ha igen 
        milyen adattípusú
    static void Metodus(){      
    }    
    static String Fuggveny(){
        return null;
    }
    */
    static String censor(String text, String toChange, String newWord){
        //System.out.println("Próba");
        if(text.contains(toChange)){
           text = text.replaceAll(toChange, newWord); 
        }       
        return text;
    }
}
