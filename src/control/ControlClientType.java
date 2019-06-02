package control;

import model.entities.Account;
import model.entities.TableRate;
import model.enums.ClientType;

public class ControlClientType {

    public static double VALUE_CLIENT_TYPE(Account account){
        if(account.getClient().getClasse().equals(ClientType.TRADICIONAL)) return TableRate.TAX_CLIENT_TRADITIONAL;
        else return TableRate.TAX_CLIENT_PREMIUM;
    }
}
