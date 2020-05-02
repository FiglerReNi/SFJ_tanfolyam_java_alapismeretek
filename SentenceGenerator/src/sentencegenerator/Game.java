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
//        int random1 = (int) (Math.random() * oneLength);        //0 és 1 között ad vissza törtet alapesetben
//        int random2 = (int) (Math.random() * secondLength);    //ha kasztolunk alapból mindig nullát kapunk    
//        int random3 = (int) (Math.random() * thirdLength);    //ezért * --> 0-4 között kapunk ha 5-el szorzunk

        int random1 = (int) (Math.random() * firstWord.length);        
        int random2 = (int) (Math.random() * secondWord.length);   
        int random3 = (int) (Math.random() * thirdWord.length);
        
        String sentence = firstWord[random1] + secondWord[random2] + thirdWord[random3];
        
        return sentence;
    }
}
