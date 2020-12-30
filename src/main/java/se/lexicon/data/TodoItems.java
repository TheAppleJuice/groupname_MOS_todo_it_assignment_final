package se.lexicon.data;

import se.lexicon.model.Todo;

public class TodoItems {
    private static Todo[] todoArray= new Todo[0];

    public int size() {
        return todoArray.length;
    }
    public Todo[] findAll(){
        // witch of the return types below is valid for the argument?
        //return new Todo[0];
        //return todoArray;
    }

    public Todo findById(int TODOID) {
        //return ????;
    }
}
