public class Produs {
    private String nume;
    private Categorie categorie;
    private Distribuitor distribuitor;

    public Produs(String nume, Categorie categorie, Distribuitor distribuitor) {
        this.nume = nume;
        this.categorie = categorie;
        this.distribuitor = distribuitor;
    }

    public String getNume() {
        return nume;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public Distribuitor getDistribuitor() {
        return distribuitor;
    }

    @Override
    public String toString() {
        return nume + " (" + categorie.getNume() + ") - Distribuitor: " + distribuitor.getNume();
    }
}