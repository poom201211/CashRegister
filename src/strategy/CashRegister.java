package strategy;

public class CashRegister {
    private double purchase; // total amount of product price bought
    private double payment;  // total amount of payment
    private CalculateTaxBehavior calculateTaxBehavior;

    public CashRegister(CalculateTaxBehavior tax) {
        purchase = 0;
        payment = 0;
        calculateTaxBehavior = tax;
    }

    public void recordPurchase(double amount) {
        purchase += amount;
    }

    public void enterPayment(double amount) {
        payment += amount;
    }

    public void calculateTax(){
        calculateTaxBehavior.calculateTax(purchase);
    }

    public double giveChange() {
        double change = payment - purchase;
        purchase = 0;
        payment = 0;
        return change;
    }
}
