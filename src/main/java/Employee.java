/**
 * Simple Employee class to represent an employee
 *
 * @author jon.brown
 */
public class Employee {
    private String firstName;
    private String lastName;
    private double monthlySalary;

    /**
     * Constructor for the Employee class
     * @param firstName- the employee's first name
     * @param lastName- the employee's last name
     * @param monthlySalary- the employee's monthly salary
     */
    public Employee(String firstName, String lastName, double monthlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monthlySalary = monthlySalary;
    }

    /**
     * Get the employee's first name
     * @return firstName
     */
    public String getFirstName() {
        return this.firstName;
    }

    /**
     * Set the employee's first name
     * @param firstName employee's first name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * Get the employee's last name
     * @return lastName
     */
    public String getLastName() {
        return this.lastName;
    }

    /**
     * Set the employee's last name
     * @param lastName employee's last name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * Get the employee's monthly salary
     * @return montlysalary
     */
    public double getSalary() {
        return this.monthlySalary;
    }

    /**
     * Set the employee's monthly salary
     * @param monthlySalary employee's monthly salary
     */
    public void setSalary(double monthlySalary) {
        if(monthlySalary > 0) {
            this.monthlySalary = monthlySalary;
        }
    }

    /**
     * Method returns employee's monthly salary with a percentage
     * raise applied.
     * @param raisePercentage Raise percentage to be applied
     */
    public double giveRaise(double raisePercentage){
        double salaryWithRaise = this.monthlySalary;
        salaryWithRaise += (raisePercentage/100) * monthlySalary;
        return salaryWithRaise;
    }
}

