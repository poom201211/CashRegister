package strategy;

public class CalculateTaxNY implements CalculateTaxBehavior {

    @Override
    public double calculateTax(double purchase) {
        if (purchase > 100)
            purchase = purchase + (purchase*0.08);
        return purchase;
    }
}
