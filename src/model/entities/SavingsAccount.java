package model.entities;

import static model.entities.TableRate.YIELD;

public class SavingsAccount extends Account{

    public
    SavingsAccount(int accountNumber, Agency agency, Client client) {
        super(accountNumber, agency, client);
    }

    public void addYield(){ //Calcula o rendimento da poupanca e acrescenta ao montante
        deposit(getAmount()*YIELD);
    }
}
