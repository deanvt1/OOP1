package OOP1;


public class Main {
    public static void main(String[] args) {
        OVchipkaart kaart1 = new OVchipkaart(2 , 20.00, true);
        Locatie nijmegen = new Locatie(10, 20);
        Locatie arnhem = new Locatie(20, 10);
        Paal kaartlezer1 = new Paal(nijmegen);
        Paal kaartlezer2 = new Paal(arnhem);
        kaartlezer1.inchecken(kaart1);
        kaartlezer2.uitchecken(kaart1);
        double afstand = nijmegen.berekenenAfstand(arnhem);
        System.out.println("afstand"+ afstand);
//variabelen

    }

    //constructor


    //functies
}




