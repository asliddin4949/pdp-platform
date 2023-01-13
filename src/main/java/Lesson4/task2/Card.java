package Lesson4.task2;

import java.math.BigDecimal;

public class Card {
    int id;
    String owner;
    BigDecimal balance;
    CardType cardType;

    public Card(int id, String owner, BigDecimal balance, CardType cardType) {
        this.id = id;
        this.owner = owner;
        this.balance = balance;
        this.cardType = cardType;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
