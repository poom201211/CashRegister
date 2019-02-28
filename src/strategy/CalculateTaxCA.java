package strategy;

public class CalculateTaxCA implements CalculateTaxBehavior {
    @Override
    public double calculateTax(double purchase) {
        purchase = purchase + (purchase*0.075);
        return purchase;
    }
}
