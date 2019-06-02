package model.entities;

import model.enums.ClientType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Client {

    private String cpf;
    private String name;
    private Date birthDate;
    private Address reside;
    private ClientType classe;
    private int accountsAssocieted = 0;


    public
    Client(String cpf, String name, Date birthDate, Address reside, ClientType classe)  {
        this.cpf = cpf;
        this.name = name;
        this.birthDate = birthDate;
        this.reside = reside;
        this.classe = classe;
    }

    public
    String getCpf() {
        return cpf;
    }

    public
    void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    Date getBirthDate() {
        return birthDate;
    }

    public
    void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public
    Address getReside() {
        return reside;
    }

    public
    void setReside(Address reside) {
        this.reside = reside;
    }

    public
    ClientType getClasse() {
        return classe;
    }

    public
    void setClasse(ClientType classe) {
        this.classe = classe;
    }

    //Adiciona e remove o total de contas associadas ao cliente
    public void addAccountsAssocieted() {
        this.accountsAssocieted = accountsAssocieted++;
    }
    public void removeAccountsAssocieted() {
        this.accountsAssocieted = accountsAssocieted--;
    }

    @Override
    public String toString(){
        StringBuilder clientInfo = new StringBuilder();

        clientInfo.append("NAME: " + name);
        clientInfo.append("\n");
        clientInfo.append("QUANTITY ACCOUNTS: " + accountsAssocieted);
        clientInfo.append("\nTIPO: " + classe);

        return clientInfo.toString();
    }

}
