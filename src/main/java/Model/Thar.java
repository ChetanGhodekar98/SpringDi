package Model;

public class Thar implements  Car{
    private Engine engine;

    public Thar(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void getCarInformation() {
        System.out.println("CAR NAME IS THAR");
        System.out.println("OFF-ROADING CAR");
        System.out.println("CAR PRICE IS 1599999.99");
    }

    @Override
    public void getEngineInformation() {
            engine.getEngineInformation();
    }
}
