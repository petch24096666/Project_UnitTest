
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

import org.example.*;
import org.junit.jupiter.api.Test;
import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;

public class AccountTest{
    @Test
    public void testCalcCheckingDeposit(){
        Account account= new Account(1234, 1234, 2000, 0);
        double DepositAmount = 200;
        double newBalance = account.calcCheckingDeposit(DepositAmount);
        assertEquals(2200, newBalance);
        assertEquals(2200, account.getCheckingBalance());

        Account account2= new Account(12345, 12345, 2000, 0);
        double DepositAmount2 = 1200;
        double newBalance2 = account2.calcCheckingDeposit(DepositAmount2);
        assertEquals(3200, newBalance2);
        assertEquals(3200, account2.getCheckingBalance());

        Account account3 = new Account(2211, 2211, 3000, 0);
        double DepositAmount3  = 200;
        double newBalance3 = account3.calcCheckingDeposit(DepositAmount3);
        assertEquals(3200, newBalance3);
        assertEquals(3200, account3.getCheckingBalance());

        Account account4= new Account(1122, 1122, 3000, 0);
        double DepositAmount4 = 1200;
        double newBalance4 = account4.calcCheckingDeposit(DepositAmount4);
        assertEquals(4200, newBalance4);
        assertEquals(4200, account4.getCheckingBalance());
    }
    @Test
    public void testCalcSavingDeposit(){
        Account account1 = new Account(12345, 54321, 0, 4000);
        double SavingAmount1 = 3000;
        double newSavingBalance1 = account1.calcSavingDeposit(SavingAmount1);
        assertEquals(7000, newSavingBalance1);
        assertEquals(7000, account1.getSavingBalance());

        Account account2 = new Account(1234, 54321, 0, 2300);
        double SavingAmount2 = 3000;
        double newSavingBalance2 = account2.calcSavingDeposit(SavingAmount2);
        assertEquals(5300, newSavingBalance2);
        assertEquals(5300, account2.getSavingBalance());
        }

        @Test
    public void testCalcCheckingWithdraw(){
            Account account1 = new Account(12345, 54321, 2000, 0);
            double WithdrawAmount1 = 500;
            double newCheckingBalance1 = account1.calcCheckingWithdraw(WithdrawAmount1);
            assertEquals(1500, newCheckingBalance1);
            assertEquals(1500, account1.getCheckingBalance());

            Account account2 = new Account(1234, 54321, 2000, 0);
            double WithdrawAmount2 = 1500;
            double newCheckingBalance2 = account2.calcCheckingWithdraw(WithdrawAmount2);
            assertEquals(500, newCheckingBalance2);
            assertEquals(500, account2.getCheckingBalance());

            Account account3 = new Account(1234, 54321, 5000, 0);
            double WithdrawAmount3 = 500;
            double newCheckingBalance3 = account3.calcCheckingWithdraw(WithdrawAmount3);
            assertEquals(4500, newCheckingBalance3);
            assertEquals(4500, account3.getCheckingBalance());

            Account account4 = new Account(1234, 54321, 5000, 0);
            double WithdrawAmount4 = 1500;
            double newCheckingBalance4 = account4.calcCheckingWithdraw(WithdrawAmount4);
            assertEquals(3500, newCheckingBalance4);
            assertEquals(3500, account4.getCheckingBalance());
    }

    @Test
    public void testCalcSavingWithDraw(){
        Account account1 = new Account(12345, 54321, 2000, 4000);
        double WithdrawAmount1 = 4000;
        double newCheckingBalance1 = account1.calcSavingWithdraw(WithdrawAmount1);
        assertEquals(0, newCheckingBalance1);
        assertEquals(0, account1.getSavingBalance());

        Account account2 = new Account(112245, 1122, 2000, 10000);
        double WithdrawAmount2 = 3000;
        double newCheckingBalance2 = account2.calcSavingWithdraw(WithdrawAmount2);
        assertEquals(7000, newCheckingBalance2);
        assertEquals(7000, account2.getSavingBalance());
    }

    @Test
    public void testCalcCheckTransfer(){
        Account account = new Account(1234, 1234, 800, 800);
        double transferAmount = 400;
        account.calcCheckTransfer(transferAmount);
        assertEquals(400, account.getCheckingBalance());
        assertEquals(1200, account.getSavingBalance());

        Account account2 = new Account(12345, 12345, 800, 2000);
        double transferAmount2 = 400;
        account2.calcCheckTransfer(transferAmount2);
        assertEquals(400, account2.getCheckingBalance());
        assertEquals(2400, account2.getSavingBalance());

        Account account3 = new Account(12345, 12345, 2000, 800);
        double transferAmount3 = 1000;
        account3.calcCheckTransfer(transferAmount3);
        assertEquals(1000, account3.getCheckingBalance());
        assertEquals(1800, account3.getSavingBalance());

        Account account4 = new Account(12345, 12345, 2000, 2000);
        double transferAmount4 = 1000;
        account4.calcCheckTransfer(transferAmount4);
        assertEquals(1000, account4.getCheckingBalance());
        assertEquals(3000, account4.getSavingBalance());
    }

    @Test
    public void testCalcSavingTransfer(){
        Account account = new Account(1234, 1234, 200, 800);
        double transferAmount = 500;
        account.calcSavingTransfer(transferAmount);
        assertEquals(700, account.getCheckingBalance());
        assertEquals(300, account.getSavingBalance());

        Account account2 = new Account(12345, 12345, 200, 9000);
        double transferAmount2 = 500;
        account2.calcSavingTransfer(transferAmount2);
        assertEquals(700, account2.getCheckingBalance());
        assertEquals(8500, account2.getSavingBalance());

        Account account3 = new Account(12345, 12345, 800, 800);
        double transferAmount3 = 1000;
        account3.calcSavingTransfer(transferAmount3);
        assertEquals(1800, account3.getCheckingBalance());
        assertEquals(-200, account3.getSavingBalance());

        Account account4 = new Account(12345, 12345, 7000, 9000);
        double transferAmount4 = 8000;
        account4.calcSavingTransfer(transferAmount4);
        assertEquals(15000, account4.getCheckingBalance());
        assertEquals(1000, account4.getSavingBalance());
    }

    @Test
    public void testGetCheckingWithdrawInput() {
        Account account = new Account(1234, 1234, 800, 800);
        double amount = 100;
        account.getCheckingWithdrawInput(amount);
        assertEquals(700, account.getCheckingBalance());
    }

    @Test
    public void testGetSavingWithdrawInput() {
        Account account = new Account(1234, 1234, 1000, 1000);
        double amount = 50;
        account.getSavingWithdrawInput(amount);
        assertEquals(950, account.getSavingBalance());
    }

    @Test
    public void testGetCheckingDepositInput() {
        Account account = new Account(1234, 1234, 1000, 1000);
        double amount = 100;
        account.getCheckingDepositInput(amount);
        assertEquals(1100, account.getCheckingBalance());
    }

    @Test
    public void testGetSavingDepositInput() {
        Account account = new Account(1234, 1234, 1000, 1000);
        double amount = 50;
        account.getSavingDepositInput(amount);
        assertEquals(1050, account.getSavingBalance());
    }
}