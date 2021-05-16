package masodikproject;

import java.util.ArrayList;

interface Message{
    String great();
}

class My_class{
    public void displayMessage(Message m){
        System.out.println(m.great() 
         + "This is an example of anonymous inner class as an argument");
    }
}


//inner class-t lehet csinálni, és egy oldalon több class is lehet
class Outer_Demo {

    private int num = 2;

    private class Inner_Demo {
        private int num2 = 5;         
        public void print() {          
            //belső osztályon belül elérem a private-ot
            System.out.println("Ez egy belső osztály" + num);
        }
    }

    //ez azért kell mert private class-t hoztunk létre, és az outer-en kívül más nem éri el, a display_Innert-t
    //viszont igen
    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class MasodikProject {

    public static void main(String[] args) {
        //azért kell az override, mert csak így tudjuk az interface-t meghívni, itt most nem implementáljuk egy osztálynál
        //hanem példányosítjuk és így csináljuk (anonym osztály lesz mert nem adok nevet neki)
        My_class objMy = new My_class();
        objMy.displayMessage(new Message(){
                  @Override
                  public String great(){
                      return "Hello";
                  };       
        });
        
        objMy.displayMessage(() -> "Hello"); //ez ugyanazt csinálja mint a felső rész --> példányosít+override
        
        Outer_Demo outer = new Outer_Demo();
        outer.display_Inner();
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
        System.out.println(macska.equals(macska2)); 
        macska.shout();
       Animal allat = new Animal(); //
        allat.shout();
       macska.oleles();
       System.out.println(macska.getName());
       System.out.println(macska2.getName());
       System.out.println(macska3.getName());
       System.out.println(macska3.getWeight());
       
       System.out.print("teszt\n"); 
       System.out.print("teszt"); 
       System.out.println("teszt"); 
       
       int a = 22;
       byte b = a;  
       
       byte c = 22; 
       int d = c;
       
       char elso = 'a';
       int masodik = 2;
       String harmadik = elso 
       String harmadik ="" + elso;
       harmadik = masodik; 
       harmadik = "" + masodik; 
       
       double e = 3.5;
       int f = e; 
       
       String szoveg = "a";  
       int szam = 2; 
       
       
       szoveg = String.valueOf(szam); 
         
       char teszt1 = 'c'; 
       Character teszt2 = 'c'; 
        
       teszt2.toString();
       
       test(teszt1); 
       Integer pelda = 2; 
       test1(pelda);
       
       int x = 5;
       int y = x; 
       
       x++; // x=6 y még mindig 5
        System.out.println("" + x + " " + y);
        
        Cat macskaTest1 = new Cat();
        Cat macskaTest2 = macskaTest1;       
        macskaTest2.setName("Fifi");     
        System.out.println(macskaTest1.getName() + " " + macskaTest2.getName());
        
       int szamX = 2;
       Integer szamY = szamX;
       
       double szamZ = 3.5;  
       int szamV = (int)szamZ; 
        System.out.println(szamV);
       
        Integer it = 2;
        String something = it.toString(); 
        
        /*ArrayList-ek
            A tipusnak a szülőt is megadhatom, pl. Animal és bele tehetem a Cat-et a listába
            de ebben az esetben állati formában tárolja a macskát, nem macskaként, vagyis a macska
            osztályban lévő specifikus dolgok nem lesznek elérhetőek rá, csak ami benne van az állatban
            casztolással tudjuk macskává alakítani
        */
        //ArrayList<Cat> cats = new ArrayList<Cat>();
        ArrayList<Animal> cats = new ArrayList<Animal>(); // ez is helyes mert bár utána egy cat-et raok bele, de ez a szülője
        Cat macskaTeszt = new Cat("Cirmi");
        cats.add(macskaTeszt);
        if(!cats.isEmpty()){
            System.out.println(cats.get(0).getName());  //cats.get(0) ---> arrayList esetén így hivatkozunk az elemére
        }
        Cat allatbolMacska =(Cat) cats.get(0); //visszaalaítás állatból macskává
        allatbolMacska.nyavog();
        
        ArrayList<Object> list1 = new ArrayList<Object>(); //ősosztályban is tárolhatunk, ilyenor bármit bele tudok tenni, ami objektum
        Dog morzsa = new Dog();
        list1.add(macskaTeszt);
        list1.add(morzsa); //ezt nem fogom tudni pl macskává kasztolni, csak a saját osztályába vissza
        Cat visszaMacska = (Cat) list1.get(0); //kasztolás az eredeti osztályba
        
        /* Object class jellemzők:
        hashCode = JVM által generált kód, ami az objektum egyedi azonosító száma, minden objektumnak ez más
        amior két objekzumot hasonlítunk össze akkor a hash kódjukat hasonlítjuk gyakorlatilag össze
        getClass = package + osztályt adja vissza az objektumnak, minden objektum tudja magáról, melyik
        osztályból lett létrehozva.
        equals --> összehasonlítás
        toString()
        */        
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        o1.equals(o3);
        System.out.println( o1.hashCode() + " " + o2.hashCode() + " " + o3.hashCode());  //1 és 3 megeggyezik
        System.out.println(macskaTeszt.getClass());
        if(list1.get(1) instanceof Cat )  //példánya e az adott osztálynak valami
        {
           Cat ujMorzsa = (Cat)list1.get(1); 
           ujMorzsa.nyavog();
        }
        //Cat ujMorzsa = (Cat )list1.get(1); --> ez hibás mert valójában kutya iosztályból van a list1-ben ez az elem
        Integer a1 = 2;
        String a2 = a1.toString(); //-->stringgé alakít
        
        System.out.println(macskaTeszt.toString()); //objektum kiiratásnál így nem sokat segít, de osztályon belül a
                                                    //toString - et felül tudjuk írni magunknak
        System.out.println(macskaTeszt); //így is a toStringet adja vissza
        
        /*
        Immutable(megváltoztathatatlan):  A String a heap-nek egy külön részén él (speciális ezért), és emiatt
            immutable lesz. Ilyen osztályt mi is létre tudunk hozni
       
        */
        String szoveg1 = "Hello";
        String szoveg2 = szoveg1;
        szoveg2 = "Szia";       
        System.out.println(szoveg1 + " " + szoveg2);
        //korábbiak alapján a kettőne meg kellene egyeznie, hiszen a 2-es az egyesre fog mutatni,
        //azonban mivel a String speciális, az 1-es marad az eredeti, és csak a kettes változik
        String s1 = "Hello";
        String s2 = new String("Hello");
        //különbség: a második esetben sima, hagyományos objetumot hozok létre, normál helyen lesz a heap-ben
        //első esetben pegig speciális Stringet hozok létre, ami immutable és más helyen él a heap-ben (String Constant Pool-ban)
        Hazel hazel = new Hazel(5); //nincs setter, final a változó és a class így ne állítható át ---> immutable class lesz
        Math.random();
        //static methodhoz nem kell példányosítás
        Hazel.ul();
        
        //az Animal-ban lévő static változón osztozni fognak
        Cat c1 = new Cat();
        Cat c2 = new Cat();
        Cat c3 = new Cat();
        Cat c4 = new Cat();
        
    }
    public static void test(Character a) {
        System.out.println(a);
    }

    public static void test1(int a) {
        System.out.println(a);
    }
}
