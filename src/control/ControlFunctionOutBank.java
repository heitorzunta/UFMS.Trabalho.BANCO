package control;


import model.entities.Agency;

import java.util.List;

public class ControlFunctionOutBank {

    public static boolean verAgencia(List<Agency> agencia, int inteiro){
        Agency agenciaTeste = new Agency(inteiro);
        if(agencia.contains(agenciaTeste)) return true;
        else return false;
    }

 /*
    public void verAgencia(List<Agency> agencia, int inteiro){
        Agency agenciaTeste = new Agency(inteiro);
        int teste;

        teste = agencia.indexOf(agenciaTeste);
        if (teste != -1)  agenciaTeste = agencia.get(teste);

    }

  */

}
