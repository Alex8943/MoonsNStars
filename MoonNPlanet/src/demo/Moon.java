package demo;

public class Moon extends Solarsystem{

    private String name;
    private Planet type;

    public Moon(String name, Planet planet) {
        this.name = name;
        this.type = planet;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Planet getType() {
        return type;
    }

    public void setType(Planet type) {
        this.type = type;
    }

    @Override
    public String orbit() {
        return "27";
    }
}
