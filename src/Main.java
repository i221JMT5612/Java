import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {

        List<Etudiant> etudiants = new ArrayList<>();
        etudiants.add(new Etudiant(1, "Alice", 22));
        etudiants.add(new Etudiant(2, "Bob", 20));
        etudiants.add(new Etudiant(3, "Charlie", 23));

        EtudiantManagement management = new EtudiantManagement();

        System.out.println("Tous les etudiants :");
        management.displayStudents(etudiants, System.out::println);

        /*System.out.println("Etudiants ages plus 21 ans :");
        management.displayStudentsByFilter(etudiants, etudiant -> etudiant.getAge() > 21, System.out::println);*/

        /*System.out.println("Noms des etudiants :");
        String noms = management.returnStudentsNames(etudiants, Etudiant::getNom);
        System.out.println(noms);*/

        /*Etudiant nouvelEtudiant = management.createStudent(() -> new Etudiant(4, "David", 19));
        etudiants.add(nouvelEtudiant);
        System.out.println("Nouvel etudiant : " + nouvelEtudiant);*/

        /*System.out.println("Etudiants tries par ID :");
        List<Etudiant> etudiantsTries = management.sortStudentsById(etudiants, Comparator.comparingInt(Etudiant::getId));
        etudiantsTries.forEach(System.out::println);/*

        /*System.out.println("Etudiants (stream) :");
        management.convertToStream(etudiants).forEach(System.out::println);*/
    }
}