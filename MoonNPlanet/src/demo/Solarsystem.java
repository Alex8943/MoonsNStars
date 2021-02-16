package demo;

public abstract class Solarsystem {
    //Comon atributes mellem måner og planeter: orbit, mass
  private String mass; //in kg

    public abstract String orbit();

    public String getMass(){
        return mass;
    }

    public void setMass(String mass){
        this.mass = mass;
    }
}
