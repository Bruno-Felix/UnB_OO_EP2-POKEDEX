package Pokedex;

// Ler ListaPokemonTodos e separar em Lista(Tipo)
// Busca por Nome(ListaTodos) FEITO
// Buscar por Tipo(Lista(Tipo)) FEITO


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
    
    Reader classReader = new Reader();
    Treinador classTreinador = new Treinador();
    
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