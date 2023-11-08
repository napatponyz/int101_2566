package work03;

import work01.Utility;
import work02.Person;

public class Account {
    private static long nextNo = 100000000;
    private final long no;
    private Person owner;
    private double balance;


    public Account(Person owner){
        this.owner = owner;
        if (this.owner == null){throw new NullPointerException(" the owner is null");}
        int result = Utility.computeIsbn10(nextNo);
        while(result == 10) {
            nextNo++;
            result = Utility.computeIsbn10(nextNo);
        }
        this.no = 10 * nextNo + result;
        nextNo++;
    }

    public long getNo() {
        return no;
    }

    public Person getOwner() {
        return owner;
    }

    public double getBalance() {
        return balance;
    }

    public double deposit(double amount){
        Utility.testPositive(amount);
        this.balance += amount;
        return this.balance;
    }
    public boolean withdraw(double amount){
        if (Utility.testPositive(amount) > 0.00){
            this.balance -= amount;
            return true;
        }else return false;


    }

    public String transfer(double amount,Account account){
        Utility.testString(account.toString());
        if (withdraw(amount)){
            account.deposit(amount);
        }
        return new StringBuilder("Amount "+amount).append(" ,To "+account).toString();


    }
    @Override
    public String toString(){
        return new StringBuilder("Account ").append(" No "+no).append(" Balance "+balance).toString();
    }
    @Override
    public boolean equals(Object obj){
        if (obj.getClass() != getClass()){return false;}
        if(((Account) obj).getNo() == getNo()){return true;}
        if (((Account) obj).getOwner().equals(getOwner())){return true;}
        if (((Account) obj).getBalance() == getBalance()){return true;}
        else return false;
    }
}
 /*3.10 a public method named "transfer" that recieves a "double" parameter
            named "amount" and an "Account" parameter named "account".
            This method throws IllegalArgumentException if "account" is null,
            or it cannot "withdraw" the "amount" from this object. Otherwise,
            this method "withdraw" the "amount" from this object and "deposit"
            the "amount" to the "account" object.  This method returns nothing.
       3.11 @Override a public "toString" method that returns
            "Account(no,balance)" where "no" and "balance" are
            the "no" and "balance" fields of this object.
       3.12 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       3.13 Show in this "work03Account" method how to use 3.6-3.12
            and check their correctness. */