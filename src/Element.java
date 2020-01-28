public class Element {
    private double weight, value;
    private String name;

    public Element(String name, double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.name = name;
    }
    public Element(Element orig) {
        this.weight = orig.weight;
        this.value = orig.value;
        this.name = orig.name;
    }

    public double getWeight() {
        return weight;
    }

    public double getValue() {
        return value;
    }

    public String getName() {
        return name;
    }
}