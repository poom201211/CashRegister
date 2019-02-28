package strategy;

public class CalculateTaxThailand implements CalculateTaxBehavior {
    @Override
    public double calculateTax(double purchase) {
        purchase = purchase + (purchase*0.07);
        return purchase;
    }
}
