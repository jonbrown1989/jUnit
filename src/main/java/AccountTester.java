public class AccountTester {
    public static void main(String[] args) {
        Account account = new Account("fed", -3);
        System.out.println(account.getName());
        account.deposit(-4);
        System.out.println(account.getBalance());


    }
}
