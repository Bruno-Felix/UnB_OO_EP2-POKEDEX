package Pokedex;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class CadastroTreinador extends Treinador{
    
    BuscaPokemon classBuscarPokemon = new BuscaPokemon();
    
    public ArrayList<Treinador> LerArquivoTreinadores(){
        
        
        String linha;
        BufferedReader conteudoTreinador;
        String csvSeparadorCampo = ",";
        String treinadorArquivo = "d:\\treinadores.txt";
        
        ArrayList<Treinador> ListaTreinadores = new ArrayList<>();
        
        try {
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
        } catch (IOException ex) {
            Logger.getLogger(CadastroTreinador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return ListaTreinadores;
    }
    
    public ArrayList<Treinador> cadastrarTreinador(ArrayList<Treinador> Lista){
        
        Reader classReader = new Reader();
        //BuscaPokemon classBuscarPokemon = new BuscaPokemon();
        
        //Método de Leitura e Criação da ListaListaPokemonTodos
        ArrayList<Pokemons> ListaPokemonTodos = classReader.LeituraArquivoCSV();
                    
        
        Treinador classTreinador = new Treinador();
        
        //Lista = classTreinador.LerArquivoTreinadores();
        
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
           auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, inserirPokemon1);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon2 = JOptionPane.showInputDialog("Insira Pokemon2:");
           auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, inserirPokemon2);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon3 = JOptionPane.showInputDialog("Insira Pokemon3:");
           auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, inserirPokemon3);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon4 = JOptionPane.showInputDialog("Insira Pokemon4:");
           auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, inserirPokemon4);
        }
        while(auxBuscarPorNome);
        
        do{
           inserirPokemon5 = JOptionPane.showInputDialog("Insira Pokemon5:");
           auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, inserirPokemon5);
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
        
        
        try{
            
            BufferedWriter buffWrite = new BufferedWriter(new FileWriter("d:\\treinadores.txt"));
            
            PrintWriter gravarArq = new PrintWriter(buffWrite);
            
            Scanner in = new Scanner(System.in);
            
            for(int i=0; i<Lista.size(); i++){
                
                gravarArq.printf(Lista.get(i).getNome() + "," + Lista.get(i).getIdade() + "," + Lista.get(i).getPokemon1() + "," + Lista.get(i).getPokemon2() + "," + Lista.get(i).getPokemon3() + "," + Lista.get(i).getPokemon4() + "," + Lista.get(i).getPokemon5() + "\n");
            }
        } catch (IOException ex) {
            Logger.getLogger(CadastroTreinador.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return Lista;
    }

    public boolean buscarTreinadorPorNome(ArrayList<Treinador> Lista, String buscarNomeTreinador){
        boolean encontrado = false;
        int i=0;
        while(encontrado == false && i<Lista.size()){
            if(Lista.get(i).getNome().compareToIgnoreCase(buscarNomeTreinador)==0){
                encontrado = true;
            }
            else{
                i++;
            }
        }
        
        if(encontrado){
                    JOptionPane.showMessageDialog(null, "----------- \nNome: " + Lista.get(i).getNome()
                                                                  + "\nIdade: " + Lista.get(i).getIdade()
                                                                  + "\nPokemon 1:" + Lista.get(i).getPokemon1()
                                                                  + "\nPokemon 1:" + Lista.get(i).getPokemon2()
                                                                  + "\nPokemon 1:" + Lista.get(i).getPokemon3()
                                                                  + "\nPokemon 1:" + Lista.get(i).getPokemon4()
                                                                  + "\nPokemon 1:" + Lista.get(i).getPokemon5());
            
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Nome não encontrado, por favor Buscar Novamente!");
            
            return true;
        }
    }
}

