package sentencegenerator;

public class Game {

    public String generator() {
        String[] firstWord = {"Nagyon jó", "Megbízható", "Kiváló", "Tökéletes", "A legeslegjobb"};
        String[] secondWord = {" megoldás", " lehetőség", " kivitelezés"};
        String[] thirdWord = {" neked!", " mindenkinek!", " az egész világnak!", " még a Földön kívülieknek is!"};

//        int oneLength = firstWord.length;
//        int secondLength = secondWord.length;
//        int thirdLength = thirdWord.length;
//
//        int random1 = (int) (Math.random() * oneLength);       
//        int random2 = (int) (Math.random() * secondLength);   
//        int random3 = (int) (Math.random() * thirdLength);   

        int random1 = (int) (Math.random() * firstWord.length);        
        int random2 = (int) (Math.random() * secondWord.length);   
        int random3 = (int) (Math.random() * thirdWord.length);
        
        String sentence = firstWord[random1] + secondWord[random2] + thirdWord[random3];
        
        return sentence;
    }
}
