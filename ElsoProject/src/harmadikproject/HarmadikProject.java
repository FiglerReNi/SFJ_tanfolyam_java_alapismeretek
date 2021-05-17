package harmadikproject;

public class HarmadikProject {
    public static void main(String[] args) {
       
       int i = 2;
       Object obj = new Object();
       HarmadikProject mem = new HarmadikProject();
       mem.proba(obj);
       System.out.println("OK");
       
       Object o1 = new Object();
       Object o2 = new Object();
       o1=o2; 
    }
    
    private void proba(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}



