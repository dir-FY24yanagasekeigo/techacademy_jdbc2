package dbSample.entity;

public class Country {
    
    // フィールドの定義
    private String name;
    private int population;
    
    // 引数のないコンストラクターを定義
    public Country() {
        
    }
    
    // 引数ありのコンストラクターを定義
    public Country(String name, int population) {
        this.name = name;
        this.population = population;
    }
    
    // getter/setter を置く
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public int getPopulation() {
        return population; 
    }
    
    public void setPopulation(int population) {
        this.population = population; 
    }

}
