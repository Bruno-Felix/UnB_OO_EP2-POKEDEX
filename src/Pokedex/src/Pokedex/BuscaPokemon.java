package Pokedex;

import java.util.ArrayList;
import javax.swing.JOptionPane;


public class BuscaPokemon extends Pokemons{
    
    public boolean buscarPorNome(ArrayList<Pokemons> Lista, String buscaNome){
        boolean encontrado = false;
        int i=0;
        while(encontrado == false && i<Lista.size()){
            if(Lista.get(i).getName().compareToIgnoreCase(buscaNome)==0){
                encontrado = true;
            }
            else{
                i++;
            }
        }
        
        if(encontrado){
                    JOptionPane.showMessageDialog(null, "------------\nNome:" + Lista.get(i).getName()
                                                                  + "\nAtaque:" + Lista.get(i).getAttack()
                                                                  + "\nDefesa: " + Lista.get(i).getDefense());
            
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Nome não encontrado, por favor Buscar Novamente!");
            
            return true;
        }
    }
    

    public boolean buscarPorTipo(ArrayList<Pokemons> Lista, String buscaTipo){
        boolean encontrado = false;
        int i=0;
        while(encontrado == false && i<Lista.size()){
            if(Lista.get(i).getType1().compareToIgnoreCase(buscaTipo)==0){
                encontrado = true;
            }
            else{
                i++;
            }
        }
        
        if(encontrado){
            for(int j=0; j<Lista.size(); j++){
                if(Lista.get(j).getType1().compareToIgnoreCase(buscaTipo)==0){
                    JOptionPane.showMessageDialog(null, "\n------------\nId: " + j + "\nNome:" + Lista.get(j).getName()
                                                                    + "\nAtaque:" + Lista.get(j).getAttack()
                                                                    + "\nDefesa: " + Lista.get(j).getDefense());
                }     
            }
            
            return false;
        }
        else{
            JOptionPane.showMessageDialog(null, "Nome não encontrado, por favor Buscar Novamente!");
            
            return true;
        }
    }
    
}
