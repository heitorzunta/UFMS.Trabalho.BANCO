package application;

import model.entities.Address;
import model.entities.Agency;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        List<Agency> arrayAgency = new ArrayList<Agency>();

        int opt;

        System.out.print("Digite a opcao desejada: ");
        opt = teclado.nextInt();


         while (opt != -1) {
             try{
                switch (opt) {
                    case 2:
                        String nomeAgencia, nomePais, nomeRua, nomeCidade, nomeBairro, nomeCep, nomeEstado;
                        int numero, numAGencia;

                     System.out.print("NOME DA AGENCIA: ");
                     teclado.next();
                     nomeAgencia = teclado.nextLine();
                     System.out.print("NUMERO AGENCIA: ");
                     numAGencia = teclado.nextInt();
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
                     arrayAgency.add(new Agency(numAGencia, nomeAgencia, new Address(nomePais, nomeEstado, nomeCidade, nomeRua, nomeBairro, nomeCep, numero)));
                     break;

                 default:
                        System.err.println("OPCAO INVALIDA!");
                        System.out.print("DIGITE NOVAMENTE: ");
                        break;
                }

                opt = teclado.nextInt();

            } catch(InputMismatchException erro) {
                 erro.getMessage();
                 erro.getStackTrace();
                 opt = teclado.nextInt();
             }

        }

        System.out.println(arrayAgency);



    }


}
