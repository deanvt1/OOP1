package OOP1;

public class Paal
{//variabelen
    private double instapTarief = 2.00;
    private Locatie locatie;
    
    //constructor
    public Paal(Locatie locatie) {
        this.locatie = locatie;
    }

    //functies
    public void uitchecken(OVchipkaart kaart) {
        if (!kaart.isIngecheckt()) {
            System.out.println("Je bent niet ingecheckt");
            return;
        }
        double afstand = kaart.getStartLocatie().berekenenAfstand(locatie);
        double kosten = afstand * 0.10;
        kaart.verlaagSaldo(kosten);
        kaart.setIngecheckt(false);
        System.out.println("Je bent uitgecheckt. Kosten: €" + kosten + " Nieuw saldo: " + kaart.getSaldo());
    }



    public void inchecken(OVchipkaart kaart) {
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


