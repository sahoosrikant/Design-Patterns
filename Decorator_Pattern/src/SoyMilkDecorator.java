public class SoyMilkDecorator extends Beverage{
    Beverage beverage;

    public SoyMilkDecorator(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public double getCost() {
        return (beverage.getCost() + 20);
    }

    @Override
    public String getDesc() {
        return (beverage.getDesc() + " we added soy milk here");
    }
}
