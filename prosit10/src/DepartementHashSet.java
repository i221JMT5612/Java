import java.util.HashSet;
import java.util.TreeSet;

public class DepartementHashSet implements IDepartement<Departement> {
    private HashSet<Departement> departements = new HashSet<>();

    @Override
    public void ajouterDep(Departement d) {
        if (departements.add(d)) {
            System.out.println("Departement ajoute: " + d);
        } else {
            System.out.println("Le departement existe : " + d);
        }
    }

    @Override
    public boolean rechercherDep(String nom) {
        for (Departement d : departements) {
            if (d.getNom_dep().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean rechercherDep(Departement d) {
        return departements.contains(d);
    }

    @Override
    public void supprimerDep(Departement d) {
        if (departements.remove(d)) {
            System.out.println("Departement supprimer: " + d);
        } else {
            System.out.println("Le departement n'existe pas: " + d);
        }
    }

    @Override
    public void displayDep() {
        if (departements.isEmpty()) {
            System.out.println("Aucun departement disponible.");
        } else {
            for (Departement d : departements) {
                System.out.println(d);
            }
        }
    }
    @Override
    public TreeSet<Departement> trierDepById() {
        TreeSet<Departement> sortedSet = new TreeSet<>((d1, d2) -> Integer.compare(d1.getId_dep(),d2.getId_dep()));
        sortedSet.addAll(departements);
        return sortedSet;
    }
}
