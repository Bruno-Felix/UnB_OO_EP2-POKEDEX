package Pokedex;

// Criar ListaTreinadores
// Cadastrar treinador em ListaTreinadores e criar uma lista vazia Lista(Treinador)
// Visualizar treinadores cadastrados(ListaTreinadores)
// Inserir Pokemons ao treinador selecionado(Lista(Treinador))
// Visualizar pokemons de Treinador(Lista(Treinador)

import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import javax.swing.JOptionPane;

public class Treinador {
    
    private String Nome;
    private String Idade;
    private String Pokemon1;
    private String Pokemon2;
    private String Pokemon3;
    private String Pokemon4;
    private String Pokemon5;
    

    public String getNome() {
        return Nome;
    }

    public void setNome(String Nome) {
        this.Nome = Nome;
    }

    public String getIdade() {
        return Idade;
    }

    public void setIdade(String Idade) {
        this.Idade = Idade;
    }
   
    public String getPokemon1() {
        return Pokemon1;
    }

    public void setPokemon1(String Pokemon1) {
        this.Pokemon1 = Pokemon1;
    }

    public String getPokemon2() {
        return Pokemon2;
    }

    public void setPokemon2(String Pokemon2) {
        this.Pokemon2 = Pokemon2;
    }

    public String getPokemon3() {
        return Pokemon3;
    }

    public void setPokemon3(String Pokemon3) {
        this.Pokemon3 = Pokemon3;
    }

    public String getPokemon4() {
        return Pokemon4;
    }

    public void setPokemon4(String Pokemon4) {
        this.Pokemon4 = Pokemon4;
    }

    public String getPokemon5() {
        return Pokemon5;
    }

    public void setPokemon5(String Pokemon5) {
        this.Pokemon5 = Pokemon5;
    }
    
    
    public Treinador(){}

}
