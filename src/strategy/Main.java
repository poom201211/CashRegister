package strategy;

public class Main {

    public static void main(String[] args) {
        CashRegister cashRegister = new CashRegister(new CalculateTaxCA());
        cashRegister.recordPurchase(30);
        cashRegister.calculateTax();
        cashRegister.enterPayment(100);
        System.out.println(cashRegister.giveChange());
    }
}

