package entity;

import java.util.HashMap;
import java.util.Map;

public class State {

    private String name;
    private Map<State,Character> transitions;

    State(){
        this.name = "q0";
        this.transitions = new HashMap<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<State, Character> getTransitions() {
        return transitions;
    }

//    public void addTransition()
}
