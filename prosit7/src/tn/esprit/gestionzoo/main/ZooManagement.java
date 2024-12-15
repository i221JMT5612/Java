package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.*;
import tn.esprit.gestionzoo.entities.Zoo;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;
import tn.esprit.gestionzoo.exceptions.ZooFullException;

public class ZooManagement{
    public static void main(String[] args) {
        Zoo zoo = new Zoo("hammamet","test");

        Zoo zoo = new Zoo("Mon Zoo", "hammamet"); // Le zoo a 3 cages
        Animal dolphin = new Dolphin("Mammifère", "Flipper", 5, true, "25.0f");
        Animal penguin1 = new Penguin("Oiseau", "Pingouin1", 3, false, 10.0f);
        Animal penguin2 = new Penguin("Oiseau", "Pingouin2", 4, false, 12.0f);
        Animal penguin3 = new Penguin("Oiseau", "Pingouin3", 2, false, 15.0f);

        try {
            zoo.addAnimal(dolphin);
            System.out.println("Nombre d'animaux apres ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin1);
            System.out.println("Nombre d'animaux apres ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin2);
            System.out.println("Nombre d'animaux apres ajout : " + zoo.getNbrAnimals());

            zoo.addAnimal(penguin3);
        } catch (InvalidAgeException e) {
            System.out.println("Erreur : " + e.getMessage());
        } catch (ZooFullException zfe) {
            System.out.println(zfe.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Nombre total d'animaux dans le zoo : " + zoo.getNbrAnimals());

    }

}
