import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Entreprise entreprise = new Entreprise();

        try {
            entreprise.ajouterPrestation(new Produit(1, "Projet A", "Client X", 5000, "2024-12-31"));
            entreprise.ajouterPrestation(new Service(2, "Projet B", "Client Y", 40, 100));
            entreprise.ajouterPrestation(new Produit(3, "Projet C", "Client Z", 7000, "2025-01-15"));
            entreprise.ajouterPrestation(new Service(4, "Projet D", "Client W", 50, 120));

            //***
            /* entreprise.ajouterPrestation(produit1);
            entreprise.ajouterPrestation(service1);
            Prestation produit2 = new Produit(1, "Projet C", "Client Z", 3000, "2025-01-15");
            entreprise.ajouterPrestation(produit2); */

            //***
            //entreprise.afficherNbrPrestation();

            //***
            /* List<Prestation> prestationsClientX = entreprise.prestationparClient("Client X");
            System.out.println("Prestations Client X : " + prestationsClientX);
            List<Prestation> prestationsClientY = entreprise.prestationparClient("Client Y");
            System.out.println("Prestations Client Y : " + prestationsClientY);
            List<Prestation> prestationsClientInconnu = entreprise.prestationparClient("Client Inconnu");
            System.out.println("Prestations Client Inconnu : " + prestationsClientInconnu); */

            //***
            /* Map<String, List<Prestation>> prestationsParClient = entreprise.filterParClient();
            for (Map.Entry<String, List<Prestation>> entry : prestationsParClient.entrySet()) {
                System.out.println("Client : " + entry.getKey());
                System.out.println("Prestations : " + entry.getValue());
            } */

            //***
            /* List<String> clients = entreprise.afficherClient();
            System.out.println("Clients tries & sans doublons : " + clients);
            List<String> projets = entreprise.afficherProjects();
            System.out.println("Projets tries & sans doublons : " + projets); */

            //***
            /* Map<Service, Integer> servicesAvecPrix = entreprise.recupererServices();
            System.out.println("Liste services + prix total :");
            for (Map.Entry<Service, Integer> entry : servicesAvecPrix.entrySet()) {
                System.out.println("Service : " + entry.getKey() + " | Prix Total : " + entry.getValue());
            } */

            //***
            //entreprise.totalVentesProduits();

            //***
            entreprise.topServiceClient();

        } catch(PrestationExisteException e){
            System.out.println("Erreur : " + e.getMessage());
        }
    }
}
