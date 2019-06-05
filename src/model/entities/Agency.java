package model.entities;

public class Agency implements Comparable<Agency>{
    private Integer codAgency;
    private String nameAgency;
    private Address addAgency;

    public Agency(){}

    public Agency(Integer codAgency, String nameAgency, Address addAgency) {
        this.codAgency = codAgency;
        this.nameAgency = nameAgency;
        this.addAgency = addAgency;
    }

    public Agency(int codAgency) {
        this.codAgency = codAgency;
    }

    public Integer getCodAgency() {
        return codAgency;
    }

    public void setCodAgency(Integer codAgency) {
        this.codAgency = codAgency;
    }

    public String getNameAgency() {
        return nameAgency;
    }

    public void setNameAgency(String nameAgency) {
        this.nameAgency = nameAgency;
    }

    public Address getAddAgency() {
        return addAgency;
    }

    public void setAddAgency(Address addAgency) {
        this.addAgency = addAgency;
    }

    @Override
    public String toString(){
        StringBuilder agencia = new StringBuilder();

        agencia.append("AGÊNCIA: ");
        agencia.append(nameAgency + "\t");
        agencia.append("NUMERO: ");
        agencia.append(codAgency);

        return agencia.toString();
    }

    @Override
    public int compareTo(Agency agency){
        if(codAgency > agency.getCodAgency()) return 1;
        if(codAgency < agency.getCodAgency()) return -1;
        else return 0;
    }

    @Override
    public boolean equals(Object agency){
        if(agency instanceof Agency){
            if(codAgency == ((Agency)agency).codAgency) return true;
        }
        return false;
    }

}
