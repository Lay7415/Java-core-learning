public class InheritanceAndGeneralizations {
    public static void main(String[] args) {
        DepositAccount<Integer, String> dAccount1 = new DepositAccount(20, "Tom");
        System.out.println(dAccount1.getId() + " : " + dAccount1.getName());

        DepositAccount<String, Integer> dAccount2 = new DepositAccount("12345", 23456);
        System.out.println(dAccount2.getId() + " : " + dAccount2.getName());
    }
}

class Account<T> {
    private T _id;

    T getId() {
        return this._id;
    }

    Account(T id) {
        this._id = id;
    }
}

class DepositAccount<T, S> extends Account<T> {
    private S _name;

    S getName() {
        return this._name;
    }

    DepositAccount(T id, S name) {
        super(id);
        this._name = name;
    }
}