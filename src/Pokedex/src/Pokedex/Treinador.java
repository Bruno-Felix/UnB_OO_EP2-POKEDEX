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
            
            ListaTreinadores.add(treinador);
         }
        
        return ListaTreinadores;
    }
    
    public ArrayList<Treinador> cadastrarTreinador(ArrayList<Treinador> Lista) throws IOException{
        
        Treinador classTreinador = new Treinador();
        
        Lista = classTreinador.LerArquivoTreinadores();
        
        Treinador treinador = new Treinador();
        
        String inserirNome = JOptionPane.showInputDialog("Insira Nome:");
        String inserirIdade = JOptionPane.showInputDialog("Insira Idade:");
        
        treinador.setNome(inserirNome);
        treinador.setIdade(inserirIdade);
        
        Lista.add(treinador);
        
        String linha = "";
        
        try (BufferedWriter buffWrite = new BufferedWriter(new FileWriter("d:\\treinadores.txt"))) {
            PrintWriter gravarArq = new PrintWriter(buffWrite);
            
            Scanner in = new Scanner(System.in);
            
            for(int i=0; i<Lista.size(); i++){
                
                gravarArq.printf(Lista.get(i).getNome() + "," + Lista.get(i).getIdade() + "\n");
                
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
   
    
    public Treinador(){}
    
}
