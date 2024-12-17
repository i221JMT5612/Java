public final class Produit extends Prestation {
    private int prixTotal;
    private String dateLivraison;

    public Produit() {
    }

    public Produit(int id, String nomProjet, String nomClient, int prixTotal, String dateLivraison) {
        super(id, nomProjet, nomClient);
        this.prixTotal = prixTotal;
        this.dateLivraison = dateLivraison;
    }

    public int getPrixTotal() {
        return prixTotal;
    }

    public void setPrixTotal(int prixTotal) {
        this.prixTotal = prixTotal;
    }

    public String getDateLivraison() {
        return dateLivraison;
    }

    public void setDateLivraison(String dateLivraison) {
        this.dateLivraison = dateLivraison;
    }

    @Override
    public String toString() {
        return "Produit { " + super.toString() + ", prix Total = " + prixTotal + ", date Livraison = '" + dateLivraison + "' }";
    }
}