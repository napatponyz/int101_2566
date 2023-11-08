package work02;
import work01.Utility;
import work03.Account;
public class Person {
    private static int nextId = 1;
    private int id;
    private String firstname;
    private String lastname;

      public Person( String firstname, String lastname){
          this.firstname = Utility.testString(firstname);
          this.lastname = Utility.testString(lastname);

          this.id = nextId;
          nextId++;
      }
      @Override
        public String toString(){
        return new StringBuilder("Person , ").append(" id = "+id).append(" , firstname = "+firstname)
            .append(" ,lastname = "+lastname).toString();
      }

    public int getId() {
        return id;
    }
    public String getFirstname(){
          return firstname;
    }
    public String getLastname(){
          return  lastname;
    }


    public void setFirstname(String firstname) {
        this.firstname = Utility.testString(firstname);
    }

    public void setLastname(String lastname) {
        this.lastname = Utility.testString(lastname);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) {
            return true;
        }
        return false;
    }
}

    /*
       2.1 Create a public class named "Person" in package named "work02Person".
           This class contains the following fields and methods.
       2.2 a private static field of type "int" named "nextId" initialized to 1.
       2.3 a private final field of type "int" named "id".
       2.4 a private field of type "String" named "firstname".
       2.5 a private field of type "String" named "lastname".
       2.6 a public constructor that receives "firstname" and "lastname"
           parameters to set the values of "firstname" and "lastname" fields.
           Check the correctness of the values of "firstname" and "lastname"
           parameters with "Utilitor.testString" method first.
           If nothing is wrong, set the value of "id" field to be the value
           of "nextId" field and increment the value of "nextId" by 1.
       2.7 @Override a public "toString" method that returns
           "Person(id,firstname,lastname)" where id, firstname, and lastname
           are the values of the coresponding fields of this "Person" object.
           Use "StringBuilder" to build the output string.
       2.8 public getters for "id", "firstname", and "lastname" fields.
       2.9 public setters for "firstname" and "lastname" fields.
           Use the "Utilitor.testString" method to check the correctness
           of the parameters first.
       2.10 @Override a public "equals" method that returns true
            if this object is the same as the object in the parameter
            (i.e., the same reference). Otherwise, it returns false.
       2.11 Show in this "work02Person" method how to use 2.6-2.10
            and check their correctness. */

