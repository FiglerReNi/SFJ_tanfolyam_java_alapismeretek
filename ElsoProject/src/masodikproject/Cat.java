package masodikproject;

public class Cat extends Animal implements Pet{
    public static int objectCount;
    public Collar nyakorv = new Collar();

    public Cat(){
        //a name az Animal-ból jön, mivel private csak setName-el állitható
        this.setName("Dániel") ;
        //ha a name protected
        //this.name = "Dániel";
    }
   
    public Cat(String name){
        this.setName(name);
    }
    
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
  
    @Override 
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
