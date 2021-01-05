package ru.sber.school.patterns.task1;

public class AirflotCreditCard implements CreditCard {
    private int supportCost;
    private int creditLimit;

    public AirflotCreditCard() {
        supportCost = 12_000;
        creditLimit = 3_000_000;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount);
    }

    @Override
    public String getCardInfo() {
        return "Airflot credit card: support cost - " + supportCost + ", creditLimit - " + creditLimit;
    }
}
