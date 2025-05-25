public class Distribuitor extends Persoana {
    private String companie;

    public Distribuitor(String nume, String email, String companie) {
        super(nume, email);
        this.companie = companie;
    }

    public String getCompanie() {
        return companie;
    }
}