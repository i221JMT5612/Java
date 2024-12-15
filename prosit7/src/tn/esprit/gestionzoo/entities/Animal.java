package tn.esprit.gestionzoo.entities;
import tn.esprit.gestionzoo.exceptions.InvalidAgeException;

public class Animal {
    String family;
    String name;
    int age;
    boolean isMammal;
    public Animal (String family,String name,int age,boolean isMammal)
    {
        if (age < 0) {
            throw new InvalidAgeException("Age ne peut pas être negatif.");
        }
        this.family=family;
        this.name=name;
        setAge(age);
        this.isMammal=isMammal;
    }
    public void displayAnimal()
    {
        System.out.println(this.name);
        System.out.println(this.family);
        System.out.println(this.age);
        System.out.println(this.isMammal);
    }
    @Override
    public String toString() {
        return "Animal: Family='" + family + "', Name='" + name + "', Age=" + age + " years, Is Mammal=" + isMammal;
    }

    public void setAge(int age) {
        if (age >= 0) {
            this.age = age;
        } else {
            System.out.println("Age d'un animal ne peut pas etre negatif.");
        }
    }
    public String getFamily() {
        return family;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public boolean isMammal() {
        return isMammal;
    }

    public void setMammal(boolean isMammal) {
        this.isMammal = isMammal;
    }
}
