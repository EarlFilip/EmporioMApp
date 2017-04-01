package com.example.athena.emporiomapp;

public class Cliente {
    private Integer id;
    private Usuario usuario;
    //public Integer id_usuario;
    private String nome;
    private String celular;
    private String fone;
    private String cpf;

    public Cliente() {
    }

    public Cliente(Integer pId, Usuario pUsuario, String pNome, String pCelular, String pFone, String pCpf) {
        this.id = pId;
        this.usuario = pUsuario;
        this.nome = pNome;
        this.celular = pCelular;
        this.fone = pFone;
        this.cpf = pCpf;
    }

    //region Getters and Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
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
        return "Cliente{" +
                "id=" + id +
                ", usuario=" + usuario +
                ", nome='" + nome + '\'' +
                ", celular='" + celular + '\'' +
                ", fone='" + fone + '\'' +
                ", cpf='" + cpf + '\'' +
                '}';
    }
}
