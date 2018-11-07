package Pokedex;

//Leitura dos arquivosCSV
//Criação da ListaPokemonTodos

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Reader{

	public ArrayList<Pokemons> LeituraArquivoCSV(){
            
            //ArrayList<Pokemons> ListaPokemonTodos = new ArrayList();
            
            String csvArquivo1 = "../../data/csv_files/POKEMONS_DATA_1.csv";            
            BufferedReader conteudoCSV = null;
            String linha = "";
            String csvSeparadorCampo = ",";
            
            ArrayList<Pokemons> ListaPokemonTodos = new ArrayList<>();
            
            try{
                conteudoCSV = new BufferedReader(new FileReader(csvArquivo1));
      
                while((linha = conteudoCSV.readLine()) != null){
                    
                    String[] aux1 = linha.split(csvSeparadorCampo);
                   
                    Pokemons pokemon = new Pokemons();
                    
                    pokemon.setId(aux1[0]);
                    pokemon.setName(aux1[1]);
                    pokemon.setType1(aux1[2]);
                    pokemon.setType2(aux1[3]);
                    pokemon.setTotal(aux1[4]);
                    pokemon.setHP(aux1[5]);
                    pokemon.setAttack(aux1[6]);
                    pokemon.setDefense(aux1[7]);
                    pokemon.setSp_Atk(aux1[8]);
                    pokemon.setSp_Def(aux1[9]);
                    pokemon.setSpeed(aux1[10]);
                    pokemon.setGenetation(aux1[11]);
                    pokemon.setLegendary(aux1[12]);
                    
                    ListaPokemonTodos.add(pokemon);
                    //System.out.println("Leu!");
                }
               
            }
            catch(FileNotFoundException e ){
                System.out.println("Arquivo POKEMONS_DATA_1.csv não encontrado: \n"+e.getMessage());
            }
            catch(IOException e){
                System.out.println("IO Erro: \n"+e.getMessage());
            }
            
        return ListaPokemonTodos;
	}
}
