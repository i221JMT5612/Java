import java.util.TreeSet;

public interface IDepartement <T>{
    public void ajouterDep(T t);
    public boolean rechercherDep(String nom);
    public boolean rechercherDep(T t);
    public void supprimerDep(T t);
    public void displayDep();
    public TreeSet<T> trierDepById();
}
