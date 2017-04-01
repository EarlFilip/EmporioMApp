package com.example.athena.emporiomapp;

import java.util.List;

public class Usuario {
    private Integer id;
    private String email;
    private String senha;
    private List<Cliente> clientes;

    public Usuario() {
    }

    public Usuario(Integer pId, String pEmail, String pSenha) {
        Usuario usuario = new Usuario();
        this.id = pId;
        this.email = pEmail;
        this.senha = pSenha;
    }

    //region Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
    //endregion

    @Override
    public String toString() {
        return "Usuario{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", senha='" + senha + '\'' +
                '}';
    }
}
