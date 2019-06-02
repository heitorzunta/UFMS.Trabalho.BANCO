package model.entities;

public class EasyAccount extends Accountant {

    public EasyAccount(int accountNumber, Client client) {
        super(accountNumber, new Agency(22222,"Online", null), client);
    }

    // Método deposito na EasyAccount
    @Override
    public boolean deposit (double value){
        if (getAmount() + value <= 5000.00) {
            super.deposit(value);
            return true;
        }
        else return false;
    }

    //Metodo transferencia na EasyAccount
    @Override
    public boolean transfer(Account transferAccount, double value){
        if (getQtdTransfer() < 1) return super.transfer(transferAccount, value);
        else return false;
    }

    //Metodo de saque na EasyAccount
    @Override
    public boolean withdraw (double value) {
        if (getAmount() > 0 && value < getAmount() && getQtdWithdraw() <1) {
            setAmount(getAmount() - value);
            setQtdWithdraw(getQtdWithdraw()+1);
            return true;
        } else return false;
    }

}
