package model.entities;

public class Address {

    private String pais;
    private String estado;
    private String cidade;
    private String endereco;
    private String bairro;
    private String cep;
    private Integer numero;

    public Address(String pais, String estado, String cidade, String endereco, String bairro, String cep, Integer numero) {
        this.pais = pais;
        this.estado = estado;
        this.cidade = cidade;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cep = cep;
        this.numero = numero;
    }

    public Address(){}

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    @Override
    public String toString(){
        StringBuilder enderecos = new StringBuilder();

        enderecos.append("Endereço: " + endereco + ", ");
        enderecos.append(numero + " ");
        enderecos.append("Bairro: " + bairro +"\n");
        enderecos.append(cep + " ");
        enderecos.append(cidade + " -- ");
        enderecos.append(estado + " ");
        enderecos.append(pais +"\n");

        return enderecos.toString();
    }
}
