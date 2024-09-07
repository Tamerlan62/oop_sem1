public class HotDrinks extends Product {
    private int temperature;

    public HotDrinks(String name, int price) {
        super(name, price);
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    @Override
    public String toString() {
        return "HotDrinks [temperature=" + temperature + "]";
    }

    
}
