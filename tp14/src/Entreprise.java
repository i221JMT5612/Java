import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;
import java.util.stream.Stream;
import java.util.stream.Collectors;
import java.util.Optional;

public class Entreprise {
    private List<Prestation> prestations;

    public Entreprise() {
        this.prestations = new ArrayList<>();
    }

    public void ajouterPrestation(Prestation p) throws PrestationExisteException {
        for (Prestation prestation : prestations) {
            if (prestation.getId() == p.getId()) {
                throw new PrestationExisteException("La prestation avec l'id " + p.getId() + " existe déjà !");
            }
        }
        prestations.add(p);
    }

    public List<String> afficherClient() {
        Set<String> clients = new TreeSet<>();
        for (Prestation p : prestations) {
            clients.add(p.getNomClient());
        }
        return new ArrayList<>(clients);
    }

    public List<String> afficherProjects() {
        Set<String> projets = new TreeSet<>();
        for (Prestation p : prestations) {
            projets.add(p.getNomProjet());
        }
        return new ArrayList<>(projets);
    }

    public void afficherNbrPrestation() {
        int countProduit = 0;
        int countService = 0;

        for (Prestation p : prestations) {
            if (p instanceof Produit) {
                countProduit++;
            } else if (p instanceof Service) {
                countService++;
            }
        }
        System.out.println("Nombre de prestations de type Produit : " + countProduit);
        System.out.println("Nombre de prestations de type Service : " + countService);
    }

    public List<Prestation> prestationparClient(String client) {
        List<Prestation> resultat = new ArrayList<>();

        for (Prestation p : prestations) {
            if (p.getNomClient().equalsIgnoreCase(client)) {
                resultat.add(p);
            }
        }
        return resultat;
    }

    public Map<String, List<Prestation>> filterParClient() {
        Map<String, List<Prestation>> mapParClient = new HashMap<>();

        for (Prestation p : prestations) {
            String client = p.getNomClient();

            if (!mapParClient.containsKey(client)) {
                mapParClient.put(client, new ArrayList<>());
            }
            mapParClient.get(client).add(p);
        }
        return mapParClient;
    }

    public Map<Service, Integer> recupererServices() {
        Map<Service, Integer> servicesMap = new HashMap<>();
        Function<Service, Integer> calculerPrixTotal = service -> service.getNombreHeures() * service.getPrixHeure();
        for (Prestation p : prestations) {
            if (p instanceof Service) {
                Service service = (Service) p;
                int prixTotal = calculerPrixTotal.apply(service);
                servicesMap.put(service, prixTotal);
            }
        }
        return servicesMap;
    }

    public void totalVentesProduits() {
        int total = prestations.stream()
                .filter(p -> p instanceof Produit)
                .map(p -> (Produit) p)
                .filter(produit -> produit.getDateLivraison().contains("2023"))
                .mapToInt(Produit::getPrixTotal)
                .sum();

        System.out.println("Le total des ventes des produits en 2023 est : " + total + " unités monétaires");
    }

    public void topServiceClient() {
        Map<String, Integer> clientBenefices = prestations.stream()
                .filter(p -> p instanceof Service)
                .map(p -> (Service) p)
                .collect(Collectors.groupingBy(
                        Service::getNomClient,
                        Collectors.summingInt(s -> s.getNombreHeures() * s.getPrixHeure())
                ));

        Optional<Map.Entry<String, Integer>> meilleurClient = clientBenefices.entrySet()
                .stream()
                .max(Map.Entry.comparingByValue());
        if (meilleurClient.isPresent()) {
            System.out.println("Le meilleur client est : " + meilleurClient.get().getKey() +
                    " avec un bénéfice total de : " + meilleurClient.get().getValue());
        } else {
            System.out.println("Aucun service n'a été enregistré.");
        }
    }

    public List<Prestation> getPrestations() {
        return prestations;
    }

    @Override
    public String toString() {
        return " Entreprise { prestations = " + prestations + '}';
    }
}
