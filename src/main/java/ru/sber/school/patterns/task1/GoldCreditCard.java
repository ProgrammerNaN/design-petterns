package ru.sber.school.patterns.task1;

public class GoldCreditCard implements CreditCard {
    private int supportCost;
    private int creditLimit;

    public GoldCreditCard() {
        supportCost = 3500;
        creditLimit = 600_000;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount);
    }

    @Override
    public String getCardInfo() {
        return "Gold credit card: support cost - " + supportCost + ", creditLimit - " + creditLimit;
    }
}
