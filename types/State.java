package types;

public class State {
    String defaultVar = "default";
    private String privateVar = "private";
    protected String protectedVar = "protected";
    public String publicVar = "public";

    void printDefault() {
        System.out.println(defaultVar);
    }

    private void printPrivate() {
        System.out.println(privateVar);
    }

    protected void printProtected() {
        System.out.println(protectedVar);
    }

    public void printPublic() {
        System.out.println(publicVar);
    }
}
