import java.util.*;

public class Comanda {
    private Client client;
    private Map<Produs, Integer> produse;

    public Comanda(Client client) {
        this.client = client;
        this.produse = new HashMap<>();
    }

    public void adaugaProdus(Produs p, int cantitate) {
        produse.put(p, produse.getOrDefault(p, 0) + cantitate);
    }

    public Map<Produs, Integer> getProduse() {
        return produse;
    }

    public Client getClient() {
        return client;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("Comanda pentru " + client.getNume() + ":\n");
        for (Map.Entry<Produs, Integer> entry : produse.entrySet()) {
            sb.append("- ").append(entry.getKey().getNume())
              .append(": ").append(entry.getValue()).append(" buc\n");
        }
        return sb.toString();
    }
}