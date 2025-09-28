package ru.tiayeah.core;

import java.math.BigDecimal;

public class UserBalanceDTO {
    private int id;
    private BigDecimal balance;

    public UserBalanceDTO() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserBalanceDTO{" +
                "id=" + id +
                ", balance=" + balance +
                '}';
    }
}
