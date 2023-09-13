package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashbackHackServiceTest {
    @Test
    public void beforeBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;

        assertEquals(expected, actual);
    }

    @Test
    public void thenAmountZero() {
        CashbackHackService service = new CashbackHackService();
        int amount = 0;
        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);
    }

    @Test
    public void afterBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1005;
        int actual = service.remain(amount);
        int expected = 995;

        assertEquals(expected, actual);
    }

    @Test
    public void afterMinusBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = -5;
        int actual = service.remain(amount);
        int expected = 1005;

        assertEquals(expected, actual);
    }
    @Test
    public void amountEqualsBoundary() {
        CashbackHackService service = new CashbackHackService();
        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);
    }
}

