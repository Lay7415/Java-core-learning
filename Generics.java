public class Generics {
    public static void main(String[] args) {
        Account<String> acc1 = new Account("acc123", 5000);
        Account<String> acc2 = new Account("acc23432", 43300);
        System.out.println(acc1.getId());
        System.out.println(acc2.getId());
        Account.<String>helloMessage("asdjlfaskdjf");

    }
}

interface Accountable<T> {
    T getId();

    int getSum();

    void setSum(int sum);
}

class Account<T> implements Accountable<T> {
    private T id;
    private int sum;

    Account(T id, int sum) {
        this.id = id;
        this.sum = sum;
    }

    public T getId() {
        return id;
    }

    public int getSum() {
        return this.sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    public static <O> void helloMessage(O obj) {
        System.out.println(obj);
    }
}
