public final class Service extends Prestation {
    private int nombreHeures;
    private int prixHeure;

    public Service() {
    }

    public Service(int id, String nomProjet, String nomClient, int nombreHeures, int prixHeure) {
        super(id, nomProjet, nomClient);
        this.nombreHeures = nombreHeures;
        this.prixHeure = prixHeure;
    }

    public int getNombreHeures() {
        return nombreHeures;
    }

    public void setNombreHeures(int nombreHeures) {
        this.nombreHeures = nombreHeures;
    }

    public int getPrixHeure() {
        return prixHeure;
    }

    public void setPrixHeure(int prixHeure) {
        this.prixHeure = prixHeure;
    }

    @Override
    public String toString() {
        return "Service { " + super.toString() + ", nombre Heures = " + nombreHeures + ", prix Heure = " + prixHeure + " }";
    }
}