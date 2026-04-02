package OOP1;


public class OVchipkaart
{   //variabelen
    private int kaartNummer;
    private double saldo;
    private boolean geldig;
    private boolean ingecheckt;
    private Locatie startLocatie;


//constructor
public OVchipkaart(int kaartNummer, double saldo, boolean geldig) {
    this.kaartNummer = kaartNummer;
    this.saldo = saldo;
    this.geldig = geldig;
    this.ingecheckt = false;




}
//functies
public double getSaldo() {
    return saldo;
}
public boolean isGeldig() {
    return geldig;
}
public boolean isIngecheckt() {
    return ingecheckt;
}
public void verlaagSaldo(double bedrag) {
    saldo -= bedrag;
}
public void setIngecheckt(boolean ingecheckt) {
    this.ingecheckt = ingecheckt;
}
public void setStartLocatie(Locatie locatie) {
            this.startLocatie = locatie;
    }
    public Locatie getStartLocatie() {
    return startLocatie;
    }

}

