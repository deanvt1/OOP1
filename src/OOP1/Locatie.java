package OOP1;

public class Locatie
{ //variabelen
private double x;
private double y;



    //constructor
public Locatie(double x, double y)
{
    this.x = x;
    this.y = y;
}

    public double getX() { return x; }
    public double getY() { return y; }



//functie

public double berekenenAfstand(Locatie bestemming) {
    double afstand = 0;
    double a = x - bestemming.getX();
    double b = y - bestemming.getY();
    double c = a * a + b * b;
    afstand = Math.sqrt(c);

    return afstand;

}
}