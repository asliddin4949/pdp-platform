package Lesson4.task2;

import java.math.BigDecimal;

public class Task2 {
    public static void main(String[] args) {

        Card card1 = new Card(1, "user1", BigDecimal.valueOf(100000l), CardType.HUMO);
        Card card2 = new Card(2, "user2", BigDecimal.valueOf(200000l), CardType.HUMO);
        Card card3 = new Card(3, "user3", BigDecimal.valueOf(200000l), CardType.VISA);
        try {
            sendMoney(card1, card2, BigDecimal.valueOf(120000));
        } catch (NotEnoughMoney | CardTypeNotMatch e) {
            System.out.println(e.getMessage());
        }
        try {
            sendMoney(card2, card3, BigDecimal.valueOf(120000));
        } catch (NotEnoughMoney | CardTypeNotMatch e) {
            System.out.println(e.getMessage());
        }


    }

    public static void sendMoney(Card from, Card to, BigDecimal money) throws NotEnoughMoney, CardTypeNotMatch {
        if (from.cardType.equals(to.cardType) && (from.balance.compareTo(to.balance) != -1)) {
            from.setBalance(from.getBalance().subtract(money));
            to.setBalance(to.getBalance().add(money));
        } else if (!from.cardType.equals(to.cardType) && (from.balance.compareTo(to.balance) != -1)) {
            throw new CardTypeNotMatch();
        } else if (from.cardType.equals(to.cardType) && from.balance.compareTo(to.balance) == -1) {
            throw new NotEnoughMoney();
        }
    }
}
