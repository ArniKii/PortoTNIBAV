public class Barca {
    private String name, nat;
    private float width, weight;
    private boolean engine;
    public Barca (String nome, float peso, float lunghezza, String nati, boolean motore){
        name = nome;
        weight = peso;
        width = lunghezza;
        nat = nati;
        engine = motore;
    }
    public void setEngine(boolean engine) {
        this.engine = engine;
    }public void setName(String name) {
        this.name = name;
    }public void setNat(String nat) {
        this.nat = nat;
    }public void setWeight(float weight) {
        this.weight = weight;
    }public void setWidth(float width) {
        this.width = width;
    }public String getName() {
        return name;
    }public String getNat() {
        return nat;
    }public float getWeight() {
        return weight;
    }public float getWidth() {
        return width;
    }public boolean getEngine(){
        return engine;
    }
}
