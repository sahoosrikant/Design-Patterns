public class ExtraShotDecorator extends BaseBeverageDecorator{

    Beverage beverage;

    public ExtraShotDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return (beverage.getCost() + 10);
    }

    @Override
    public String getDesc() {
        return (beverage.getDesc() + " we added extra shots here");
    }
}
