package Pokedex;

// Menu

import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class PokedexMain {
	public static void main(String[] args) throws IOException{
            Reader classReader = new Reader();
            BuscaPokemon classBuscarPokemon = new BuscaPokemon();
            CadastroTreinador classCadastroTreinador = new CadastroTreinador();
            
            //Método de Leitura e Criação da ListaListaPokemonTodos
            ArrayList<Pokemons> ListaPokemonTodos = classReader.LeituraArquivoCSV();
            ArrayList<Treinador> ListaTreinadores = classCadastroTreinador.LerArquivoTreinadores();
            //ListaTreinadores = classCadastroTreinador.LerArquivoTreinadores();
            
            //Menu de Opções
            int aux = 0;
            String escolha = JOptionPane.showInputDialog("[1] Buscar por Nome;\n"
                                                       + "[2] Buscar por Tipo;\n"
                                                       + "[3] Cadastrar Treinador;\n"
                                                       + "[4] Buscar Treinador.\n"
                                                       );
            
            while((aux == 0 && "2".compareToIgnoreCase(escolha)==0) || (aux == 0 && "1".compareToIgnoreCase(escolha)==0) || (aux == 0 && "3".compareToIgnoreCase(escolha)==0) || (aux == 0 && "4".compareToIgnoreCase(escolha)==0)){
            
                //Método classPokemons.buscarPorNome Funcionalidade: Buscar Pokemon por Nome
                if("2".compareToIgnoreCase(escolha)==0 ){
                    
                    boolean auxBuscarPorTipo;
                    aux = 1;

                    do{
                        String buscaTipo = JOptionPane.showInputDialog("Insira Tipo:");
                        auxBuscarPorTipo = classBuscarPokemon.buscarPorTipo(ListaPokemonTodos, buscaTipo);
                    }while(auxBuscarPorTipo);
                }
                
                //Método classPokemons.buscarPorTipo Funcionalidade: Buscar Pokemon por Tipo
                else if("1".compareToIgnoreCase(escolha)==0){
                    boolean auxBuscarPorNome;
                    aux = 1;    
                    
                    do{
                        String buscaNome = JOptionPane.showInputDialog("Insira Nome:");
                        auxBuscarPorNome = classBuscarPokemon.buscarPorNome(ListaPokemonTodos, buscaNome);
                    }while(auxBuscarPorNome);
                }
                //Método classTreinador.buscarPorTipo Funcionalidade: Cadastrar Treinador
                else if("3".compareToIgnoreCase(escolha)==0){
                    
                    aux = 1;
                    
                    //Método de Leitura e Criação da ListaTreinadores
                    ListaTreinadores = classCadastroTreinador.cadastrarTreinador(ListaTreinadores);

                    for(int i=0; i<ListaTreinadores.size(); i++){

                        System.out.println("\nNome: " + ListaTreinadores.get(i).getNome() +
                                           "\nIdade: " + ListaTreinadores.get(i).getIdade() +
                                           "\nPokemon 1: " + ListaTreinadores.get(i).getPokemon1() +
                                           "\nPokemon 2: " + ListaTreinadores.get(i).getPokemon2() +
                                           "\nPokemon 3: " + ListaTreinadores.get(i).getPokemon3() +
                                           "\nPokemon 1: " + ListaTreinadores.get(i).getPokemon4() +
                                           "\nPokemon 1: " + ListaTreinadores.get(i).getPokemon5());
                    }
                }
                
                else if("4".compareToIgnoreCase(escolha)==0){
                    boolean auxBuscarPorNome;
                    aux = 1;    
                    
                    do{
                        String buscaNome = JOptionPane.showInputDialog("Insira Nome:");
                        auxBuscarPorNome = classCadastroTreinador.buscarTreinadorPorNome(ListaTreinadores, buscaNome);
                    }while(auxBuscarPorNome);
                }
            }
        }
}
