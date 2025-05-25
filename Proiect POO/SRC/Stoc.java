import java.util.*;

public class Stoc {
    private Map<Produs, Integer> stocProduse = new TreeMap<>(Comparator.comparing(Produs::getNume));

    public void adaugaProdus(Produs produs, int cantitate) {
        stocProduse.put(produs, stocProduse.getOrDefault(produs, 0) + cantitate);
    }

    public boolean scadeProdus(Produs produs, int cantitate) {
        int curent = stocProduse.getOrDefault(produs, 0);
        if (curent >= cantitate) {
            stocProduse.put(produs, curent - cantitate);
            return true;
        }
        return false;
    }

    public void afiseazaStoc() {
        for (Map.Entry<Produs, Integer> entry : stocProduse.entrySet()) {
            System.out.println(entry.getKey().getNume() + ": " + entry.getValue() + " bucăți");
        }
    }
}