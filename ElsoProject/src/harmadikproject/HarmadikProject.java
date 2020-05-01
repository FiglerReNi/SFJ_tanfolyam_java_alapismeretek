package harmadikproject;

public class HarmadikProject {
    public static void main(String[] args) {
        
       //heap ---> nagyobb méretű memória terület
       /*az objektumok mindig itt élnek, a referenciájuk a stavkben él */
       //stack ---> kisebb méretű terület a memóriában 
            /*lineáris. LIFO szerint működik amikor java program elindul minden fontos vezető a stacbe kerül
               pl lenti példa:
                    stack aljára bekerül a main hogy meghívódott
                    a primitivek a stackben élnek tehát a következő az int i = 2 ami a tetejére kerül;
                    rápakolódik az objektum referenciája (hivatkozása) -> obj, de maga az objektum a heap-ben lesz
                    erre ugyanígy a mem jön
                    meghívjuk a proba() függvényt
                    param paramétert vár ami egy object, tehát referenciája lesz itt, de a heap-ben a már létrehozott
                        obj Objectre mutat, hiszen ezt adjuk át
                    ezután str referencia String object a heap-ben
                Ha lefutott a proba, akor ami hozzá tartozott a stackben: proba(), param, str ---> ezeket kivesszük
                és visszalépünk a mem-.proba-hoz és innen fut tovább a kód
         Ha egy class-on belül hozok létre primitivet pl. az Animal-ban akkor a heap-ben fog élni, mert az objektum része
       */
       //FIFO először bekerülő adat jön ki először
       //LIFO a legutolsó adat jön ki legelőször
       
       int i = 2;
       Object obj = new Object();
       HarmadikProject mem = new HarmadikProject();
       mem.proba(obj);
       System.out.println("OK");
       
       
       Object o1 = new Object();
       Object o2 = new Object();
       o1=o2; // az o1 is az o2-re fog mutatni, az o1-re innentől semmi, nem elérhető  o1= null --> ekkor sem mutat tovább rá semmi
      //ilyenkor a javaban van egy Garbage Collector ami időről időre a heapben megkeresi ezeket az objecteket és kiüríti
      //ezért egy nem publikus algoritmika felelős, így nem tudjuk pontosan mikor törénik ez
    }
    
    // ha nem rakok static-ot a void elé, akor példáyosítanom kell a tartalmazó osztályt, hogy elérjem
    // ha staticot rakok ez nem kell
    private void proba(Object param){
        String str = param.toString();
        System.out.println(str);
    }
}

/*Környezeti változók --> Windows-> start menü -> környezeti változók
    itt a Path-hoz hozzá kell adni a jdk-t: C:\Program Files\Java\jdk1.8.0_144\bin
    innentől cmd-ben tudjuk használni 
    Project mappájában:java parancs
    --dir adott könyvtár tartalma
    1.feladat IDE-n kívül írunk kódot és futtatjuk:
        Desktopon új mappa: Teszt;
        Notepad-ben a kód
        Teszt.java néven mentjük
        Byte kódra fordítjuk: javac Teszt.java -> enter (ha vmi nem j hibát ír)
        Létrejött a Teszt.class fájl, ez a byte kód ezt a JVM már tudja futtatni, lefordult a kód
        Tudjuk futtatni: java Teszt  (kiterjesztés nélkül az osztály nevét kell megadni)
    Ha package nevekkel dolgozunk és több java osztály is van:
                java -cp . Teszt --> cp(classPath); a . -> azt jelenti ebben a könyvtárban amin állunk (.. egyel feljebbetjelent)
                                     melyik fájl (Teszt)
    Ha package-ben van
                java -cp . elsoproject/Teszt
    A main tud String array-t fogadni, cmd-ben tudunk parmétert átadni, pl hogy hogyan inudjon el
        java Teszt alma --> ugyanúgy lefut
        java Teszt alma korte --> ugyanúgy lefut

    Kód: public class Teszt{
            public static void main(String[] args){
		System.out.println("OK");
		
		if(args[0].equals("alma"){
			System.out.println("Almánk van");
		}
            }	
        }

    Ha beírom ezt: java Teszt alma korte lefut, de ha utólag módosítottuk a kódot és adtuk hozzá az ifet, nem fog kiírni
    semmit, mert korábban fordítottuk le a kódot és most csak futtatjuk, tehát a módosítások után újra kell fordítani
    -> javac Teszt.java
    -> java Teszt alma korte 
    Ha nem adok át paramétert hibát ad mert az if-nél nem tud mit vizsgálni, nem lesz 0. elemet
*/
