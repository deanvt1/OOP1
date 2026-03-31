package OOP1;

public class Paal
{//variabelen
    private double instapTarief = 2.00;
    //constructor


    //functies
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
        System.out.println("Je bent ingecheckt Nieuw saldo: " + kaart.getSaldo());
        }
    }


