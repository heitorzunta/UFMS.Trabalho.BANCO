package model.entities;

import static model.entities.TableRate.YIELD;

public class SavingsAccount extends Account{

    public
    SavingsAccount(Agency agency, Client client) {
        super(agency, client);
    }

    public void addYield(){ //Calcula o rendimento da poupanca e acrescenta ao montante
        deposit(getAmount()*YIELD);
    }
}
