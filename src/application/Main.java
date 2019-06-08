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

import static control.ControlFunctionOutBank.*;

public class Main extends SearchList {

    public static void main(String[] args) throws ParseException { //tr

        Scanner teclado = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Agency> arrayAgency = new ArrayList<Agency>();
        List<Client> arrayClient = new ArrayList<Client>();
        List<Account> arrayListAccount = new ArrayList<Account>();

        String nome, nomePais, nomeRua, nomeCidade, nomeBairro, nomeCep, nomeEstado, cpf, tipoCliente;
        int numero, numAgencia;
        char tipoConta;
        int opt;
        Date nascimento;
        double valor;

        System.out.print("Digite a opcao desejada: ");
        opt = teclado.nextInt();


         while (opt != -1) {
                switch (opt) {
                    // CADASTRO AGENCIA
                    case 2:
                     Agency agencia;
                     System.out.print("NOME DA AGENCIA: ");
                     teclado.nextLine();
                     nome = teclado.nextLine();
                     System.out.print("NUMERO AGENCIA: ");
                     numAgencia = teclado.nextInt();

                     System.out.println(verAgencia(arrayAgency,numAgencia));
                     //Teste da Agencia
                    agencia = verAgencia(arrayAgency,numAgencia);
                    if(agencia != null) {
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

                        arrayAgency.add(new Agency(numAgencia, nome, new Address(nomePais, nomeEstado, nomeCidade,
                                nomeRua, nomeBairro, nomeCep, numero)));
                    }
                    break;

                    // CADASTRO CLIENTE E CONTA
                    case 3:
                        Client client;

                        teclado.nextLine();
                        System.out.print("TIPO DA CONTA: (C - CONTA CORRENTE, P - POUPANCA, F-  FACIL: ");
                        tipoConta = teclado.next().charAt(0);
                        System.out.print("CPF - CLIENTE: ");
                        teclado.nextLine();
                        cpf = teclado.nextLine();

                        // Verificar CPF
                        client = verCliente(arrayClient, cpf);
                        if(verCliente(arrayClient, cpf) == null){

                            System.out.print("NOME DO CLIENTE: ");
                            nome = teclado.nextLine();
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
                            System.out.print("DATA DE NASCIMENTO: ");
                            teclado.nextLine();
                            nascimento = sdf.parse(teclado.nextLine());

                            //ARRUMAR!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

                           // System.out.println("TIPO DE CLIENTE (TRADICONAL/PREMIUM");

                            client = new Client(cpf, nome, nascimento, new Address(nomePais, nomeEstado, nomeCidade,
                                    nomeRua, nomeBairro, nomeCep, numero), ClientType.TRADICIONAL);

                            arrayClient.add(client);
                        }
                        else {
                            System.out.println("Cliente cadastrado!");
                        }

                        if(tipoConta != 'F') {
                            System.out.print("AGENCIA: ");
                            System.out.println(arrayAgency);
                            numAgencia = teclado.nextInt();
                            agencia = verAgencia(arrayAgency, numAgencia);
                        }
                        else agencia = null;

                        System.out.println(agencia);
                        System.out.println(client);

                        Account account = startAccount(agencia, client, tipoConta);
                        arrayListAccount.add(account);

                        System.out.print("DIGITE VALOR DE DEPOSITO INICIAL: R$ ");
                        valor = teclado.nextDouble();
                        account.deposit(valor);

                        System.out.println(arrayListAccount);
                        System.out.println(account);
                        break;

                    case 4:
                        System.out.print("DIGITE O NUMERO DA AGENCIA: ");
                        numAgencia = teclado.nextInt();
                        System.out.print("DIGITE O NUMERO DA CONTA: ");
                        numero = teclado.nextInt();
                        System.out.print("DIGITE O VALOR DE SAQUE: R$");
                        valor = teclado.nextDouble();
                        saque(arrayListAccount, numAgencia, numero, valor);
                        break;

                    case 5:
                        System.out.print("DIGITE O NUMERO DA AGENCIA: ");
                        numAgencia = teclado.nextInt();
                        System.out.print("DIGITE O NUMERO DA CONTA: ");
                        numero = teclado.nextInt();
                        System.out.print("DIGITE O VALOR DE SAQUE: R$");
                        valor = teclado.nextDouble();
                        deposito(arrayListAccount, numAgencia, numero, valor);
                        break;


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
