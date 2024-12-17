public sealed class Prestation permits Produit, Service {
    private int id;
    private String nomProjet;
    private String nomClient;

    public Prestation() {
    }

    public Prestation(int id, String nomProjet, String nomClient) {
        this.id = id;
        this.nomProjet = nomProjet;
        this.nomClient = nomClient;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNomProjet() {
        return nomProjet;
    }

    public void setNomProjet(String nomProjet) {
        this.nomProjet = nomProjet;
    }

    public String getNomClient() {
        return nomClient;
    }

    public void setNomClient(String nomClient) {
        this.nomClient = nomClient;
    }

    @Override
    public String toString() {
        return "Prestation{id=" + id + ", nomProjet='" + nomProjet + "', nomClient='" + nomClient + "'}";
    }

    @Override
    public int hashCode() {
        return Integer.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prestation that = (Prestation) obj;
        return id == that.id;
    }
}