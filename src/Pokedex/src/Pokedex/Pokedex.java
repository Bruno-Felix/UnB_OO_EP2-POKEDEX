package Pokedex;

// Menu

import java.io.IOException;
import java.util.ArrayList;

public class Pokedex {
	public static void main(String[] args) throws IOException{
            Reader classReader = new Reader();
            Pokemons classPokemons = new Pokemons();
            Treinador classTreinador = new Treinador();
            
            //Método de Leitura e Criação da ListaListaPokemonTodos
            ArrayList<Pokemons> ListaPokemonTodos = classReader.LeituraArquivoCSV();
            
            //Método de Leitura e Criação da ListaTreinadores
            ArrayList<Treinador> auxListaTreinadores = classTreinador.LerArquivoTreinadores();
            ArrayList<Treinador> ListaTreinadores = classTreinador.cadastrarTreinador(auxListaTreinadores);
                    
            for(int i=0; i<ListaTreinadores.size(); i++){
              
              System.out.println("Nome: " + ListaTreinadores.get(i).getNome() +
                                 "\nIdade: " + ListaTreinadores.get(i).getIdade());
            }
            
            //Métudo buscarPorNome Função Buscar Nome
//            boolean auxBuscarPorNome;
//            boolean auxBurscarPorTipo;
//            
//            do{
//                String buscaNome = JOptionPane.showInputDialog("Insira Nome:");
//                auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, buscaNome);
//            }
//            while(auxBuscarPorNome);
//            
//            do{
//                String buscaTipo = JOptionPane.showInputDialog("Insira Tipo:");
//                auxBurscarPorTipo = classPokemons.buscarPorTipo(ListaPokemonTodos, buscaTipo);
//            }
//            while(auxBurscarPorTipo);
        }
}
