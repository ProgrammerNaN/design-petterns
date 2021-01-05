package ru.sber.school.patterns.task1;

public class Runner {
    public static void main(String[] args) {
        CreditCard creditCard = CreditCardFactory.createCreditCard(CreditCardType.CLASSIC);
        System.out.println(creditCard.getCardInfo());
        creditCard = CreditCardFactory.createCreditCard(CreditCardType.GOLD);
        System.out.println(creditCard.getCardInfo());
        creditCard = CreditCardFactory.createCreditCard(CreditCardType.AIRFLOT);
        System.out.println(creditCard.getCardInfo());
    }
}
