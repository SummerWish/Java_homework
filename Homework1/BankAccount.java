public class BankAccount {
    private int _balance = 0;

    public void creation(int balance) {
        System.out.println("creation() called.");
        _balance = balance;
    }

    public int balance() {
        System.out.println("balance() called.");
        return _balance;
    }

    public int deposit(int val) {
        System.out.println("deposit() called.");
        if (val <= 0) {
            System.out.println("Warning: Invalid deposit value, deposit failed.");
        } else {
            _balance += val;
        }
        return _balance;
    }

    public int withdraw(int val) {
        System.out.println("withdraw() called.");
        if (_balance - val < 0) {
            System.out.println("Warning: Insufficient balance.");
            _balance = 0;
        } else {
            _balance -= val;
        }
        return _balance;
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.creation(1351633);

        assert account.balance() == 1351633;

        account.deposit(100);
        assert account.balance() == 1351733;

        account.deposit(0);
        assert account.balance() == 1351733;

        account.deposit(-10000);
        assert account.balance() == 1351733;

        account.withdraw(100);
        assert account.balance() == 1351633;

        account.withdraw(1352978);
        assert account.balance() == 0;
    }
}
