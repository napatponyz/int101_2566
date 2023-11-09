package int101.homework02;

import work01.Utility;
import work02.Person;
import work03.Account;
public class Int101Homework02 {

    public static void main(String[] args) {
       work01Utilitor();
       work02Person();
      work03Account();


    }

    static void work01Utilitor() {
        Utility u = new Utility();
        System.out.println(u.testString("ball"));
        System.out.println("Positive number is "+u.testPositive(23));
        System.out.println(u.computeIsbn10(243879632));
    }

    static void work02Person() {
        var person1 = new Person("Ball","Jakkapong");
        person1.setFirstname("Ball");
        person1.setLastname("Jakkapong");
        System.out.println(person1);
        System.out.println(person1.equals(person1.getId()));
        System.out.println(person1.equals(person1.getFirstname()));
        System.out.println(person1.equals(person1.getLastname()));

        var person2 = new Person("Dell","Van");
        person2.setFirstname("Dell");
        person2.setLastname("Van");
        System.out.println(person2);
        System.out.println(person2.equals(person2.getId()));
        System.out.println(person2.equals(person2.getFirstname()));
        System.out.println(person2.equals(person2.getLastname()));



    }

    static void work03Account(){
        var person1 = new Person("Ball","Jakkapong");
        Account account1 = new Account(person1);

        var person2 = new Person("Goo","Nolll");
        Account account2 = new Account(person2);

        System.out.println(account1);
        System.out.println(account1.getNo());
        System.out.println((account1.getOwner()));
        System.out.println(account1.getBalance());
        System.out.println("Deposit amount "+account1.deposit(45.89));
        System.out.println("Withdraw amount "+account1.withdraw(56.00));
        System.out.println("Transfer "+account1.transfer(34.55,account2));



        System.out.println(account2);
        System.out.println(account1);
        System.out.println("Deposit amount "+account2.deposit(1000.00));




    }
}
