package se.lexicon.model;

public class Person {
    private final int PERSONID;
    //Sequenser for final int PERSONID
    private static int sequenserPERSONID = 0;
    private String firstName;
    private String lastName;

    public Person() {
        this.PERSONID = ++sequenserPERSONID;
    }

    public int getPERSONID() {
        return PERSONID;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}