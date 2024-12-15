package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatic {
    float swimmingSpeed;

    public Dolphin(String family,String name,int age,boolean isMammal, String habitat, float swimmingSpeed) {
        super(family, name, age, isMammal,habitat);
        this.swimmingSpeed = swimmingSpeed;
    }
    public float getSwimmingSpeed(){
        return swimmingSpeed;
    }
    @Override
    public String toString() {
        return super.toString() + ", Vitesse de nage = " + swimmingSpeed + " km/h";
    }

    @Override
    public void swim() {
        System.out.println("Dolphin nage.");
    }
}
