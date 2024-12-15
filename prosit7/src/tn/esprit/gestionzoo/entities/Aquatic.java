package tn.esprit.gestionzoo.entities;


public sealed abstract class Aquatic extends Animal permits Dolphin, Penguin{
    String habitat;

    public Aquatic(String family,String name,int age,boolean isMammal, String habitat) {
        super(family, name, age, isMammal);
        this.habitat = habitat;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) return false;
        if (obj instanceof Aquatic aquatic) {
            return age == aquatic.age && name.equals(aquatic.name) && habitat.equals(aquatic.habitat);
        }
        return false;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }
    @Override
    public String toString() {
        return super.toString() + ", Habitat = '" + habitat + "'";
    }

    public abstract void swim();
}
