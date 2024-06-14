public class BankAccount {
    int balance;
    String ownerName;
    long id;

    public BankAccount(int balance, String ownerName, long id) {
        this.balance = balance;
        this.ownerName = ownerName;
        this.id = id;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "balance=" + balance +
                ", ownerName='" + ownerName + '\'' +
                ", id=" + id +
                '}';
    }

    void printInfo(){
        System.out.println(ownerName);
        System.out.println(balance);
        System.out.println(id);
    }
    public static void main(String[] args) {
        BankAccount acc = new BankAccount(50000, "Honza", 125645341);
//        System.out.println(acc.ownerName);
//        System.out.println(acc.balance);
//        System.out.println(acc.id);
//        acc.printInfo();
        System.out.println(acc);
    }
}
