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


class Outer_Demo {

    private int num = 2;

    private class Inner_Demo {
        private int num2 = 5;         
        public void print() {          
            System.out.println("Ez egy belső osztály" + num);
        }
    }
    
    void display_Inner() {
        Inner_Demo inner = new Inner_Demo();
        inner.print();
    }
}

public class MasodikProject {

    public static void main(String[] args) {
        My_class objMy = new My_class();
        objMy.displayMessage(new Message(){
                  @Override
                  public String great(){
                      return "Hello";
                  };       
        });
        
        objMy.displayMessage(() -> "Hello"); 
        
        Outer_Demo outer = new Outer_Demo();
        outer.display_Inner();
        String name = "Gyula";
        System.out.println(name);
        Human first = new Human();
        Human second = new Human();
        first.name = "Jani";
        System.out.println(first.name);
        first.writeMyName();
        System.out.println(first.getName());
        first.setName("Ancsa");
        System.out.println(first.getName());
        System.out.println(second.getName());
        System.out.println(first.getAge());
     
        if(second.getName() == null){
            System.out.println("Nincs név");
        }else{
            System.out.println("Van név: " + second.getName());
        }
        second.setName("Gyula");
        second.setAge(23);
        String secondName = second.getName();
        if(secondName == null){
           System.out.println("Nincs név");
        }else{
            System.out.println("Van név: " + secondName);
        }
        boolean empty = (secondName == null);
        System.out.println(empty == true ? "Nincs név" : "Van név: " + secondName);      
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
       Animal allat = new Animal(); 
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
        
        ArrayList<Cat> cats = new ArrayList<Cat>();
        ArrayList<Animal> cats = new ArrayList<Animal>(); 
        Cat macskaTeszt = new Cat("Cirmi");
        cats.add(macskaTeszt);
        if(!cats.isEmpty()){
            System.out.println(cats.get(0).getName());  
        }
        Cat allatbolMacska =(Cat) cats.get(0); 
        allatbolMacska.nyavog();
        
        ArrayList<Object> list1 = new ArrayList<Object>(); 
        Dog morzsa = new Dog();
        list1.add(macskaTeszt);
        list1.add(morzsa); 
        Cat visszaMacska = (Cat) list1.get(0); 
               
        Object o1 = new Object();
        Object o2 = new Object();
        Object o3 = o1;
        o1.equals(o3);
        System.out.println( o1.hashCode() + " " + o2.hashCode() + " " + o3.hashCode());  
        System.out.println(macskaTeszt.getClass());
        if(list1.get(1) instanceof Cat )  
        {
           Cat ujMorzsa = (Cat)list1.get(1); 
           ujMorzsa.nyavog();
        }
        Cat ujMorzsa = (Cat )list1.get(1);
        Integer a1 = 2;
        String a2 = a1.toString();
        
        System.out.println(macskaTeszt.toString()); 
        System.out.println(macskaTeszt); 
        
        String szoveg1 = "Hello";
        String szoveg2 = szoveg1;
        szoveg2 = "Szia";       
        System.out.println(szoveg1 + " " + szoveg2);
       
        String s1 = "Hello";
        String s2 = new String("Hello");
       
        Hazel hazel = new Hazel(5); 
        Math.random();
  
        Hazel.ul();
        
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
