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
    
            
    public ArrayList<Treinador> LerArquivoTreinadores() throws IOException{
        
        String linha;
        BufferedReader conteudoTreinador;
        String csvSeparadorCampo = ",";
        String treinadorArquivo = "d:\\treinadores.txt";
        
        ArrayList<Treinador> ListaTreinadores = new ArrayList<>();
        
        conteudoTreinador = new BufferedReader(new FileReader(treinadorArquivo));
              
        while((linha = conteudoTreinador.readLine()) != null){
            
            String[] aux2 = linha.split(csvSeparadorCampo);
             
            Treinador treinador = new Treinador();
            
            treinador.setNome(aux2[0]);
            treinador.setIdade(aux2[1]);
            treinador.setPokemon1(aux2[2]);
            treinador.setPokemon2(aux2[3]);
            treinador.setPokemon3(aux2[4]);
            treinador.setPokemon4(aux2[5]);
            treinador.setPokemon5(aux2[6]);
            
            ListaTreinadores.add(treinador);
         }
        
        return ListaTreinadores;
    }
    
    public ArrayList<Treinador> cadastrarTreinador(ArrayList<Treinador> Lista) throws IOException{
        
        Reader classReader = new Reader();
        Pokemons classPokemons = new Pokemons();
        
        //Método de Leitura e Criação da ListaListaPokemonTodos
        ArrayList<Pokemons> ListaPokemonTodos = classReader.LeituraArquivoCSV();
                    
        
        Treinador classTreinador = new Treinador();
        
        Lista = classTreinador.LerArquivoTreinadores();
        
        Treinador treinador = new Treinador();
        
        String inserirNome = JOptionPane.showInputDialog("Insira Nome:");
        String inserirIdade = JOptionPane.showInputDialog("Insira Idade:");
        
        boolean auxBuscarPorNome;
        String inserirPokemon1 = null;
        String inserirPokemon2 = null;
        String inserirPokemon3 = null;
        String inserirPokemon4 = null;
        String inserirPokemon5 = null;

        do{
           inserirPokemon1 = JOptionPane.showInputDialog("Insira Pokemon1:");
           auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, inserirPokemon1);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon2 = JOptionPane.showInputDialog("Insira Pokemon2:");
           auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, inserirPokemon2);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon3 = JOptionPane.showInputDialog("Insira Pokemon3:");
           auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, inserirPokemon3);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon4 = JOptionPane.showInputDialog("Insira Pokemon4:");
           auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, inserirPokemon4);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon5 = JOptionPane.showInputDialog("Insira Pokemon5:");
           auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, inserirPokemon5);
        }
        while(auxBuscarPorNome);
        
        treinador.setNome(inserirNome);
        treinador.setIdade(inserirIdade);
        treinador.setPokemon1(inserirPokemon1);
        treinador.setPokemon2(inserirPokemon2);
        treinador.setPokemon3(inserirPokemon3);
        treinador.setPokemon4(inserirPokemon4);
        treinador.setPokemon5(inserirPokemon5);
        
        Lista.add(treinador);
        
        
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("d:\\treinadores.txt"))) {
            PrintWriter gravarArq = new PrintWriter(buffWrite);
            
            Scanner in = new Scanner(System.in);
            
            for(int i=0; i<Lista.size(); i++){
                
                gravarArq.printf(Lista.get(i).getNome() + "," + Lista.get(i).getIdade() + "," + Lista.get(i).getPokemon1() + "," + Lista.get(i).getPokemon2() + "," + Lista.get(i).getPokemon3() + "," + Lista.get(i).getPokemon4() + "," + Lista.get(i).getPokemon5() + "\n");
                
                System.out.println("Nome: " + Lista.get(i).getNome() +
                                 "\nIdade: " + Lista.get(i).getIdade());
                
                System.out.printf("Gravada com sucesso em \"d:\\treinadores.txt\".\n\n");
            }
        }
        
        return Lista;
    }

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
