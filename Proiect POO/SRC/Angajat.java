public class Angajat extends Persoana {
    private String functie;

    public Angajat(String nume, String email, String functie) {
        super(nume, email);
        this.functie = functie;
    }

    public String getFunctie() {
        return functie;
    }

    public void setFunctie(String functie) {
        this.functie = functie;
    }

    @Override
    public String toString() {
        return super.toString() + ", Functie: " + functie;
    }
}
