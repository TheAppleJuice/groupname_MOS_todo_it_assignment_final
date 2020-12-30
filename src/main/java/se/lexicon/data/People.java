package se.lexicon.data;
import se.lexicon.model.Person;

public class People {
    private static Person[] peopleArray= new Person[0];

    public int size() {
        return peopleArray.length;
    }
    public Person[] findAll(){
        // witch of the return types below is valid for the argument?
        //return new Person[0];
        //return peopleArray;
    }

    public Person findById(int PERSONID) {
        //return ???? ;
    }

}
