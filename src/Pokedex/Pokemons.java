package Pokedex;

// Ler ListaPokemonTodos e separar em Lista(Tipo)
// Busca por Nome(ListaTodos)
// Buscar por Tipo(Lista(Tipo))

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
    private String Experence;
    private String Height;//Altura do Pokemon
    private String Weight;//Peso do Pokemon
    private String Abilitie_1;//Abilidade 1 do Pokemon
    private String Abilitie_2;//Abilidade 2 do Pokemon
    private String Abilitie_3;//Abilidade 3 do Pokemon
    private String Move_1;
    private String Move_2;
    private String Move_3;
    private String Move_4;
    private String Move_5;
    private String Move_6;
    private String Move_7;
   
    public Pokemons(){}

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

    public String getExperence() {
        return Experence;
    }

    public void setExperence(String Experence) {
        this.Experence = Experence;
    }

    public String getHeight() {
        return Height;
    }

    public void setHeight(String Height) {
        this.Height = Height;
    }

    public String getWeight() {
        return Weight;
    }

    public void setWeight(String Weight) {
        this.Weight = Weight;
    }

    public String getAbilitie_1() {
        return Abilitie_1;
    }

    public void setAbilitie_1(String Abilitie_1) {
        this.Abilitie_1 = Abilitie_1;
    }

    public String getAbilitie_2() {
        return Abilitie_2;
    }

    public void setAbilitie_2(String Abilitie_2) {
        this.Abilitie_2 = Abilitie_2;
    }

    public String getAbilitie_3() {
        return Abilitie_3;
    }

    public void setAbilitie_3(String Abilitie_3) {
        this.Abilitie_3 = Abilitie_3;
    }

    public String getMove_1() {
        return Move_1;
    }

    public void setMove_1(String Move_1) {
        this.Move_1 = Move_1;
    }

    public String getMove_2() {
        return Move_2;
    }

    public void setMove_2(String Move_2) {
        this.Move_2 = Move_2;
    }

    public String getMove_3() {
        return Move_3;
    }

    public void setMove_3(String Move_3) {
        this.Move_3 = Move_3;
    }

    public String getMove_4() {
        return Move_4;
    }

    public void setMove_4(String Move_4) {
        this.Move_4 = Move_4;
    }

    public String getMove_5() {
        return Move_5;
    }

    public void setMove_5(String Move_5) {
        this.Move_5 = Move_5;
    }

    public String getMove_6() {
        return Move_6;
    }

    public void setMove_6(String Move_6) {
        this.Move_6 = Move_6;
    }

    public String getMove_7() {
        return Move_7;
    }

    public void setMove_7(String Move_7) {
        this.Move_7 = Move_7;
    }
}