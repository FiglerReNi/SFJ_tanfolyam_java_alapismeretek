package masodikproject;

public class MasodikProject {

    public static void main(String[] args) {
//       String name = "Gyula";
//       System.out.println(name);
        Human first = new Human();
        Human second = new Human();
        //igy közvetlenül tudjuk módosítani az objektum változóját, ez nem jó gyakorlat
        //-> getterek, setterek használata helyette
        //first.name = "Jani";
        //System.out.println(first.name);
        first.writeMyName();
        //getter 
        System.out.println(first.getName());
        first.setName("Ancsa");
        System.out.println(first.getName());
        System.out.println(second.getName());
        System.out.println(first.getAge());
//      Ctrl + Shift + C -> comment       
//        if(second.getName() == null){
//            System.out.println("Nincs név");
//        }else{
//            System.out.println("Van név: " + second.getName());
//        }
        second.setName("Gyula");
        second.setAge(23);
        String secondName = second.getName();
//        if(secondName == null){
//            System.out.println("Nincs név");
//        }else{
//            System.out.println("Van név: " + secondName);
//        }
        //boolean empty = (secondName == null);
        //System.out.println(empty == true ? "Nincs név" : "Van név: " + secondName);      
        System.out.println(secondName == null ? "Nincs név" : "Van név: " + secondName);
        String thing = "alma";
        thing.charAt(0); //a
        thing.charAt(2); //m
        thing.length(); //4
        
        Cat macska = new Cat();
        Cat macska2 = new Cat("Jakab");
        Cat macska3 = new Cat("Jakab", 20);
        macska.getName();
        macska.getWeight();
        macska.nyavog();
        System.out.println(macska.equals(macska2)); //false ---> két objektum sosem azonos
        macska.shout();
//        Animal allat = new Animal(); // -->ha abstract nem példányosítható
//        allat.shout();
       macska.oleles();
       System.out.println(macska.getName());
       System.out.println(macska2.getName());
       System.out.println(macska3.getName());
       System.out.println(macska3.getWeight());
       
       System.out.print("teszt\n"); //manuális sortörés
       System.out.print("teszt"); //utána nem jön új sor, folytatólagosan követi a következő dolog
       System.out.println("teszt");  //utána új sor jön
       
       int a = 22;
       //byte b = a;  nem működik, mert különböző adattípusok
       
       byte c = 22; //fordítva működik mert kisebbet töltünk nagyobba
       int d = c;
       
       //Változó:
       //-ékezetes karakter ne
       //-számmal nem kezdődhet
       //-elsoValtozo, ElsoValtozo: mindekettő helyes, mert bár kisbetűvel szoktu kezdeni, de nem kötelező
       
       char elso = 'a';
       int masodik = 2;
       //String harmadik = elso --> a char-t nem tölthetjük át stringbe csak így
       String harmadik ="" + elso;// ---> így megoldható
       //harmadik = masodik; //stringbe nem tölthetünk intet
       harmadik = "" + masodik; // --> így megoldható
       
       double e = 3.5;
       //int f = e; //---> ezt így nem lehet, mert int nem tud double-t
       
       //Kasztolás 
       String szoveg = "a";  //a string objektum, vagyis vele együtt létre jön az object a java ősosztálya is
                             //így lesznek beépített elérhető metódusai, függvényei
       //a primitívekre nem tudok semmi ilyet meghívni, mert nem objektumok.
       int szam = 2; // nem csak a korábbi megoldssal csinálhatunk belőle stringet
       
       //a .valueOf() egy overloaded function (túltöltött), mert ugyanaz a nevük, de különböző fajta paramétereket várnak
       szoveg = String.valueOf(szam); // -->igy be tudjuk tenni a stringbe az intet, de innentől szövegként tárolódik
       
       //Minden primitivnek létezik egy becsomagoló osztálya:
       /*   primitivek            objektumok
            boolean                 Boolean
            char                    Character
            byte                    Byte
            short                   Short
            int                     Integer
            long                    Long
            float                   Float
            double                  Double
       */
       
       char teszt1 = 'c'; //ez így primitív nem tudok dolgoat meghívni rá
       Character teszt2 = 'c'; //így viszont már objektum, meghívhatók rá dolgok, de több helyet foglal így
                               //viszont így könnyebb bonyolultabb dolgokat csinálni velük
       teszt2.toString();
       
       test(teszt1); //bár objetumot vár, meg tudom hívni a primitív párjával is ezeket, és a java automatikusan becsomagolja
                     //és lesz belőle objektum
       Integer pelda = 2; //fordítva is működik
       test1(pelda);
       
       int x = 5;
       int y = x; //Primitíveknél a program lemásolja x értékét, utána ők különböző életet élnek
       
       x++; // x=6 y még mindig 5
        System.out.println("" + x + " " + y);
        
        Cat macskaTest1 = new Cat();
        Cat macskaTest2 = macskaTest1;       
        macskaTest2.setName("Fifi");     
        System.out.println(macskaTest1.getName() + " " + macskaTest2.getName());
        // mindkettő Fifi lesz, mert objetumoknál csak referenciák vannak, olyan változók ami csk rámutat,
        //új objektum minig csak new-al jön létre ---> ha egyiken módosítok, mási is módosít
       
       /*Manuális kasztolás*/
       int szamX = 2;
       Integer szamY = szamX;
       
       double szamZ = 3.5;  //ezt szeretném int-be átvinni
       int szamV = (int)szamZ; //de ebben az esetben leveszi a tizedes utáni összes számot és nem kerekít
        System.out.println(szamV);
       
        Integer it = 2;
        String something = it.toString(); //----> stringé tudom alakítani
 
    }
    public static void test(Character a) {
        System.out.println(a);
    }

    public static void test1(int a) {
        System.out.println(a);
    }
}
