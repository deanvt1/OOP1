package OOP1;

public class Paal
{//variabelen
    private double instapTarief = 2.00;
    //constructor


    //functies
    public void uitchecken(OVchipkaart kaart, Locatie bestemming) {
        if (!kaart.isIngecheckt()) {
            System.out.println("Je bent niet ingecheckt");
            return;
        }
        double afstand = kaart.getStartLocatie().berekenenAfstand(bestemming);
        double kosten = afstand * 0.10;
        kaart.verlaagSaldo(kosten);
        kaart.setIngecheckt(false);
        System.out.println("Je bent uitgecheckt. Kosten: €" + kosten + " Nieuw saldo: " + kaart.getSaldo());
    }



    public void inchecken(OVchipkaart kaart, Locatie locatie) {
        if (!kaart.isGeldig()) {
            System.out.println("Kaart is ongeldig");
            return;
        }
        if (kaart.isIngecheckt()) {
            System.out.println("Je bent al ingecheckt");
            return;
        }
        if (kaart.getSaldo() < instapTarief) {
            System.out.println("Onvoldoende saldo");
            return;
        }
        kaart.verlaagSaldo(instapTarief);
        kaart.setIngecheckt(true);
        kaart.setStartLocatie(locatie);
        System.out.println("Je bent ingecheckt Nieuw saldo: " + kaart.getSaldo());
        }
    }


