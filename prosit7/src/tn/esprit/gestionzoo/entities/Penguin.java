package tn.esprit.gestionzoo.entities;

public final class Penguin extends Aquatic {
    float swimmingDepth;

    public Penguin(String family,String name,int age,boolean isMammal, String habitat, float swimmingDepth) {
        super(family, name, age, isMammal,habitat);
        this.swimmingDepth = swimmingDepth;
    }
    public float getSwimmingDepth(){
        return swimmingDepth;
    }
    public String toString() {
        return super.toString() + ", Profondeur de nage=" + swimmingDepth + " metres";
    }

    public void swim() {
        System.out.println("Penguin nage.");
    }
}
