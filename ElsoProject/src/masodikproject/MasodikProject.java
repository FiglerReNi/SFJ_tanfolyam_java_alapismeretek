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
        
    }
}
