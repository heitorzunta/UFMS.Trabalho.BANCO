package model.entities;

public abstract class Accountant extends Account {

    private int qtdWithdraw = 0;

    public Accountant(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public int getQtdWithdraw() {
        return qtdWithdraw;
    }

    public void setQtdWithdraw(int qtdWithdraw) {
        this.qtdWithdraw = qtdWithdraw;
    }

    // METODO PARA O SAQUE
    public boolean withdraw (double value) {
        if (getAmount() > 0 && value < getAmount()) {
            setAmount(getAmount() - value);
            return true;
        } else return false;
    }

    //METODO DE COBRANCA DE TAXA
    public void debitTax(double value){
        setAmount(getAmount()-value);
    }
}
