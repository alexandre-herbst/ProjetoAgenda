package poo;

import java.util.ArrayList;

public class Agenda {

    private ArrayList<Pessoa> addPessoa;

    public void addPessoa(Pessoa p){

    }

    public boolean removePessoa(String n, String s){
        return true;
    }

    public boolean addTelefone(String r, String n, int pIndex){
        return true;
    }

    public boolean updateEmail(String r, String n, int pIndex){
        return true;
    }

    public boolean removeTelefone(String r, int pIndex){
        return true;
    }

    public boolean removeEmail(String r, int pIndex){
        return true;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
