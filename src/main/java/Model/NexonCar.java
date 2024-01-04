package Model;

public class NexonCar implements Car{
    private Engine engine;

    public NexonCar(Engine engine) {
        this.engine = engine;
    }
    @Override
    public void getCarInformation() {
        System.out.println("CAR NAME IS NEXON");
        System.out.println("CAR PRICE IS 129999.99");
    }
    @Override
    public void getEngineInformation() {
                engine.getEngineInformation();
    }
}
