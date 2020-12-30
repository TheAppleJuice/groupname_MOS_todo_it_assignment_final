package se.lexicon.data;

public class PersonSequencer {
    private static int sequencer = 0;

    public static int nextPersonId(){
        return ++sequencer;
    }
}
