package ru.sber.school.patterns.task1;

public class ClassicCreditCard implements CreditCard {

    private int supportCost;
    private int creditLimit;

    public ClassicCreditCard() {
        supportCost = 0;
        creditLimit = 600_000;
    }

    @Override
    public void pay(int amount) {
        System.out.println("Payed " + amount);
    }

    @Override
    public String getCardInfo() {
        return "Classic credit card: support cost - " + supportCost + ", creditLimit - " + creditLimit;
    }
}
