import java.util.Objects;

public class Departement {
    private int id_dep;
    private String nom_dep;
    private int nb_employe;
    public Departement() {}
    public Departement(int id_dep, String nom_dep,int nb_employe) {
        this.id_dep = id_dep;
        this.nom_dep = nom_dep;
        this.nb_employe = nb_employe;
    }

    public int getId_dep() {
        return id_dep;
    }

    public void setId_dep(int id_dep) {
        this.id_dep = id_dep;
    }

    public String getNom_dep() {
        return nom_dep;
    }

    public void setNom_dep(String nom_dep) {
        this.nom_dep = nom_dep;
    }

    public int getNb_employe() {
        return nb_employe;
    }

    public void setNb_employe(int nb_employe) {
        this.nb_employe = nb_employe;
    }

    @Override
    public String toString() {
        return "Departement{" +
                "id_dep=" + id_dep +
                ", nom_dep='" + nom_dep + '\'' +
                ", nb_employe=" + nb_employe +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Departement d)) return false;
        return id_dep == d.id_dep && Objects.equals(nom_dep, d.nom_dep);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_dep,nom_dep);
    }

}
