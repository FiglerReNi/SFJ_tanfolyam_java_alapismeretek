package masodikproject;

//final ---> ez nem terjeszthető ki, nem lehet alosztálya, nem lehet szülője semmilyen osztálynak,
//változó névben is használhatom, amint értéket kap, utána már nem lehet megváltoztatni
//---> immutable class lesz emiatt: osztály final, változó final, két constructor, nincs setter
public final class Hazel extends Animal{
    final private int size;
    
    public Hazel(){
       size = 0; 
    }
    
    public Hazel(int size){
        this.size = size;
    }
    
    
    //a final methodot nem lehet felülírni, ennek akor van lényege, ha maga az osztály nem final, tehát kiterjeszthető
    //de a methodot nem akarjuk felülírhatóvá tenni
    public final void tapsol(){
        
    }
    
    public static void ul(){
        
    }
}
