package com.example.athena.emporiomapp;

public class Fornecedor {

    private int id;
    private String companhia;
    private String cnpj;
    private String contato;
    private String cargo;
    private String fone;
    private String homepg;
    private Usuario usuario;

    public Fornecedor() {
    }

    public Fornecedor(int id, String companhia, String cnpj, String contato, String cargo, String fone, String homepg, Usuario usuario) {
        this.id = id;
        this.companhia = companhia;
        this.cnpj = cnpj;
        this.contato = contato;
        this.cargo = cargo;
        this.fone = fone;
        this.homepg = homepg;
        this.usuario = usuario;
    }

    //region Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCompanhia() {
        return companhia;
    }

    public void setCompanhia(String companhia) {
        this.companhia = companhia;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getHomepg() {
        return homepg;
    }

    public void setHomepg(String homepg) {
        this.homepg = homepg;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    //endregion


    @Override
    public String toString() {
        return "Fornecedor{" +
                "id=" + id +
                ", companhia='" + companhia + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", contato='" + contato + '\'' +
                ", cargo='" + cargo + '\'' +
                ", fone='" + fone + '\'' +
                ", homepg='" + homepg + '\'' +
                ", usuario=" + usuario +
                '}';
    }
}
