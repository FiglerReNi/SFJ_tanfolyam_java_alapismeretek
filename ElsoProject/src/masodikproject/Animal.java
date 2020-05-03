package masodikproject;
//többszörös öröklődés nincs a javaban, egyetlen szülője lehet egy osztálynak
//abstract --> ezt az osztályt önmagában nem lehet példányosítani
public abstract class Animal {
    
    private String name;
    private int weight;
   
    //public bárhol elérhető
    //protected csak adott packagen belül érhető el
    //ha ezt private-ra állítom, akkor nem elérhető máshol, változóra is igaz
    //ha protectedre állítom akkor elérhető lesz az alosztályok számára is
    protected void shout(){
        System.out.println("Kiáltás");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
