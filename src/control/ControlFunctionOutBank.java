package control;


import model.entities.*;

import java.util.List;

import static control.ControlFunctionInBank.FUNCTION_WITHDRAW;

public class ControlFunctionOutBank {

    public static Agency verAgencia(List<Agency> agencia, int inteiro){
        Agency agenciaTeste = new Agency(inteiro);
        int indice = agencia.indexOf(agenciaTeste);

        if(indice != -1) return agencia.get(indice);
        else return null;
    }

    public static Client verCliente(List<Client> listClient, String cpf){
        Client cliente = new Client(cpf);
        int indice = listClient.indexOf(cliente);
        if(indice != -1) return cliente = listClient.get(indice);
        else return cliente = null;
    }

    public static Account verConta(List<Account> listaConta, int num){
        for(Account conta: listaConta) {
            if (conta.getAccountNumber() == num) return conta;
            break;
        }
            return null;
    }

    public static Account startAccount(Agency agencia, Client cliente, char tipo){
        Account conta;
        switch (tipo){
            case('C'):
                conta = new OpenAccount(agencia, cliente);
                break;

            case('P'):
                conta = new SavingsAccount(agencia, cliente);
                break;

            case ('F'):
                conta = new EasyAccount(cliente);
                break;

            default:
                conta = null;
                break;
        }
        return conta;
    }

    public static void saque(List<Account> accountList, int numAgencia, int numConta, double valor){
        Account conta = verConta(accountList, numConta);

        if(conta != null){
            if(conta.getAgency().getCodAgency() == numAgencia) FUNCTION_WITHDRAW(conta, valor);
            else System.err.println("NUMERO DA AGENCIA INVÁLIDA");
        }
        else System.err.println("NUMERO DA CONTA INVÁLIDO");
    }

}
