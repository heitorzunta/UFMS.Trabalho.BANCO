package model.entities;

// CLASSE CONTA - CORRENTE

import model.enums.ClientType;

import static model.entities.TableRate.*;

public class OpenAccount extends Accountant {

    private Integer qtdCheque;
    private Double loanValue=0.0;

    public OpenAccount(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public int getQtdCheque() {
        return qtdCheque;
    }

    public void setQtdCheque(int qtdCheque) {
        this.qtdCheque = qtdCheque;
    }

    public Double getLoanValue() {
        return loanValue;
    }

    //metodo para emitir Cheque
    public void issueCheque(){
        qtdCheque++;
    }

    //metodo para emprestimo
    public boolean loan(double value){

        if(getClient().getClasse().equals(ClientType.PREMIUM) && this.loanValue+value <= LOAN_CLIENT_PREMIUM){
            deposit(value);
            this.loanValue += value;
            return true;
        }

        if(getClient().getClasse().equals(ClientType.TRADICIONAL) && this.loanValue+value <= LOAN_CLIENT_TRADITIONAL){
            deposit(value);
            this.loanValue += value;
            return true;
        }
        else return false;
    }

    //calculo de juros do emprestimo
    public void interestLoan(){
        loanValue*=(1+LOAN_INTEREST);
    }

}

