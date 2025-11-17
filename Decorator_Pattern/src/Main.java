public class Main {
    public static void main(String[] args){
        Beverage beverage = new SoyMilkDecorator(new ExtraShotDecorator(new Espresso()));

        System.out.println("Total Cost :" + beverage.getCost());
        System.out.println("Full Description :" + beverage.getDesc());
    }
}
