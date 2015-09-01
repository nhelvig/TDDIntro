package com.thoughtworks.tddintro.accountbalance;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class AccountTests {
    @Test
    public void shouldIncreaseMyBalanceWhenIDepositMoney(){
        Account account = new Account(100);

        account.deposit(50);

        assertThat(account.getBalance(), is(150));
    }
//
//    @Test
//    public void shouldDecreaseMyBalanceWhenIWithdrawMoney(){
//
//    }
//
//    @Test
//    public void shouldNotDecreaseMyBalanceWhenIWithdrawMoneyAndDoNotHaveEnoughToCoverTheWithdrawal(){
//
//    }
}
