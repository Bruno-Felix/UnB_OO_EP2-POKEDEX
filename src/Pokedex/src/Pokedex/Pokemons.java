package Pokedex;

// Ler ListaPokemonTodos e separar em Lista(Tipo)
// Busca por Nome(ListaTodos) FEITO
// Buscar por Tipo(Lista(Tipo)) FEITO

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Pokemons {
    
    private String Id;
    private String Name;//Nome do Pokemom
    private String Type1;//Tipo 1 do Pokemon
    private String Type2;//Tipo 2 do Pokemon
    private String Total;
    private String HP;//Vida do Pokemon
    private String Attack;//Ataque do Pokemon
    private String Defense;//Defesa do Pokemon
    private String Sp_Atk;
    private String Sp_Def;
    private String Speed;//Velocidade do Pokemon
    private String Genetation;
    private String Legendary;//Pokemon Legado, Sim ou Não

    
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
                    System.out.println("\n------------\nId: " + j + "\nNome:" + Lista.get(j).getName()
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

    
    public String getId() {
        return Id;
    }

    public void setId(String Id) {
        this.Id = Id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getType1() {
        return Type1;
    }

    public void setType1(String Type1) {
        this.Type1 = Type1;
    }

    public String getType2() {
        return Type2;
    }

    public void setType2(String Type2) {
        this.Type2 = Type2;
    }

    public String getTotal() {
        return Total;
    }

    public void setTotal(String Total) {
        this.Total = Total;
    }

    public String getHP() {
        return HP;
    }

    public void setHP(String HP) {
        this.HP = HP;
    }

    public String getAttack() {
        return Attack;
    }

    public void setAttack(String Attack) {
        this.Attack = Attack;
    }

    public String getDefense() {
        return Defense;
    }

    public void setDefense(String Defense) {
        this.Defense = Defense;
    }

    public String getSp_Atk() {
        return Sp_Atk;
    }

    public void setSp_Atk(String Sp_Atk) {
        this.Sp_Atk = Sp_Atk;
    }

    public String getSp_Def() {
        return Sp_Def;
    }

    public void setSp_Def(String Sp_Def) {
        this.Sp_Def = Sp_Def;
    }

    public String getSpeed() {
        return Speed;
    }

    public void setSpeed(String Speed) {
        this.Speed = Speed;
    }

    public String getGenetation() {
        return Genetation;
    }

    public void setGenetation(String Genetation) {
        this.Genetation = Genetation;
    }

    public String getLegendary() {
        return Legendary;
    }

    public void setLegendary(String Legendary) {
        this.Legendary = Legendary;
    }
    
     public Pokemons(){}
}