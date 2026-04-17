package OOP1;

public class opwaarderen
{ //variabelen
    private OVchipkaart actieveKaart;

    //constructor
    public void scanKaart(OVchipkaart kaart)
    {
        this.actieveKaart = kaart;
    }

    public void opwaarderen(double bedrag)
    {
        if (actieveKaart == null)
        {
            System.out.println("fout");
        }
        else
        {
            actieveKaart.verhoogSaldo(bedrag);
        }
    }

    public void aanvullenTot(double doelBedrag)
    {
        if (actieveKaart == null)
        {
            System.out.println("fout");
        }
        else
        {
            double verschil = doelBedrag - actieveKaart.getSaldo();
            actieveKaart.verhoogSaldo(verschil);
        }
    }

    public void stoppen()
    {
        actieveKaart = null;
    }
}