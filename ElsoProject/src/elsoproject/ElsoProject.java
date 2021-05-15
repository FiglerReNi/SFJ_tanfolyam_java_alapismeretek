package elsoproject;

public class ElsoProject {

    public static void main(String[] args) {
       
          System.out.println("Szia! " + 2 + 2);
          System.out.println(2 + 2 + "Szia!");

        String result = censor("A kutya nagyon aranyos kutya.", "kutya", "macska");
        System.out.println(result);
    }

    static void Metodus(){      
    }    
    static String Fuggveny(){
        return null;
    }
   
    static String censor(String text, String toChange, String newWord) {
        System.out.println("Próba");
        if (text.contains(toChange)) {
            text = text.replaceAll(toChange, newWord);
        }
        return text;
    }
}
