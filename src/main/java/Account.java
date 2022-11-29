/**
 * Simple Account class to represent an account
 *
 * @author jon.brown
 */

public class Account {

    private String name;
    private double balance = 0;

    public Account(String name, double balance){
        this.name = name;
        if(balance > 0){
            this.balance = balance;
        }
    }


    /**
     * Get the account name
     * @return name
     */
    public String getName() {
        return this.name;
    }


    /**
     * Set the account name
     * @param name account name
     */
    public void setName(String name) {
        this.name = name;
    }


    /**
     * Get the account balance
     * @return balance
     */
    public double getBalance() {
        return balance;
    }


    /**
     * Method resets account balance to 0
     */
    public void reset(){
        this.balance = 0;
    }


    /**
     * Method deposits money into account
     * amount must be more than 0
     * @param amount amount to deposit
     */
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance = this.balance + amount;
        }
        else {
            System.out.println("Deposit amount should be more than 0");
        }
    }


    /**
     * Method withdraws money from account
     * Withdraw amount cannot exceed balance and must be more than 0
     * @param amount amount to withdraw
     */
    public void debit(double amount){
        //Check for positive value
        if(amount > 0) {
            //Ensure debit amount is less than balance
            if (amount > balance) {
                System.out.println("Debit amount exceeded account balance.");
            }

            else {
                this.balance = this.balance - amount;
            }
        }

        else {
            System.out.println("Debit amount should be more than 0.");
        }
    }
}


