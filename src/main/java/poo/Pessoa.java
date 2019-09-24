package poo;

import java.time.LocalDate;

public class Pessoa {

    private String nome;
    private  String sobrenome;
    private LocalDate dataNasc;
    private Telefone telefones;
    private Email emails;

    public Pessoa(String nome, String sobrenome, LocalDate dataNasc) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.dataNasc = dataNasc;
    }

    public boolean addTelefone(String r, String n){
        return true;
    }

    public boolean addEmail(String r, String e){
        return true;
    }

    public boolean removeTelefone(String r){
        return true;
    }

    public boolean removeEmail(String r, String n){
        return true;
    }

    public boolean updateTelefone(String r, String n){
        return true;
    }

    public boolean updateEmail(String r, String e){
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
