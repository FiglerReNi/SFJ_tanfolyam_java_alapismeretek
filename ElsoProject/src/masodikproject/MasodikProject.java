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
       
       
       
    }
}
