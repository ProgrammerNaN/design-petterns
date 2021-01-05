package ru.sber.school.patterns.task1;

public class CreditCardFactory {

    public static CreditCard createCreditCard(CreditCardType creditCardType) {
        switch (creditCardType){
            case CLASSIC:
                return new ClassicCreditCard();
            case GOLD:
                return new GoldCreditCard();
            case AIRFLOT:
                return new AirflotCreditCard();
            default:
                return null;
        }
    }

}
