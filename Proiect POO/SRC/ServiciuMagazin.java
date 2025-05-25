import java.util.*;

public class ServiciuMagazin {
    private Map<Produs, Integer> stoc = new HashMap<>();
    private TreeSet<Produs> produseSortate = new TreeSet<>(Comparator.comparing(Produs::getNume));
    private List<Client> clienti = new ArrayList<>();
    private List<Angajat> angajati = new ArrayList<>();
    private List<Distribuitor> distribuitori = new ArrayList<>();
    private List<Comanda> comenzi = new ArrayList<>();
    private List<Magazin> magazine = new ArrayList<>();

  
    public void adaugaProdus(Produs produs, int cantitate) {
        produseSortate.add(produs);
        stoc.put(produs, stoc.getOrDefault(produs, 0) + cantitate);
    }

    public void adaugaClient(Client client) {
        clienti.add(client);
    }

    public void adaugaAngajat(Angajat angajat) {
        angajati.add(angajat);
    }

    public void adaugaDistribuitor(Distribuitor distribuitor) {
        distribuitori.add(distribuitor);
    }

    public void adaugaMagazin(Magazin magazin) {
        magazine.add(magazin);
    }

    public void inregistreazaComanda(Comanda comanda) {
        comenzi.add(comanda);
    }


    public void afiseazaProduseSortate() {
        System.out.println("Produse sortate alfabetic:");
        for (Produs p : produseSortate) {
            System.out.println("- " + p.getNume());
        }
    }

    public void afiseazaStoc() {
        System.out.println("Stoc curent:");
        for (Map.Entry<Produs, Integer> entry : stoc.entrySet()) {
            System.out.println(entry.getKey().getNume() + ": " + entry.getValue());
        }
    }

    public void afiseazaClienti() {
        System.out.println("Clienti:");
        for (Client c : clienti) {
            System.out.println("- " + c.getNume() + " (" + c.getEmail() + ")");
        }
    }

    public void afiseazaAngajati() {
        System.out.println("Angajați:");
        for (Angajat a : angajati) {
            System.out.println("- " + a);
        }
    }

    public void afiseazaMagazine() {
        System.out.println("Magazine:");
        for (Magazin m : magazine) {
            System.out.println("- " + m);
        }
    }

    public void afiseazaComenziClient(Client client) {
        System.out.println("Comenzi pentru clientul: " + client.getNume());
        for (Comanda c : comenzi) {
            if (c.getClient().equals(client)) {
                System.out.println("- Comanda cu " + c.getProduse().size() + " produse");
            }
        }
    }

   
}
