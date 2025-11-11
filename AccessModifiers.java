import types.State;

public class AccessModifiers {
    public static void main(String[] args) {
        State state = new State();
        state.printDefault();
        state.printPrivate();
        state.printProtected();
        state.printPublic();
    }
}
