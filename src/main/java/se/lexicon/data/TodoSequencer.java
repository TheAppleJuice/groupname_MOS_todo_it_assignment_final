package se.lexicon.data;

public class TodoSequencer {
    private static int sequencer = 0;

    public static int nextTodoId() {
        return ++sequencer;
}
}
