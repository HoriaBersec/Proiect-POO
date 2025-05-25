public class Main {
    public static void main(String[] args) {
        ServiciuMagazin serviciu = new ServiciuMagazin();

        // Creez distribuitori
        Distribuitor d1 = new Distribuitor("DistribAuto", "auto@distrib.ro", "AutoDistrib SRL");
        serviciu.adaugaDistribuitor(d1);

        // Creez categorii
        Categorie c1 = new Categorie("Electrocasnice");
        Categorie c2 = new Categorie("IT");

        // Creez produse
        Produs p1 = new Produs("Frigider Arctic", c1, d1);
        Produs p2 = new Produs("Laptop Lenovo", c2, d1);

        // Adaug produse in stoc
        serviciu.adaugaProdus(p1, 15);
        serviciu.adaugaProdus(p2, 10);

        // Creez clienti
        Client cl1 = new Client("Ion Popescu", "ion@gmail.com");
        Client cl2 = new Client("Maria Ionescu", "maria@gmail.com");
        serviciu.adaugaClient(cl1);
        serviciu.adaugaClient(cl2);

        // Creez angajati
        Angajat a1 = new Angajat("Andrei Georgescu", "andrei@magazin.ro", "Casier");
        Angajat a2 = new Angajat("Elena Vasilescu", "elena@magazin.ro", "Manager");
        serviciu.adaugaAngajat(a1);
        serviciu.adaugaAngajat(a2);

        // Creez magazine
        Magazin m1 = new Magazin("Magazin Central", "Str. Principala 1");
        Magazin m2 = new Magazin("Magazin Nord", "Str. Nord 5");
        serviciu.adaugaMagazin(m1);
        serviciu.adaugaMagazin(m2);

        // Creez comenzi
        Comanda cmd1 = new Comanda(cl1);
        cmd1.adaugaProdus(p1, 2);
        Comanda cmd2 = new Comanda(cl2);
        cmd2.adaugaProdus(p2, 1);

        serviciu.inregistreazaComanda(cmd1);
        serviciu.inregistreazaComanda(cmd2);

        // Afisari
        serviciu.afiseazaProduseSortate();
        System.out.println();
        serviciu.afiseazaStoc();
        System.out.println();
        serviciu.afiseazaClienti();
        System.out.println();
        serviciu.afiseazaAngajati();
        System.out.println();
        serviciu.afiseazaMagazine();
        System.out.println();
        serviciu.afiseazaComenziClient(cl1);
    }
}
