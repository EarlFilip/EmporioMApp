package com.example.athena.emporiomapp;

public class Login {
    public Login() {
    }

    public Login(String pEmail, String pSenha) {
        this.email = pEmail;
        this.senha = pSenha;
    }

    private String email;
    private String senha;

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
}
