public class BankApp {
    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(100.00); // создание счета

        System.out.print("Before transactions: ");
        bankAccount.display(); // вывод баланса

        bankAccount.deposit(74.35); // внесение средств
        bankAccount.withdraw(20.00); // снятие средств

        System.out.print("After transactions: ");
        bankAccount.display(); // вывод баланса
    }
}


