import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    Account account;
    public static final String NAME = "Ted Tester";
    public static final int BALANCE = 5;

    @BeforeEach
    void setUp() {
        account = new Account(NAME, BALANCE);
    }

    @Test
    void getName() {
        assertEquals("Ted Tester", account.getName());
    }

    @Test
    void setName() {
        account.setName("Ned Tester");
        assertEquals("Ned Tester", account.getName());
    }

    @Test
    void getBalance() {
        assertEquals(5, account.getBalance());
    }

    @Test
    @DisplayName("Test Account Constructor for negative balance")
    void Account() {
        account = new Account("Fred Tester", -5);
        assertEquals(0, account.getBalance());
    }

    @Test
    @DisplayName("Test various account methods in sequence")
    void AccountSequence() {
        assertEquals("Ted Tester", account.getName());
        assertEquals(5, account.getBalance());
        account.deposit(-5);
        assertEquals(5, account.getBalance()); //negative deposit failed, balance remains the same
        account.deposit(5);
        assertEquals(10, account.getBalance());
        account.debit(11);
        assertEquals(10, account.getBalance());//Debit overage fails, so no money withdrawn and balance remains the same
        account.debit(9);
        assertEquals(1, account.getBalance()); //final expected balance

    }
}