package OOP1;


public class Main {
    public static void main(String[] args) {
        OVchipkaart kaart1 = new OVchipkaart(2 , 20.00, true);
        Paal kaartlezer1 = new Paal();
        Paal kaartlezer2 = new Paal();
        kaartlezer1.inchecken(kaart1, nijmegen);
        Locatie nijmegen = new Locatie(10, 20);
        Locatie arnhem = new Locatie(20, 10);
        double afstand = nijmegen.berekenenAfstand(arnhem);
        System.out.println("afstand"+ afstand);
//variabelen

    }

    //constructor


    //functies
}




