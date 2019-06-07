package application;

import model.entities.*;
import model.enums.ClientType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static control.ControlFunctionInBank.*;
import static control.ControlFunctionOutBank.verCliente;

public class Teste {



        Scanner teclado = new Scanner(System.in);

    public static void main(String[] args)  throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");



//        Address enderecoAgencia = new Address("Brasil", "MS", "Campo Grande", "Afonso Pena", "Centro", "79100-000", 666);
//        Agency agencia1 = new Agency(0001, "BBB Central", enderecoAgencia);
//
//        Address enderecoCliente1 = new Address("Brasil", "MS", "Campo Grande", "Rua Bangu", "Vila Almeida", "79112-210", 210);
//
//        Date birthday = sdf.parse("26/11/1983");
//
//        Client cliente00 = new Client("996828421-15", "Heitor Zunta", birthday, enderecoCliente1, ClientType.TRADICIONAL);
//
//      //  Account easy = new EasyAccount(001, cliente00);
//
//        System.out.println("TESTE DE DADOS -----");
//        System.out.println(agencia1);
//        System.out.println(enderecoAgencia);
//        System.out.println(cliente00);
//
//        System.out.println(easy);
//        System.out.println("-------------------");
//
//      //  Client cliente01 = new Client("996828421-16", "Marcos Castro", birthday, enderecoCliente1, ClientType.TRADICIONAL);
//
//        Account open = new OpenAccount(002, agencia1, cliente01);
//
//        Account savins = new SavingsAccount(1234567, agencia1, cliente01);
//
//        System.out.println(open);
//
//        //easy.transfer(open, 100);
//       // open.deposit(8000.00);
//
//
//        System.out.println("TESTE DE DEPOSITOS-----");
//        FUNCTION_DEPOSIT(easy, 800.00);
//        FUNCTION_DEPOSIT(open, 200.00);
//        FUNCTION_DEPOSIT(savins, 3000.00);
//        System.out.println("-------------------");
//
//
//        System.out.println("TESTE DE TAXAS DE CONTAS-----");
//
//       // FUNCTION_WITHDRAW(easy, 250);
//        FUNCTION_TAX_ACCOUNT(easy);
//        FUNCTION_TAX_ACCOUNT(savins);
//        FUNCTION_TAX_ACCOUNT(open);
//
//        System.out.println(easy.getAmount());
//        System.out.println(open.getAmount());
//        System.out.println(savins.getAmount());
//        System.out.println("-------------------");
//
//
//        System.out.println("TESTE DE TAXAS DE TAXA CLIENTE----");
//        FUNCTION_TAX_CLIENT_TYPE(easy);
//        FUNCTION_TAX_CLIENT_TYPE(savins);
//        FUNCTION_TAX_CLIENT_TYPE(open);
//
//        System.out.println(easy.getAmount());
//        System.out.println(open.getAmount());
//        System.out.println(savins.getAmount());
//        System.out.println("-------------------");
//
//
//        System.out.println("TESTE DE TAXAS DE SAQUE----");
//
//        FUNCTION_WITHDRAW(easy, 100);
//        FUNCTION_WITHDRAW(open, 100);
//        FUNCTION_WITHDRAW(savins, 100);
//
//        System.out.println(easy.getAmount());
//        System.out.println(open.getAmount());
//        System.out.println(savins.getAmount());
//        System.out.println("-------------------");
//
//
//        System.out.println("-------------------");
//
//        FUNCTION_LOAN(open, 100.00);
//
//        FUNCTION_LOAN(open, 100.00);
//
//        FUNCTION_LOAN(open, 100.00);
//
//        FUNCTION_LOAN(savins, 100);
//
//        System.out.println(open.getAmount());
//
//        FUNCTION_LOAN_INTERST(open);
//
//        //FUNCTION_WITHDRAW(easy, 10.00);
//
//     //   FUNCTION_YIELD(savins);
//
//        FUNCTION_TURN_MONTH(easy);
//
//
//        List<Agency> agencia = new ArrayList<Agency>();
//
//        agencia.add(agencia1);
//
//        int inteiro = 1;
//
//        Agency ageciaTeste = new Agency(inteiro);
//
//        System.out.println(agencia.indexOf(ageciaTeste));
//
//        List<Client> lista = new ArrayList<Client>();
//
//        lista.add(cliente00);
//        lista.add(cliente01);
//
//        System.out.println("saida");
//
//        System.out.println(verCliente(lista, "996828421-16"));
//

    }


}
