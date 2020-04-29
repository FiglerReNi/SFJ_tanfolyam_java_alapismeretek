package masodikproject;

public class Human {
    //lehet public: ha nem írunk oda semmit automatikusan az methodnál és propertynél is -> bárhol elérhető
    //lehet private, nem érhető el kívülről -> ezt használjuk leginkább
    //private String name = "Gyula";
    
    private String name; //ha nem adok meg semmit null lesz
    private int age; //ha nem adok meg értéket az alap nulla lesz
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //A lenti felépítésűkomment bekerül a javadoc-ba
    /** Ez a metódus kiírja az ember nevét */ 
    void writeMyName(){
        //lokális változó lesz, vagyis itt bent ezt fogja hasznélni és kiírni
        String name = "Jani";
        System.out.println("Az én nevem: " + name);
        //ebben az esetben a this miatt nem a lokális változót keresi, hanem az objektumét. A this mindig az objektumra
        //mutat.
        System.out.println("Az én nevem: " + this.name);
    }  
}
