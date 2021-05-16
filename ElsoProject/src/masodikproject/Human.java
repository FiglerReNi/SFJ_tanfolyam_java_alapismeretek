package masodikproject;

public class Human {
    
    private String name; 
    private int age; 
    
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

    void writeMyName(){
        String name = "Jani";
        System.out.println("Az én nevem: " + name);
        System.out.println("Az én nevem: " + this.name);
    }  
}
