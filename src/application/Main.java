package application;

import control.SearchList;
import model.entities.Account;
import model.entities.Address;
import model.entities.Agency;
import model.entities.Client;
import model.enums.ClientType;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

import static control.ControlFunctionOutBank.verAgencia;

public class Main extends SearchList {

    public static void main(String[] args) throws ParseException { //tr

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Agency> arrayAgency = new ArrayList<Agency>();
        List<Client> arrayClient = new ArrayList<Client>();
        List<Account> arrayListAccount = new ArrayList<Account>();

        String nome, nomePais, nomeRua, nomeCidade, nomeBairro, nomeCep, nomeEstado, cpf, tipoCliente;
        int numero, numAGencia;
        char tipoConta;
        int opt;
        Date nascimento;
        double valor;

        System.out.print("Digite a opcao desejada: ");
        opt = teclado.nextInt();


         while (opt != -1) {
                switch (opt) {
                    case 2:
                     System.out.print("NOME DA AGENCIA: ");
                     teclado.nextLine();
                     nome = teclado.nextLine();
                     System.out.print("NUMERO AGENCIA: ");
                     numAGencia = teclado.nextInt();


                    if(verAgencia(arrayAgency, numAGencia) == true) {
                        System.out.println("Agencia já cadastrada");
                    }
                    else {
                        System.out.print("PAIS: ");
                        teclado.nextLine();
                        nomePais = teclado.nextLine();
                        System.out.print("ESTADO: ");
                        nomeEstado = teclado.nextLine();
                        System.out.print("CIDADE: ");
                        nomeCidade = teclado.nextLine();
                        System.out.print("RUA: ");
                        nomeRua = teclado.nextLine();
                        System.out.print("BAIRRO: ");
                        nomeBairro = teclado.nextLine();
                        System.out.print("CEP: ");
                        nomeCep = teclado.nextLine();
                        System.out.print("NUMERO: ");
                        numero = teclado.nextInt();

                        arrayAgency.add(new Agency(numAGencia, nome, new Address(nomePais, nomeEstado, nomeCidade, nomeRua, nomeBairro, nomeCep, numero)));;
                    }
                    break;


                   /*
                    case 3:
                        System.out.print("TIPO DA CONTA: (C - CONTA CORRENTE, P - POUPANCA, F: FACIL");
                        teclado.next();
                        tipoConta = teclado.next().charAt(0);
                        System.out.print("CPF - CLIENTE: ");
                        cpf = teclado.nextLine();

                        //colocar teste de CPF

                        System.out.print("PAIS: ");
                        teclado.next();
                        nomePais = teclado.nextLine();
                        System.out.print("ESTADO: ");
                        nomeEstado = teclado.nextLine();
                        System.out.print("CIDADE: ");
                        nomeCidade = teclado.nextLine();
                        System.out.print("RUA: ");
                        nomeRua = teclado.nextLine();
                        System.out.print("BAIRRO: ");
                        nomeBairro = teclado.nextLine();
                        System.out.print("CEP: ");
                        nomeCep = teclado.nextLine();
                        System.out.print("NUMERO: ");
                        numero = teclado.nextInt();
                        nascimento = sdf.parse(teclado.nextLine());
                        System.out.print("TIPO DE CLIENTE: ");
                        tipoCliente = teclado.nextLine();
                        numAGencia = teclado.nextInt();

                        teste de agencia

                        if(tipoConta == 'C'){

                        }

                    */


                 default:
                        System.err.println("OPCAO INVALIDA!");
                        System.out.print("DIGITE NOVAMENTE: ");
                        break;
                }

                System.out.print("Digite a opcao desejada: ");
                opt = teclado.nextInt();
        }

        System.out.println(arrayAgency);

    }


}
