package JavaCompleto2019.S4;

public class Account {
    private int accountNumber;
    private String name;
    private double funds;

    public Account(int accountNumber, String name) {
        this.accountNumber = accountNumber;
        this.name = name;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void fazerDeposito(double valor){
        funds += valor;
        System.out.println("Deposito realizado com sucesso." + "\n" +
                "Novo saldo é de R$ " + getFunds());
    }

    public  void fazerSaque(double valor){
//        if(valor>funds){
//            System.out.println("Saldo insuficiente. " +
//                    "Saldo atual: R$"+funds);
//        }
            funds-=(valor+5);
            System.out.println("Saque realizado com sucesso." +
                    "Novo saldo é de R$ "+funds);

    }

    public String toString(){
        return "Accont Data:" + "\n" +
                "Account "+getAccountNumber()
                + ", Holder: " + getName()
                + ", Balance: $ " + getFunds();

    }
}
