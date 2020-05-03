package masodikproject;

//egyetlen egy szülője lehet az osztálynak, de az animalnak is lehet egy szülője és azt is örökli
//előfordulhat hogy arra van szükségünk, hogy több osztályt is tudjunk használni, erre vannak az 
//interface-ek pl a Pet osztályra is szükségünk van, akkor abból interface-t csinálok, ha implementálok egy interface-t,
//a benne lévő összes methodot kötelező override-al meghatározni
//public class Cat extends Feline{
public class Cat extends Animal implements Pet{
    public static int objectCount;
    public Collar nyakorv = new Collar();
    //constructor --> ha ide nem írok semmit is létrehoz magának egyet
    //automatikusan lefut a példányosításkor
    //több constructort is létre lehet hozni, ha létrehozok olyat amiben várok értéket akkor az első
    //alapot is kötelező létrehozni
    public Cat(){
        //super --> a szülő osztályra mutat, ha pl itt vmit felülírtam ezzel elérem az eredetit
        //az adott osztályra mutat, amiben a szülő tulajdonságai is benne vannak
        //super.
        //super() ---> a szülő konstruktorát tudja meghívni, de amikor meghívom a cat osztályt az összes ősének a 
        //constructorát is meghívom vele és lefutnak automatikusan, de explicit módon meg tudom hívni, pl ha 
        //valamelyik paraméteres construktorát akarom meghívni, de ilyenkor a legelső parancsnak a super()-nek kell
        //lennie
        //a name az Animal-ból jön, mivel private csak setName-el állitható
        this.setName("Dániel") ;
        //ha a name protected
        //this.name = "Dániel";
    }
    //overloading (túltöltés): ha ugyanolyan nevű függvényt csinálok, vagy construktort, de más bejövő 
    //paramétereket várok: itt pl az elsőnél semmit, aztán egy stringet, aztén egy string-int párost.
    //itt nem mi állítjuk be a nevet, hanem ami kívülről jön az lesz
    public Cat(String name){
        this.setName(name);
    }
    
    //két ugyanolyan szerezetű nem lehet, de pl ha felcserélem akkor már jó
    public Cat(String name, int weight){
        this.setName(name);
        this.setWeight(weight);
    }
    
//    public Cat(String name, int weight){
//        this.setName(name);
//        this.setWeight(weight);
//    }
    
     public Cat(int weight, String name){
        this.setName(name);
        this.setWeight(weight);
    }
   
    public void nyavog(){
        System.out.println("Nyávogás");
    }
    
    //az animal osztályban levőt felül tudom írni
    @Override  //ezzel jelzem magamnak is hogy ez egy olyan ami az ősben is van de felül írtam
    //ezeket a @-al keződő kulcsokat annotációnak nevezzük
    /*A Java programozási nyelvben annotációnak olyan nyelvi elemet nevezünk, amely lehetővé teszi a metaadatok beépítését forráskódba.[1] Az anotációkat a Java 5.0-s verziójánál vezették be. 
        Az annotációk a programkód elemeihez rendelhetők (csomagokhoz, típusokhoz, metódusokhoz, attribútumokhoz, konstruktorokhoz, lokális változókhoz), plusz információt hordoznak a Java fordító ill. speciális eszközök számára.
        Az annotáció @ jellel kezdődik, majd ehhez kapcsolódik a neve.*/
    public void shout() {
        System.out.println("Nyávogás");
    }

    @Override
    public void oleles() {
      
    }

    @Override
    public void halas() {
       
    }
    
    @Override
    public String toString(){
        return "Én egy macska vagyok a nevem pedig: " + this.getName();
    }
}
