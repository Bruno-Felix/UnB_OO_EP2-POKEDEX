package Pokedex;

// Menu

import javax.swing.JOptionPane;
import java.util.ArrayList;

public class Pokedex {
	public static void main(String[] args){
            Reader classReader = new Reader();
            Pokemons classPokemons = new Pokemons();
            //Reader.LeituraArquivo();
            
            //Método de Leitura e Criação da ListaListaPokemonTodos
            ArrayList<Pokemons> ListaPokemonTodos = classReader.LeituraArquivo();
            
            //for(int i=0; i<ListaPokemonTodos.size(); i++){
              //System.out.println("Leu!");
            //}
            
            //Métudo buscarPorNome Função Buscar Nome
            boolean auxBuscarPorNome;
            boolean auxBurscarPorTipo;
            
            do{
                String buscaNome = JOptionPane.showInputDialog("Insira Nome:");
                auxBuscarPorNome = classPokemons.buscarPorNome(ListaPokemonTodos, buscaNome);
            }
            while(auxBuscarPorNome);
            
            do{
                String buscaTipo = JOptionPane.showInputDialog("Insira Tipo:");
                auxBurscarPorTipo = classPokemons.buscarPorTipo(ListaPokemonTodos, buscaTipo);
            }
            while(auxBurscarPorTipo);
        }
}
